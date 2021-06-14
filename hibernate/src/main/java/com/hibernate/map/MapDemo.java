package com.hibernate.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.query.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		//Transaction t=session.beginTransaction();
		Question q1=new Question();
		q1.setQuestionId(1212);
		q1.setQuestion("What is Java?");
		
		Answer a1=new Answer(343, "Java is a prog lang");
		a1.setQuestion(q1);
		
		Answer a2=new Answer(344, "Java is an OOP lang");
		a2.setQuestion(q1);
		
		Answer a3=new Answer(345, "Java is user-friendly");
		a3.setQuestion(q1);
		
		List<Answer> list=new ArrayList<Answer>();
		list.add(a1);
		list.add(a2);
		list.add(a3);
		
		q1.setAnswers(list);

		Transaction t=session.beginTransaction();
		session.save(q1);
		t.commit();
		String query="select q.questionId,q.question,a.answer from Question as q INNER JOIN q.answers as a";
		Query q=session.createQuery(query);
		List<Object[]> questions=q.getResultList();
		for(Object[] obj:questions)
			System.out.println(Arrays.toString(obj));
		
		
		session.close();
		factory.close();
	}
}

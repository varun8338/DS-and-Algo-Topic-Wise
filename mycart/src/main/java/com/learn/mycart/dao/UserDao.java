package com.learn.mycart.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.learn.mycart.entities.User;

public class UserDao {
	private SessionFactory factory;

	public UserDao(SessionFactory factory) {
		this.factory = factory;
	}
	
	//get user by email and password
	public User getUserByEmailAndPassword(String userEmail,String userPassword) {
		User user=null;
		try {
			String query="from User where userEmail=:e and userPassword=:p";
			Session session= this.factory.openSession();
			Query q = session.createQuery(query);
			q.setParameter("e", userEmail);
			q.setParameter("p", userPassword);
			user=(User)q.uniqueResult();
			session.close();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return user;
	}
	
	public long getUserCount() {
		Session session=this.factory.openSession();
		Query q=session.createQuery("select count(1) from User");
		Long count =  (Long) q.uniqueResult();
		session.close();
		return count;
	}
	
	
	
}

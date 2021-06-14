package com.learn.mycart.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.learn.mycart.entities.Category;

public class CategoryDao {
	private SessionFactory factory;

	public CategoryDao(SessionFactory factory) {
		this.factory = factory;
	}
	
	public int saveCategory(Category cat) {
	
		Session session = this.factory.openSession();
		Transaction tx=session.beginTransaction();
		int catId=(Integer)session.save(cat);
		tx.commit();
		session.close();
		return catId;
	}
	
	public List<Category> getCategories(){
		Session session = this.factory.openSession();
		Query createQuery = session.createQuery("from Category");
		List<Category> list = createQuery.list();
		session.close();
		return list;
	}
	
	public Category getCategoryById(int id) {
		Session session=this.factory.openSession();
		Category category = session.get(Category.class, id);
		session.close();
		return category;
	}
	
	public long getCategoryCount() {
		Session session=this.factory.openSession();
		Query q=session.createQuery("select count(1) from Category");
		Long count = (Long) q.uniqueResult();
		session.close();
		return count;
	}
	
	
}

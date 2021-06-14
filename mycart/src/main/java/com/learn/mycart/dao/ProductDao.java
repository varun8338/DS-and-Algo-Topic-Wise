package com.learn.mycart.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.learn.mycart.entities.Product;

public class ProductDao {
	private SessionFactory factory;

	public ProductDao(SessionFactory factory) {
		this.factory = factory;
	}
	
	public int saveProduct(Product product) {
		Session session=this.factory.openSession();
		Transaction tx=session.beginTransaction();
		int pId = (Integer)session.save(product);
		tx.commit();
		session.close();
		return pId;
	}
	
	public List<Product> getAllProducts(){
		Session session=this.factory.openSession();
		Query<Product> createQuery = session.createQuery("from Product");
		List<Product> list = createQuery.list();
		return list;
	}
	
	public List<Product> getAllProductsById(int cid){
		Session session=this.factory.openSession();
		Query<Product> createQuery = session.createQuery("from Product as p where p.category.categoryId=:id");
		createQuery.setParameter("id", cid);
		List<Product> list = createQuery.list();
		return list;
	}
	
	
	public long getProductCount() {
		Session session=this.factory.openSession();
		Query q=session.createQuery("select count(1) from Product");
		Long count = (Long) q.uniqueResult();
		session.close();
		return count;
	}
	
	
}

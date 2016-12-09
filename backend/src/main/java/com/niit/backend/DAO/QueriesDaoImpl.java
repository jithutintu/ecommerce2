package com.niit.backend.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.niit.backend.model.Queries;



public class QueriesDaoImpl implements QueriesDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	public QueriesDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void addQuery(Queries queries) {
		Session session = sessionFactory.openSession();
		session.save(queries);
		session.close();
	}
}

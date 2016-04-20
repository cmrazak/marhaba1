package com.threeminds.marhaba.dao;

import java.io.Serializable;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;



public abstract class AbstractDao<PK extends Serializable, T> {
	
	private final Class<T> persistentClass;
	private Query hibernateQuery;
	
	@SuppressWarnings("unchecked")
	public AbstractDao(){
		this.persistentClass =(Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[1];
	}
	
	@Autowired
	private SessionFactory sessionFactory;

	protected Session getSession(){
		return sessionFactory.getCurrentSession();
	}

	@SuppressWarnings("unchecked")
	public T getByKey(PK key) {
		return (T) getSession().get(persistentClass, key);
	}

	public void persist(T entity) {
		getSession().persist(entity);
		
	}
	
	public void update(T entity) {
		getSession().update(entity);
		
	}
	
	public void delete(T entity) {
		getSession().delete(entity);
	}
	@SuppressWarnings("unchecked")
	protected  List<Object>executeQuery(){
		return getHibernateQuery().list();
	};
	
	protected Query createQuery(String query){
		setHibernateQuery(getSession().createQuery(query));
		return getHibernateQuery();
	}
	protected Criteria createEntityCriteria(){
		return getSession().createCriteria(persistentClass);
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;	
	}

	public Query getHibernateQuery() {
		return hibernateQuery;
	}

	public void setHibernateQuery(Query hibernateQuery) {
		this.hibernateQuery = hibernateQuery;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	

}

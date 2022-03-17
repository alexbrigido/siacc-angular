package br.gov.caixa.siacc.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Session;
 
public abstract class AbstractDao<T> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -513898119886993110L;

	private Class<T> type;

	@PersistenceContext 
	private EntityManager entityManager;

	public AbstractDao(Class<T> entityClass) {
		this.type = entityClass;
	}

	public AbstractDao() {
		Class<?> clazz = getClass();
		do {
			if (clazz.getSuperclass().equals(AbstractDao.class)) {
				break;
			}
		} while ((clazz = clazz.getSuperclass()) != null);

		this.type = (Class<T>) ((ParameterizedType) clazz.getGenericSuperclass()).getActualTypeArguments()[0];
	}

	public T findById(Long id) {
		return this.entityManager.find(type, id);
	}

	public List<T> findAll() {
		return createSession().createCriteria(type).list();
	}

	/*
	 * @Transactional public void remove(T object) {
	 * this.entityManager.remove(this.entityManager.getReference(this.type,
	 * object.getId())); }
	 */

	@Transactional
	public void create(T object) {
		this.entityManager.persist(object);
	}

	@Transactional
	public void update(T object) {
		this.entityManager.merge(object);
	}

	@Transactional
	public void save(T object) {
		// if (object.getId() == null) {
		// this.entityManager.persist(object);
		// } else {
		this.entityManager.merge(object);
		// }
	}

	protected Session createSession() {
		return (Session) this.entityManager.getDelegate();
	}

	protected EntityManager getEntityManager() {
		return this.entityManager;
	}

	protected Criteria getCriteria() {
		return createSession().createCriteria(type);
	}

}
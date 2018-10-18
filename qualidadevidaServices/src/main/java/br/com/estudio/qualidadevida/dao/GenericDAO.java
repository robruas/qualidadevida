package br.com.estudio.qualidadevida.dao;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NonUniqueResultException;
import javax.persistence.Query;

/**
 * Classe Generica para uma classe DAO
 * 
 * @author Arquitetura
 * @since Jan 13, 2017 12:32:36 AM
 * @version 1.0
 * @param <P> - Chave Primária
 * @param <T> Entidade
 */
public class GenericDAO<P, T> {

	private EntityManager entityManager;

	/**
	 * Construtor da classe GenericDAO
	 * 
	 * @param entityManager
	 */
	public GenericDAO(final EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	/**
	 * Metodo responsável por obter a entidade por id.
	 * 
	 * @author Arquitetura
	 * @since Jan 13, 2017 12:18:35 AM
	 * @param pk - Chave Primaria da entidade.
	 * @return Entity - Entidade consultada.
	 */
	@SuppressWarnings("unchecked")
	public T getById(final P pk) {
		return (T) this.entityManager.find(this.getTypeClass(), pk);
	}

	/**
	 * Metodo responsável por atualizar uma entidade.
	 * 
	 * @author Arquitetura
	 * @since Jan 13, 2017 12:18:43 AM
	 * @param entity - Entidade
	 * @return Entity - Entidade atualizada
	 */
	public T save(final T entity) {
		this.entityManager.persist(entity);
		return entity;
	}

	/**
	 * Metodo responsável por atualizar uma entidade.
	 * 
	 * @author Arquitetura
	 * @since Jan 13, 2017 12:30:06 AM
	 * @param entity - Entidade.
	 */
	public void update(final T entity) {
		this.entityManager.merge(entity);
	}

	/**
	 * Metodo responsável por deletar uma entidade.
	 * 
	 * @author Arquitetura
	 * @since Jan 13, 2017 12:18:48 AM
	 * @param entity - Entidade
	 */
	public void delete(final T entity) {
		this.entityManager.remove(entity);
		this.entityManager.flush();
	}

	/**
	 * Metodo responsável por obter a lista de uma entidade.
	 * 
	 * @author Arquitetura
	 * @since Jan 13, 2017 12:18:58 AM
	 * @return - Lista de toda entidade
	 */
	@SuppressWarnings("unchecked")
	public List<T> findAll() {
		return this.entityManager.createQuery("FROM " + this.getTypeClass().getName()).getResultList();
	}

	/**
	 * Metodo responsável por pesquisar uma lista de entidade paginada.
	 * 
	 * @author Arquitetura
	 * @since Jan 13, 2017 12:19:04 AM
	 * @param page
	 * @param maxResult
	 * @return - A lista de entidade.
	 */
	@SuppressWarnings("unchecked")
	public List<T> findAllPerPage(final int page, final int maxResult) {
		return this.entityManager.createQuery("FROM " + this.getTypeClass().getName())
				.setMaxResults((page - 1) * maxResult + maxResult).setFirstResult((page - 1) * maxResult).getResultList();
	}

	/**
	 * Metodo responsável por obter a classe entidade.
	 * 
	 * @author Arquitetura
	 * @since Jan 13, 2017 12:19:08 AM
	 * @return - A classe entidade
	 */
	private Class<?> getTypeClass() {
		return (Class<?>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[1];
	}

	/**
	 * Metodo responsável por obter o gerenciador de entidade.
	 * 
	 * @author Arquitetura
	 * @since Jan 13, 2017 12:19:13 AM
	 * @return - O gerenciador de entidade.
	 */
	public EntityManager getEntityManager() {
		return this.entityManager;
	}

	/**
	 * Metodo responsável por receber instância do gerenciador de entidade.
	 * 
	 * @author Arquitetura
	 * @since Jan 13, 2017 12:19:19 AM
	 * @param entityManager - Gerenciador de Entidade
	 */
	public void setEntityManager(final EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	/**
	 * Metodo responsável por obter unico resultado na pesquisa.
	 * 
	 * @author Arquitetura
	 * @since Jan 13, 2017 12:19:32 AM
	 * @param query - Query
	 * @return Object - Entidade Pesquisada
	 */
	@SuppressWarnings("rawtypes")
	public static Object getSingleResultOrNull(final Query query) {
		Object object;
		final List results = query.getResultList();
		if (results.isEmpty()) {
			object = null;
		} else if (results.size() == 1) {
			object = results.get(0);
		} else {
			throw new NonUniqueResultException();
		}
		return object;
	}
}
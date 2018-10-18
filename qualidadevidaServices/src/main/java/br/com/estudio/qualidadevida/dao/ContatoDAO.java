package br.com.estudio.qualidadevida.dao;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;

import br.com.estudio.qualidadevida.entity.ContatoEntity;

@Repository
public class ContatoDAO extends GenericDAO<Integer, ContatoEntity> {

	/**
	 * Construtor da classe AlunoDAO
	 *
	 * @param entityManager
	 */
	public ContatoDAO(EntityManager entityManager) {
		super(entityManager);
	}
	
		
}

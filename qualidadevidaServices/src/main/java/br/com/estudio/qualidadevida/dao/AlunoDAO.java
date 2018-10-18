package br.com.estudio.qualidadevida.dao;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;

import br.com.estudio.qualidadevida.entity.AlunoEntity;

@Repository
public class AlunoDAO extends GenericDAO<Integer, AlunoEntity> {

	/**
	 * Construtor da classe AlunoDAO
	 *
	 * @param entityManager
	 */
	public AlunoDAO(EntityManager entityManager) {
		super(entityManager);
	}
	
		
}

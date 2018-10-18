package br.com.estudio.qualidadevida.dao;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;

import br.com.estudio.qualidadevida.entity.EnderecoEntity;

@Repository
public class EnderecoDAO extends GenericDAO<Integer, EnderecoEntity> {

	/**
	 * Construtor da classe AlunoDAO
	 *
	 * @param entityManager
	 */
	public EnderecoDAO(EntityManager entityManager) {
		super(entityManager);
	}
	
		
}

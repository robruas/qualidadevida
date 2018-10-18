package br.com.estudio.qualidadevida.dao;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;

import br.com.estudio.qualidadevida.entity.AgendaAlunoEntity;


@Repository
public class AgendaAlunoDAO extends GenericDAO<Integer, AgendaAlunoEntity> {

	public AgendaAlunoDAO(EntityManager entityManager) {
		super(entityManager);
	}

}

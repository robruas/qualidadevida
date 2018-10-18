package br.com.estudio.qualidadevida.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import br.com.estudio.qualidadevida.entity.AgendaEntity;
import br.com.estudio.qualidadevida.exception.PilatesDaoException;

@Repository
public class AgendaDAO extends GenericDAO<Integer, AgendaEntity> {

	public AgendaDAO(EntityManager entityManager) {
		super(entityManager);
	}

	public List<Object[]> obterAulasRealizadas() throws PilatesDaoException {
		try {
			
			Query query =  this.getEntityManager().createNamedQuery(AgendaEntity.OBTER_AULAS_DADAS);
			List<Object[]> listaAulas = (List<Object[]>)  query.getResultList();
			return listaAulas;
			
		} catch (NoResultException e) {
			throw new PilatesDaoException("Não existe Aulas", e);
		}

	}

}

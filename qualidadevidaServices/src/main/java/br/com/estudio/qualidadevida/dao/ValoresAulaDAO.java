package br.com.estudio.qualidadevida.dao;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import br.com.estudio.qualidadevida.entity.ValoresAulaEntity;
import br.com.estudio.qualidadevida.exception.PilatesDaoException;

@Repository
public class ValoresAulaDAO extends GenericDAO<Integer, ValoresAulaEntity> {

	/**
	 * Construtor da classe ValoresAulaDAO
	 *
	 * @param entityManager
	 */
	public ValoresAulaDAO(EntityManager entityManager) {
		super(entityManager);
	}

	public ValoresAulaEntity obterValorAula(final Integer quantidadeAluno) throws PilatesDaoException {
		try {
			Query query = this.getEntityManager()
					.createNamedQuery(ValoresAulaEntity.OBTER_VALOR_AULA);
			query.setParameter("quantidadeAluno", quantidadeAluno);
			return (ValoresAulaEntity) query.getSingleResult();

		} catch (NoResultException e) {
			throw new PilatesDaoException("Não existe valor aula para quantidade aluno", e);
		}

	}

}

package br.com.estudio.qualidadevida.facade;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import br.com.estudio.qualidadevida.business.local.AgendaBusinessLocal;
import br.com.estudio.qualidadevida.business.local.AlunoBusinessLocal;
import br.com.estudio.qualidadevida.dto.AlunoDTO;
import br.com.estudio.qualidadevida.exception.PilatesAppBusinessException;
import br.com.estudio.qualidadevida.exception.PilatesAppSystemException;

@Named
public class AlunoFacade {

	/**
	 * Construtor da classe AlunoFacade
	 *
	 */
	public AlunoFacade() {
		super();
	}

	@Inject
	AlunoBusinessLocal alunoBusiness;

	@Inject
	AgendaBusinessLocal agendaBusiness;

	public List<AlunoDTO> obterAlunos() throws PilatesAppSystemException, PilatesAppBusinessException {
		return alunoBusiness.obterAlunos();
	}
	
	public AlunoDTO obterAlunoPorId(final Integer codigoAluno) throws PilatesAppSystemException, PilatesAppBusinessException {
		
		if(codigoAluno == null) {
			throw new PilatesAppBusinessException("Codigo Aluno Nulo");
		}
		
		return alunoBusiness.obterAlunoPorId(codigoAluno);
	}

	public void salvar(final AlunoDTO alunoDTO) throws PilatesAppSystemException, PilatesAppBusinessException {
		alunoBusiness.salvar(alunoDTO);
	}


}

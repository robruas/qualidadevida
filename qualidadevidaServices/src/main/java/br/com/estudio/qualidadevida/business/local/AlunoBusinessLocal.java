package br.com.estudio.qualidadevida.business.local;

import java.util.List;

import br.com.estudio.qualidadevida.dto.AlunoDTO;
import br.com.estudio.qualidadevida.exception.PilatesAppBusinessException;
import br.com.estudio.qualidadevida.exception.PilatesAppSystemException;

public interface AlunoBusinessLocal {

	List<AlunoDTO> obterAlunos() throws PilatesAppSystemException, PilatesAppBusinessException;

	void salvar(final AlunoDTO alunoDTO) throws PilatesAppSystemException, PilatesAppBusinessException;
	
	AlunoDTO obterAlunoPorId(final Integer codigoAluno) throws PilatesAppSystemException, PilatesAppBusinessException;
	
	
}

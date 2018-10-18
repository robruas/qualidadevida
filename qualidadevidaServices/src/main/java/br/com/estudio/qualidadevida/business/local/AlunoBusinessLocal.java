package br.com.estudio.qualidadevida.business.local;

import java.util.List;

import br.com.estudio.qualidadevida.dto.AlunoDTO;
import br.com.estudio.qualidadevida.exception.PilatesAppBusinessException;
import br.com.estudio.qualidadevida.exception.PilatesAppSystemException;

public interface AlunoBusinessLocal {

	List<AlunoDTO> obterAlunos() throws PilatesAppSystemException, PilatesAppBusinessException;

	void incluirAlunos(final AlunoDTO alunoDTO) throws PilatesAppSystemException, PilatesAppBusinessException;
	
	
}

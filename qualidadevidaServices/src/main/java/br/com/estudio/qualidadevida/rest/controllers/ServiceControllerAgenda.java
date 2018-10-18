package br.com.estudio.qualidadevida.rest.controllers;

import java.net.HttpURLConnection;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response.Status;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.estudio.qualidadevida.dto.AgendaDTO;
import br.com.estudio.qualidadevida.dto.FaturamentoAulaDTO;
import br.com.estudio.qualidadevida.exception.PilatesAPIException;
import br.com.estudio.qualidadevida.exception.PilatesAppBusinessException;
import br.com.estudio.qualidadevida.exception.PilatesAppSystemException;
import br.com.estudio.qualidadevida.facade.AlunoFacade;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/agenda")
public class ServiceControllerAgenda {

	@Inject
	private AlunoFacade alunoFacade;
	
	@PostMapping
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "Cadastro aluno")
	@ApiResponse(code = HttpURLConnection.HTTP_NOT_FOUND, message = "Aluno não cadastrado")
	@ApiResponses({ @ApiResponse(code = HttpURLConnection.HTTP_OK, message = "Aluno cadastrado") })
	public void incluirAluno(@RequestBody @Valid AgendaDTO agendaDTO) throws PilatesAPIException {
		try {
			alunoFacade.incluirAgendaAluno(agendaDTO);
		} catch (final PilatesAppSystemException e) {
			throw new PilatesAPIException(e.getMessage(), e, Status.NOT_FOUND);
		} catch (final PilatesAppBusinessException e) {
			throw new PilatesAPIException(e.getMessage(), e, Status.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "Obter agenda")
	@ApiResponse(code = HttpURLConnection.HTTP_NOT_FOUND, message = "Agenda não localizado")
	@ApiResponses({ @ApiResponse(code = HttpURLConnection.HTTP_OK, message = "Agenda Localizado") })
	public @ResponseBody FaturamentoAulaDTO buscarAgenda() throws PilatesAPIException {
		try {
			return alunoFacade.obterFaturamento(); 
		} catch (final PilatesAppSystemException e) {
			throw new PilatesAPIException(e.getMessage(), e, Status.NOT_FOUND);
		} catch (final PilatesAppBusinessException e) {
			throw new PilatesAPIException(e.getMessage(), e, Status.INTERNAL_SERVER_ERROR);
		}
		
	}
	
}

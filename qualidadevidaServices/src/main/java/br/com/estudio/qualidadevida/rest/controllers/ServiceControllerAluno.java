package br.com.estudio.qualidadevida.rest.controllers;

import java.net.HttpURLConnection;
import java.util.List;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response.Status;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.estudio.qualidadevida.dto.AlunoDTO;
import br.com.estudio.qualidadevida.exception.PilatesAPIException;
import br.com.estudio.qualidadevida.exception.PilatesAppBusinessException;
import br.com.estudio.qualidadevida.exception.PilatesAppSystemException;
import br.com.estudio.qualidadevida.facade.AlunoFacade;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/aluno")
public class ServiceControllerAluno {

	@Inject
	private AlunoFacade alunoFacade;
	
	@Produces(MediaType.APPLICATION_JSON)
	@GetMapping()
	@ApiOperation(value = "Obter lista de alunos")
	@ApiResponse(code = HttpURLConnection.HTTP_NOT_FOUND, message = "Alunos não localizado")
	@ApiResponses({ @ApiResponse(code = HttpURLConnection.HTTP_OK, message = "Alunos Localizado") })
	public List<AlunoDTO> obterAlunos() throws PilatesAPIException {
		try {
			return alunoFacade.obterAlunos();
		} catch (final PilatesAppSystemException e) {
			throw new PilatesAPIException(e.getMessage(), e, Status.NOT_FOUND);
		} catch (final PilatesAppBusinessException e) {
			throw new PilatesAPIException(e.getMessage(), e, Status.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	
	@Produces(MediaType.APPLICATION_JSON)
	@GetMapping("/{id}")
	@ApiOperation(value = "Obter lista de alunos")
	@ApiResponse(code = HttpURLConnection.HTTP_NOT_FOUND, message = "Alunos não localizado")
	@ApiResponses({ @ApiResponse(code = HttpURLConnection.HTTP_OK, message = "Alunos Localizado") })
	public AlunoDTO obterAlunoPorId(@PathParam("id") final Integer codigoAluno)
			throws PilatesAPIException {
		try {
			return alunoFacade.obterAlunoPorId(codigoAluno);
		} catch (final PilatesAppSystemException e) {
			throw new PilatesAPIException(e.getMessage(), e, Status.NOT_FOUND);
		} catch (final PilatesAppBusinessException e) {
			throw new PilatesAPIException(e.getMessage(), e, Status.INTERNAL_SERVER_ERROR);
		}

	}
	
	
	
	@PostMapping()
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "Cadastro aluno")
	@ApiResponse(code = HttpURLConnection.HTTP_NOT_FOUND, message = "Aluno não cadastrado")
	@ApiResponses({ @ApiResponse(code = HttpURLConnection.HTTP_OK, message = "Aluno cadastrado") })
	public void salvar(@RequestBody @Valid AlunoDTO alunoDTO) throws PilatesAPIException {
		try {
			alunoFacade.salvar(alunoDTO);
		} catch (final PilatesAppSystemException e) {
			throw new PilatesAPIException(e.getMessage(), e, Status.NOT_FOUND);
		} catch (final PilatesAppBusinessException e) {
			throw new PilatesAPIException(e.getMessage(), e, Status.INTERNAL_SERVER_ERROR);
		}
	}
	
}

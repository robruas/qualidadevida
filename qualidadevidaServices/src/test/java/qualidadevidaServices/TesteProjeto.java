package qualidadevidaServices;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.junit.Test;

import com.google.gson.Gson;

import br.com.estudio.qualidadevida.dto.AgendaAlunoDTO;
import br.com.estudio.qualidadevida.dto.AgendaDTO;
import br.com.estudio.qualidadevida.dto.AlunoDTO;
import br.com.estudio.qualidadevida.dto.ContatoDTO;
import br.com.estudio.qualidadevida.dto.EnderecoDTO;
import br.com.estudio.qualidadevida.enuns.EnumStatusAula;
import br.com.estudio.qualidadevida.enuns.EnumTipoTelefone;

public class TesteProjeto {
	@Test
	public void converterObjetoAlunoJson() {

		AlunoDTO alunoDTO = new AlunoDTO(); 
		alunoDTO.setAltura(1.70);
		alunoDTO.setDataNacimento(new Date());
		alunoDTO.setEmail("robson_ruas@hotmail.com");
		alunoDTO.setIdade(33);
		alunoDTO.setNome("Robson");
		alunoDTO.setPeso(83);
		alunoDTO.setProfissao("Analista de Sistemas");
		alunoDTO.setSobreNome("Ruas de Oliveira");

		EnderecoDTO enderecoDTO = new EnderecoDTO();
		enderecoDTO.setCep("06852-640");
		enderecoDTO.setCidade("Itapecerica da Serra");
		enderecoDTO.setComplemento("Casa");
		enderecoDTO.setEstado("SP");
		enderecoDTO.setLogradouro("Rua Arkansas");
		enderecoDTO.setNumeroLogradouro(4122);

		List<EnderecoDTO> listEndereco = new ArrayList<EnderecoDTO>();
		listEndereco.add(enderecoDTO);

		ContatoDTO contatoDTO = new ContatoDTO();
		contatoDTO.setDdd(011);
		contatoDTO.setEnumTipoTelefone(EnumTipoTelefone.CELULAR);
		contatoDTO.setNumero(99735248);

		List<ContatoDTO> listContato = new ArrayList<ContatoDTO>();
		listContato.add(contatoDTO);

		alunoDTO.getContatos().addAll(listContato);
		alunoDTO.getEnderecos().addAll(listEndereco);

		Gson gson = new Gson();
		String json = gson.toJson(alunoDTO);

		System.out.println(json);

	}

	@Test
	public void converterObjetoAgendaJson() {

		AgendaAlunoDTO agendaAlunoDTO = new AgendaAlunoDTO();
		List<AgendaAlunoDTO> listaAgendaAlunoDTO = new ArrayList<AgendaAlunoDTO>();
		AlunoDTO alunoDTO = new AlunoDTO();
		alunoDTO.setId(1);
		agendaAlunoDTO.setAluno(alunoDTO);
		agendaAlunoDTO.setEnumStatusAula(EnumStatusAula.AULA_REALIZADA);
		listaAgendaAlunoDTO.add(agendaAlunoDTO);

		AgendaDTO agendaDTO = new AgendaDTO();
		agendaDTO.getAgendaAlunos().addAll(listaAgendaAlunoDTO);
		// agendaDTO.setDataAula(new CCalendar());
		// agendaDTO.setHoraInicio("16:00");
		// agendaDTO.setHoraFim("17:00");

		Gson gson = new Gson();
		String json = gson.toJson(agendaDTO);

		System.out.println(json);
	}

	public Calendar getPegaDataAtual() {
		Calendar calendar = new GregorianCalendar();
		Date date = new Date();
		calendar.setTime(date);
		return calendar;
	}

}

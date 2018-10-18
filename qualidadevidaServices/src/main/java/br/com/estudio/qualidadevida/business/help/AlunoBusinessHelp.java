package br.com.estudio.qualidadevida.business.help;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.estudio.qualidadevida.dto.AlunoDTO;
import br.com.estudio.qualidadevida.dto.ContatoDTO;
import br.com.estudio.qualidadevida.dto.EnderecoDTO;
import br.com.estudio.qualidadevida.entity.AlunoEntity;
import br.com.estudio.qualidadevida.entity.ContatoEntity;
import br.com.estudio.qualidadevida.entity.EnderecoEntity;
import br.com.estudio.qualidadevida.enuns.EnumTipoTelefone;

public class AlunoBusinessHelp {

	public static List<AlunoDTO> obterListaAlunosDTO(final List<AlunoEntity> listaAlunoEntity) {

		List<AlunoDTO> listaAlunos = new ArrayList<AlunoDTO>();

		for (AlunoEntity alunoEntity : listaAlunoEntity) {
			AlunoDTO alunoDTO = new AlunoDTO();
			alunoDTO.setId(alunoEntity.getId());
			alunoDTO.setIdade(alunoEntity.getIdade());
			alunoDTO.setAltura(alunoEntity.getAltura());
			alunoDTO.setDataNacimento(alunoEntity.getDataNacimento());
			alunoDTO.setEmail(alunoEntity.getEmail());
			alunoDTO.setIdade(alunoEntity.getIdade());
			alunoDTO.setNome(alunoEntity.getNome());
			alunoDTO.setPeso(alunoEntity.getPeso());
			alunoDTO.setProfissao(alunoEntity.getProfissao());
			alunoDTO.setSobreNome(alunoEntity.getSobreNome());

			List<EnderecoDTO> listaEnderecos = obterEnderecos(alunoEntity);
			List<ContatoDTO> listaContatos = obterContatos(alunoEntity);

			alunoDTO.getContatos().addAll(listaContatos);
			alunoDTO.getEnderecos().addAll(listaEnderecos);
			listaAlunos.add(alunoDTO);
		}

		return listaAlunos;
	}

	private static List<ContatoDTO> obterContatos(final AlunoEntity alunoEntity) {
		List<ContatoDTO> listaContatos = new ArrayList<ContatoDTO>();
		for (ContatoEntity contatoEntity : alunoEntity.getContatos()) {
			ContatoDTO contatoDTO = new ContatoDTO();
			contatoDTO.setDdd(contatoEntity.getDdd());
			contatoDTO.setEnumTipoTelefone(EnumTipoTelefone.getEnumTipoTelefone(contatoEntity.getTipo()));
			contatoDTO.setId(contatoEntity.getId());
			contatoDTO.setNumero(contatoEntity.getNumero());
			listaContatos.add(contatoDTO);

		}
		return listaContatos;
	}

	private static List<EnderecoDTO> obterEnderecos(final AlunoEntity alunoEntity) {
		List<EnderecoDTO> listaEnderecos = new ArrayList<EnderecoDTO>();
		for (EnderecoEntity enderecoEntity : alunoEntity.getEnderecos()) {
			EnderecoDTO enderecoDTO = new EnderecoDTO();
			enderecoDTO.setCep(enderecoEntity.getCep());
			enderecoDTO.setCidade(enderecoEntity.getCidade());
			enderecoDTO.setComplemento(enderecoEntity.getComplemento());
			enderecoDTO.setEstado(enderecoEntity.getEstado());
			enderecoDTO.setId(enderecoEntity.getId());
			enderecoDTO.setLogradouro(enderecoEntity.getLogradouro());
			enderecoDTO.setNumeroLogradouro(enderecoEntity.getNumeroLogradouro());
			listaEnderecos.add(enderecoDTO);
		}
		return listaEnderecos;
	}

	public static AlunoEntity obterAlunoEntity(final AlunoDTO alunoDTO) {
		AlunoEntity alunoEntity = new AlunoEntity();
		alunoEntity.setDataCadastro(new Date());
		alunoEntity.setAltura(alunoDTO.getAltura());
		alunoEntity.setDataNacimento(alunoDTO.getDataNacimento());
		alunoEntity.setEmail(alunoDTO.getEmail());
		alunoEntity.setIdade(alunoDTO.getIdade());
		alunoEntity.setNome(alunoDTO.getNome());
		alunoEntity.setPeso(alunoDTO.getPeso());
		alunoEntity.setProfissao(alunoDTO.getProfissao());
		alunoEntity.setSobreNome(alunoDTO.getSobreNome());

		return alunoEntity;
	}

	public static EnderecoEntity obterEnderecoEntity(final EnderecoDTO enderecoDTO) {
		EnderecoEntity enderecoEntity = new EnderecoEntity();
		enderecoEntity.setCep(enderecoDTO.getCep());
		enderecoEntity.setCidade(enderecoDTO.getCidade());
		enderecoEntity.setComplemento(enderecoDTO.getComplemento());
		enderecoEntity.setEstado(enderecoDTO.getEstado());
		enderecoEntity.setId(enderecoDTO.getId());
		enderecoEntity.setLogradouro(enderecoDTO.getLogradouro());
		enderecoEntity.setNumeroLogradouro(enderecoDTO.getNumeroLogradouro());
		return enderecoEntity;
	}

	public static ContatoEntity obterContatoEntity(final ContatoDTO contatoDTO) {
		ContatoEntity contatoEntity = new ContatoEntity();
		contatoEntity.setDdd(contatoDTO.getDdd());
		contatoEntity.setTipo(contatoDTO.getEnumTipoTelefone().getTipo());
		contatoEntity.setNumero(contatoDTO.getNumero());
		return contatoEntity;
	}

}

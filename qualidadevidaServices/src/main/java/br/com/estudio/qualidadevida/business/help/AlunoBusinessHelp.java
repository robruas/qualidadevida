package br.com.estudio.qualidadevida.business.help;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.estudio.qualidadevida.dto.AlunoDTO;
import br.com.estudio.qualidadevida.dto.CidadeDTO;
import br.com.estudio.qualidadevida.dto.ContatoDTO;
import br.com.estudio.qualidadevida.dto.EnderecoDTO;
import br.com.estudio.qualidadevida.dto.EstadoDTO;
import br.com.estudio.qualidadevida.entity.AlunoEntity;
import br.com.estudio.qualidadevida.entity.ContatoEntity;
import br.com.estudio.qualidadevida.entity.EnderecoEntity;

public class AlunoBusinessHelp {

	public static List<AlunoDTO> obterListaAlunos(final List<AlunoEntity> listaAlunoEntity) {

		List<AlunoDTO> listaAlunos = new ArrayList<AlunoDTO>();

		for (AlunoEntity alunoEntity : listaAlunoEntity) {
			AlunoDTO alunoDTO = new AlunoDTO();
			alunoDTO.setId(alunoEntity.getId());
			alunoDTO.setAltura(alunoEntity.getAltura());
			alunoDTO.setDataNascimento(alunoEntity.getDataNascimento());
			alunoDTO.setEmail(alunoEntity.getEmail());
			alunoDTO.setNome(alunoEntity.getNome());
			alunoDTO.setPeso(alunoEntity.getPeso());
			alunoDTO.setProfissao(alunoEntity.getProfissao());
			alunoDTO.setSobreNome(alunoEntity.getSobreNome());

			List<EnderecoDTO> listaEnderecos = obterListaEnderecos(alunoEntity);
			List<ContatoDTO> listaContatos = obterListaContatos(alunoEntity);

			alunoDTO.getContatos().addAll(listaContatos);
			alunoDTO.getEnderecos().addAll(listaEnderecos);
			listaAlunos.add(alunoDTO);
		}

		return listaAlunos;
	}

	private static List<ContatoDTO> obterListaContatos(final AlunoEntity alunoEntity) {
		List<ContatoDTO> listaContatos = new ArrayList<ContatoDTO>();
		for (ContatoEntity contatoEntity : alunoEntity.getContatos()) {
			ContatoDTO contatoDTO = new ContatoDTO();
			contatoDTO.setIdTipoContato(contatoEntity.getIdTipoContato());
			contatoDTO.setId(contatoEntity.getId());
			contatoDTO.setNumero(contatoEntity.getNumero());
			listaContatos.add(contatoDTO);

		}
		return listaContatos;
	}

	private static List<EnderecoDTO> obterListaEnderecos(final AlunoEntity alunoEntity) {
		List<EnderecoDTO> listaEnderecos = new ArrayList<EnderecoDTO>();
		for (EnderecoEntity enderecoEntity : alunoEntity.getEnderecos()) {
			EnderecoDTO enderecoDTO = new EnderecoDTO();
			enderecoDTO.setCidade(new CidadeDTO());
			enderecoDTO.setEstado(new EstadoDTO());
			
			enderecoDTO.setCep(enderecoEntity.getCep());
			enderecoDTO.getCidade().setId(enderecoEntity.getIdCidade());
			enderecoDTO.setComplemento(enderecoEntity.getComplemento());
			enderecoDTO.getEstado().setId(enderecoEntity.getIdEstado());
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
		alunoEntity.setDataNascimento(alunoDTO.getDataNascimento());
		alunoEntity.setEmail(alunoDTO.getEmail());
		alunoEntity.setNome(alunoDTO.getNome());
		alunoEntity.setPeso(alunoDTO.getPeso());
		alunoEntity.setProfissao(alunoDTO.getProfissao());
		alunoEntity.setSobreNome(alunoDTO.getSobreNome());

		return alunoEntity;
	}

	public static EnderecoEntity obterEnderecoEntity(final EnderecoDTO enderecoDTO) {
		EnderecoEntity enderecoEntity = new EnderecoEntity();
		enderecoEntity.setCep(enderecoDTO.getCep());
		enderecoEntity.setIdCidade(enderecoDTO.getCidade().getId());
		enderecoEntity.setComplemento(enderecoDTO.getComplemento());
		enderecoEntity.setIdEstado(enderecoDTO.getEstado().getId());
		enderecoEntity.setId(enderecoDTO.getId());
		enderecoEntity.setLogradouro(enderecoDTO.getLogradouro());
		enderecoEntity.setNumeroLogradouro(enderecoDTO.getNumeroLogradouro());
		return enderecoEntity;
	}

	public static ContatoEntity obterContatoEntity(final ContatoDTO contatoDTO) {
		ContatoEntity contatoEntity = new ContatoEntity();
		contatoEntity.setIdTipoContato(contatoDTO.getIdTipoContato());
		contatoEntity.setNumero(contatoDTO.getNumero());
		return contatoEntity;
	}

	public static AlunoDTO obterAlunoDTO(AlunoEntity alunoEntity) {
		AlunoDTO alunoDTO = new AlunoDTO();
		alunoDTO.setId(alunoEntity.getId());
		alunoDTO.setAltura(alunoEntity.getAltura());
		alunoDTO.setDataNascimento(alunoEntity.getDataNascimento());
		alunoDTO.setEmail(alunoEntity.getEmail());
		alunoDTO.setNome(alunoEntity.getNome());
		alunoDTO.setPeso(alunoEntity.getPeso());
		alunoDTO.setProfissao(alunoEntity.getProfissao());
		alunoDTO.setSobreNome(alunoEntity.getSobreNome());
		return alunoDTO;
	}

}

package br.com.person.api.dto;

import java.util.List;

import br.com.person.api.model.PessoaJuridica;

public record ResponsePessoaJuridicaDTO(Long id, String nome, String endereco, String bairro, Integer cep,
		String cidade, String estado, List<ContatoDTO> contatos, Integer cnpj, String tipo) {

	public ResponsePessoaJuridicaDTO(PessoaJuridica pessoaJuridica) {
		this(pessoaJuridica.getId(), pessoaJuridica.getNome(), pessoaJuridica.getEndereco(), pessoaJuridica.getBairro(),
				pessoaJuridica.getCep(), pessoaJuridica.getCidade(), pessoaJuridica.getEstado(),
				pessoaJuridica.getContatos().stream().map(ContatoDTO::new).toList(), pessoaJuridica.getCnpj(),
				pessoaJuridica.getTipo());
	}

}

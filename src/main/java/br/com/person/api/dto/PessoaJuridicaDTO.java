package br.com.person.api.dto;

import java.util.List;

public record PessoaJuridicaDTO(String nome, String endereco, String bairro, Integer cep, String cidade, String estado,
		List<ContatoDTO> contatos, Integer cnpj, String tipo) {

}

package br.com.person.api.dto;

import java.util.List;

public record ResponsePessoaFisicaDTO(Long id, String nome, String endereco, String bairro, Integer cep, String cidade,
		String estado, List<ContatoDTO> contatos, Integer rg, Integer cpf, String tipo) {

}

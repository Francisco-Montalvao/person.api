package br.com.person.api.dto;

import br.com.person.api.model.Contato;

public record ContatoDTO(String email, Integer telefone, Integer ddd) {

	public ContatoDTO(Contato contato) {
		this(contato.getEmail(), contato.getTelefone(), contato.getDdd());
	}
}

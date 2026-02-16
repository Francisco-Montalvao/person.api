package br.com.person.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
@Table(name = "pessoa_fisica_tb")
public class PessoaFisica extends Pessoa {
	private Integer rg;
	private Integer cpf;
	private String tipo;

}

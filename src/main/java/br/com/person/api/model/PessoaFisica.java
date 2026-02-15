package br.com.person.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "pessoa_fisica_tb")
public class PessoaFisica extends Pessoa{
    private Integer rg;
    private Integer cpf;
    private String tipo;

    public PessoaFisica(){}
    public PessoaFisica(String nome, String endereco, String bairro, Integer cep, String ciddade, String estado, Integer rg, Integer cpf, String tipo) {
        super(nome, endereco, bairro, cep, ciddade, estado);
        this.rg = rg;
        this.cpf = cpf;
        this.tipo = tipo;
    }

    public PessoaFisica(Integer rg, Integer cpf, String tipo) {
        this.rg = rg;
        this.cpf = cpf;
        this.tipo = tipo;
    }

    public Integer getRg() {
        return rg;
    }

    public Integer getCpf() {
        return cpf;
    }

    public String getTipo() {
        return tipo;
    }
}

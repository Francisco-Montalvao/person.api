package br.com.person.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "pessoa_juridica_tb")
public class PessoaJuridica extends Pessoa{
    private Integer cnpj;
    private String tipo;

    public PessoaJuridica(){}
    public PessoaJuridica(String nome, String endereco, String bairro, Integer cep, String ciddade, String estado, Integer cnpj, String tipo) {
        super(nome, endereco, bairro, cep, ciddade, estado);
        this.cnpj = cnpj;
        this.tipo = tipo;
    }

    public Integer getCnpj() {
        return cnpj;
    }

    public String getTipo() {
        return tipo;
    }
}

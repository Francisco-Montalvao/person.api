package br.com.person.api.model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "pessoa_tb")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String endereco;
    private String bairro;
    private Integer cep;
    private String cidade;
    private String estado;

    @OneToMany(mappedBy = "pessoa", cascade = CascadeType.ALL)
    private Set<Contato> contatos = new HashSet<>();

    public Pessoa(String nome, String endereco, String bairro, Integer cep, String ciddade, String estado) {
        this.nome = nome;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = ciddade;
        this.estado = estado;
    }

    public Pessoa() {

    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public Integer getCep() {
        return cep;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }
}

package br.com.person.api.model;

import jakarta.persistence.*;


@Entity
@Table(name = "contato_tb")
public class Contato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;
    private Integer telefone;
    private Integer ddd;

    @ManyToOne
    @JoinColumn(name = "pessoa_id")
    private Pessoa pessoa;

    public Contato(String email, Integer telefone, Integer ddd) {
        this.email = email;
        this.telefone = telefone;
        this.ddd = ddd;
    }

    public Contato() {
    }

    public String getEmail() {
        return email;
    }

    public Integer getTelefone() {
        return telefone;
    }

    public Integer getDdd() {
        return ddd;
    }
}

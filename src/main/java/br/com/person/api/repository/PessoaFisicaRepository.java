package br.com.person.api.repository;

import br.com.person.api.model.PessoaFisica;
import br.com.person.api.model.PessoaJuridica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaFisicaRepository extends JpaRepository<PessoaFisica, Long> {

}

package br.com.person.api.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.person.api.dto.ContatoDTO;
import br.com.person.api.dto.PessoaJuridicaDTO;
import br.com.person.api.dto.ResponsePessoaJuridicaDTO;
import br.com.person.api.model.Contato;
import br.com.person.api.model.PessoaJuridica;
import br.com.person.api.repository.PessoaFisicaRepository;
import br.com.person.api.repository.PessoaJuridicaRepository;

@Service
@Transactional(readOnly = true)
public class PessoaJuridicaService {

	private final PessoaFisicaRepository pessoaFisicaRepository;

	private final PessoaJuridicaRepository repository;

	public PessoaJuridicaService(PessoaJuridicaRepository repository, PessoaFisicaRepository pessoaFisicaRepository) {
		this.repository = repository;
		this.pessoaFisicaRepository = pessoaFisicaRepository;
	}

	// no crud temos o criar ler atualizar e deletar

	// C -> Create
	@Transactional
	public ResponsePessoaJuridicaDTO create(PessoaJuridicaDTO dto) {
		PessoaJuridica pessoaJuridica = toEntity(dto);
		pessoaJuridica = repository.save(pessoaJuridica);
		return new ResponsePessoaJuridicaDTO(pessoaJuridica);
	}

	// Read
	public ResponsePessoaJuridicaDTO findById(Long id) {
		PessoaJuridica pessoaJuridica = repository.findById(id).orElseThrow(
				()-> new RuntimeException("Id nao existe")
		);

		return new ResponsePessoaJuridicaDTO(pessoaJuridica);
	}

	private static PessoaJuridica toEntity(PessoaJuridicaDTO dto) {
		Set<Contato> contatos = new HashSet<>();

		PessoaJuridica pessoaJuridica = new PessoaJuridica();
		pessoaJuridica.setNome(dto.nome());
		pessoaJuridica.setEndereco(dto.endereco());
		pessoaJuridica.setBairro(dto.bairro());
		pessoaJuridica.setCep(dto.cep());
		pessoaJuridica.setCidade(dto.cidade());
		pessoaJuridica.setEstado(dto.estado());

		if (dto.contatos() != null) {
			for (ContatoDTO contato : dto.contatos()) {
				Contato c = new Contato();
				c.setPessoa(pessoaJuridica);
				c.setDdd(contato.ddd());
				c.setEmail(contato.email());
				c.setTelefone(contato.telefone());

				contatos.add(c);

			}
		}

		pessoaJuridica.setContatos(contatos);
		pessoaJuridica.setCnpj(dto.cnpj());
		pessoaJuridica.setTipo(dto.tipo());

		return pessoaJuridica;

	}

}
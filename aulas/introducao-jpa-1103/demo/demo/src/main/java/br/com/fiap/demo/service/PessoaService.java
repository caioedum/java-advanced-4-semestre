package br.com.fiap.demo.service;

import br.com.fiap.demo.model.Pessoa;
import br.com.fiap.demo.repository.PessoaRepository;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {

    private final PessoaRepository repository;

    public PessoaService(PessoaRepository repository) {
        this.repository = repository;
    }

    public Pessoa localizarPorNome(String nome){
        return this.repository.findByNome(nome);
    }

}

package br.com.fiap.demo.repository;

import br.com.fiap.demo.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PessoaRepository extends JpaRepository<Pessoa, String> {

    Pessoa findByNome(String nome);

    @Query("select * from Pessoa where nome = :nome")
    Pessoa localizarPorNome(@Param("nome") String nome);

}

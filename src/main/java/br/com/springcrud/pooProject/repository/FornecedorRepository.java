package br.com.springcrud.pooProject.repository;

import br.com.springcrud.pooProject.model.Fornecedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface FornecedorRepository extends CrudRepository<Fornecedor, Long>, BaseRepository<Fornecedor> {
    public Optional<Fornecedor> findByCnpj(String cnpj);
}

package br.com.springcrud.pooProject.service;

import br.com.springcrud.pooProject.model.Fornecedor;
import br.com.springcrud.pooProject.repository.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FornecedorService {
    @Autowired
    FornecedorRepository repository;

    //Metodos para apagar
    public void deleteById(Long aLong) {
        repository.deleteById(aLong);
    }

    public void delete(Fornecedor entity) {
        repository.delete(entity);
    }

    //Metodos para salvar e alterar
    public <S extends Fornecedor> S save(S entity) {
        return repository.save(entity);
    }

    public <S extends Fornecedor> Iterable<S> saveAll(Iterable<S> entities) {
        return repository.saveAll(entities);
    }

    public long count() {
        return repository.count();
    }

    //Metodos de busca
    public Optional<Fornecedor> findByCnpj(String cnpj) {
        return repository.findByCnpj(cnpj);
    }

    public Optional<Fornecedor> findByName(String name) {
        return repository.findByName(name);
    }

    public Optional<Fornecedor> findById(Long aLong) {
        return repository.findById(aLong);
    }

    public Iterable<Fornecedor> findAll() {
        return repository.findAll();
    }

    public Iterable<Fornecedor> findAllById(Iterable<Long> longs) {
        return repository.findAllById(longs);
    }

    public boolean existsById(Long aLong) {
        return repository.existsById(aLong);
    }
}

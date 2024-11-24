package br.com.springcrud.pooProject.service;

import br.com.springcrud.pooProject.model.Produto;
import br.com.springcrud.pooProject.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository repository;

    //Métodos para apagar
    public void deleteById(Long aLong) {
        repository.deleteById(aLong);
    }

    public void delete(Produto entity) {
        repository.delete(entity);
    }

    //Métodos para adicionar e alterar
    public <S extends Produto> S save(S entity) {
        return repository.save(entity);
    }

    public <S extends Produto> Iterable<S> saveAll(Iterable<S> entities) {
        return repository.saveAll(entities);
    }

    public long count() {
        return repository.count();
    }

    //Métodos de busca
    public Optional<Produto> findById (Long id){
        return repository.findById(id);
    }

    public Iterable<Produto> findAllById(Iterable<Long> longs) {
        return repository.findAllById(longs);
    }

    public Iterable<Produto> findAll() {
        return repository.findAll();
    }

    public boolean existsById(Long aLong) {
        return repository.existsById(aLong);
    }

    public Optional<Produto> findByName (String nome){
        return repository.findByName(nome);
    }

    public List<Produto> findByMarca(String nome) {
        return repository.findByMarca(nome);
    }

    public List<Produto> findByCategoria(String nome) {
        return repository.findByCategoria(nome);
    }

    public List<Produto> findByMarcaId(long marcaId) {
        return repository.findByMarcaId(marcaId);
    }

    public List<Produto> findByCategoriaId(long categoriaId) {
        return repository.findByCategoriaId(categoriaId);
    }

    public List<Produto> findByPreco(Double preco) {
        return repository.findByPreco(preco);
    }
}

package br.com.springcrud.pooProject.repository;

import br.com.springcrud.pooProject.model.Marca;
import br.com.springcrud.pooProject.model.Produto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProdutoRepository extends CrudRepository<Produto, Long>, BaseRepository<Produto> {
    public List<Produto> findByMarca(String nome);
    public List<Produto> findByCategoria(String nome);
    public List<Produto> findByMarcaId(long marcaId);
    public List<Produto> findByCategoriaId(long categoriaId);
    public List<Produto> findByPreco(Double preco);
}

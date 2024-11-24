package br.com.springcrud.pooProject.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

@Entity
public class Produto extends BaseEntity{

    private double preco;
    private int altura;
    private int largura;
    private int profundidade;

    @Column(nullable = false)
    private int quantidadeEstoque;

    @ManyToOne
    private Marca marca;

    @ManyToOne
    private Categoria categoria;

    @ManyToOne(optional = false)
    private Fornecedor fornecedor;
}

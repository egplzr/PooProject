package br.com.springcrud.pooProject.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@NoArgsConstructor

@Entity
public class Fornecedor extends BaseEntity{

    @Column(nullable = false, unique = true)
    private String cnpj;

    private String telefone;

    @OneToMany(mappedBy = "fornecedor")
    private List<Produto> produtos;
}

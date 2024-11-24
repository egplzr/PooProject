package br.com.springcrud.pooProject.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

@Entity
public class Marca extends BaseEntity{
    @Column(columnDefinition = "mediumblob")
    private byte[] logo;
}

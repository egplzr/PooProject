package br.com.springcrud.pooProject.repository;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface BaseRepository <T> {
    public Optional<T> findByName(String name);
}

package com.example.springdigitalbank.repository;

import com.example.springdigitalbank.model.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {
    // Aqui você pode adicionar métodos personalizados, se necessário
}
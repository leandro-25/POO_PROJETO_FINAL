package com.example.springdigitalbank.service;

import com.example.springdigitalbank.model.Client;
import com.example.springdigitalbank.repository.ClientRepository;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public void openAccount(Client client) {
        // Lógica para abrir uma conta
        clientRepository.save(client); // Salva o cliente no banco de dados
    }

    // Outros métodos...
}
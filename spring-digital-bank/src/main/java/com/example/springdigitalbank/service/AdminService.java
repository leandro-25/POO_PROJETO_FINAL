package com.example.springdigitalbank.service;

import com.example.springdigitalbank.model.Client;
import com.example.springdigitalbank.repository.ClientRepository;
import org.springframework.stereotype.Service;

//import java.util.Optional;

@Service
public class AdminService {
    private final ClientRepository clientRepository;

    public AdminService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public Client getClient(Long id) {
        return clientRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Client not found with id: " + id));
    }

    public void openAccount(Client client) {
        clientRepository.save(client); // Salva o cliente no banco de dados
    }

    // Outros métodos podem ser adicionados aqui
}
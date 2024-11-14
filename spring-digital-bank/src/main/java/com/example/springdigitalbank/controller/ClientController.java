package com.example.springdigitalbank.controller;

import org.springframework.stereotype.Controller; // Corrigido de Client para Cliente
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.springdigitalbank.model.Client;
import com.example.springdigitalbank.service.ClientService;

@Controller
@RequestMapping("/client")
public class ClientController {
    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/open-account")
    public String openAccountForm(Model model) {
        model.addAttribute("client", new Client()); // Alterado de Client para Cliente
        return "client/open_account";
    }

    @PostMapping("/open-account")
    public String openAccount(@ModelAttribute Client client) { // Alterado de Client para Cliente
        clientService.openAccount(client);
        return "redirect:/client/balance";
    }

    // Other methods for deposit, withdraw, transfer, and balance
}

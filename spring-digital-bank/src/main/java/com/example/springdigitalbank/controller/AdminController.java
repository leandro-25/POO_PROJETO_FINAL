package com.example.springdigitalbank.controller;

import com.example.springdigitalbank.model.Client;
import com.example.springdigitalbank.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/client/{id}")
    public String getClient(@PathVariable Long id, Model model) {
        Client client = adminService.getClient(id);
        model.addAttribute("client", client);
        return "clientDetails"; // Nome da view que você está retornando
    }

    @PostMapping("/client")
    public String openAccount(@ModelAttribute Client client) {
        adminService.openAccount(client);
        return "redirect:/admin/clients"; // Redirecionar após abrir a conta
    }

    // Outros métodos podem ser adicionados aqui
}
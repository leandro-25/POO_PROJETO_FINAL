package org.example.jogadores_futebol.controller;

import org.example.jogadores_futebol.model.Jogador;
import org.example.jogadores_futebol.service.JogadorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/jogadores-view")
public class JogadorViewController {

    private final JogadorService jogadorService;

    public JogadorViewController(JogadorService jogadorService) {
        this.jogadorService = jogadorService;
    }

    @GetMapping
    public String listarTodos(Model model) {
        model.addAttribute("jogadores", jogadorService.listarTodos());
        return "lista-jogadores";
    }
    
    @GetMapping("/novo")
    public String mostrarFormularioCadastro(Model model) {
        model.addAttribute("jogador", new Jogador());

        return "form-jogador";
    }

    @PostMapping("/salvar")
    public String salvarJogador(@ModelAttribute Jogador jogador) {
        // Se o jogador já tem ID, é uma atualização. Caso contrário, é uma criação.
        if (jogador.getId() != null) {
            jogadorService.salvar(jogador); // Método de atualização no seu serviço
        } else {
            jogadorService.salvar(jogador); // Método de criação no seu serviço
        }
        return "redirect:/jogadores-view";
    }

    @GetMapping("/editar/{id}")
    public String mostrarFormularioEdicao(@PathVariable(name = "id") int id, Model model) {
        // Recupera o jogador com o ID convertido para Long
        Jogador jogador = jogadorService.buscarPorId((long) id);


        
        if (jogador != null) {
            model.addAttribute("jogador", jogador);  // Adiciona o jogador ao modelo
            return "form-jogador";  // Retorna a página de edição
        } else {
            return "redirect:/jogadores-view";  // Caso jogador não seja encontrado, redireciona
        }
    }

    @GetMapping("/deletar/{id}")
    public String deletarJogador(@PathVariable Long id) {
        jogadorService.deletar(id);
        return "redirect:/jogadores-view";
    }
}

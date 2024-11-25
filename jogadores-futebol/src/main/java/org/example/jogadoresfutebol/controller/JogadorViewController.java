package org.example.jogadoresfutebol.controller;

import org.example.jogadoresfutebol.model.Jogador;
import org.example.jogadoresfutebol.service.JogadorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
        jogadorService.salvar(jogador);
        return "redirect:/jogadores-view";
    }

    @GetMapping("/editar/{id}")
    public String mostrarFormularioEdicao(@PathVariable Long id, Model model) {
        Jogador jogador = jogadorService.buscarPorId(id);
        model.addAttribute("jogador", jogador);
        return "form-jogador";
    }

    @GetMapping("/deletar/{id}")
    public String deletarJogador(@PathVariable Long id) {
        jogadorService.deletar(id);
        return "redirect:/jogadores-view";
    }
}

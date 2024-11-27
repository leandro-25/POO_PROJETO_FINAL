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

/**
 * Controlador para gerenciar a visualização de jogadores de futebol.
 * Este controlador gerencia as rotas que exibem e manipulam dados de jogadores na interface do usuário.
 */
@Controller
@RequestMapping("/jogadores-view")
public class JogadorViewController {

    private final JogadorService jogadorService;

    /**
     * Construtor para injetar o serviço de jogadores.
     *
     * @param jogadorService Instância de {@link JogadorService} para manipulação de jogadores.
     */
    public JogadorViewController(JogadorService jogadorService) {
        this.jogadorService = jogadorService;
    }

    /**
     * Exibe a lista de todos os jogadores.
     *
     * @param model Objeto do tipo {@link Model} para adicionar atributos à view.
     * @return Nome da página "lista-jogadores" que exibe todos os jogadores.
     */
    @GetMapping
    public String listarTodos(Model model) {
        model.addAttribute("jogadores", jogadorService.listarTodos());
        return "lista-jogadores";
    }

    /**
     * Exibe o formulário para cadastrar um novo jogador.
     *
     * @param model Objeto do tipo {@link Model} para adicionar atributos à view.
     * @return Nome da página "form-jogador" para cadastro.
     */
    @GetMapping("/novo")
    public String mostrarFormularioCadastro(Model model) {
        model.addAttribute("jogador", new Jogador());
        return "form-jogador";
    }

    /**
     * Salva um jogador no banco de dados (criação ou atualização).
     *
     * @param jogador Objeto do tipo {@link Jogador} com os dados a serem salvos.
     * @return Redirecionamento para a rota "/jogadores-view" após salvar.
     */
    @PostMapping("/salvar")
    public String salvarJogador(@ModelAttribute Jogador jogador) {
        jogadorService.salvar(jogador);
        return "redirect:/jogadores-view";
    }

    /**
     * Exibe o formulário para editar os dados de um jogador existente.
     *
     * @param id    ID do jogador a ser editado.
     * @param model Objeto do tipo {@link Model} para adicionar atributos à view.
     * @return Nome da página "form-jogador" para edição ou redirecionamento caso o jogador não seja encontrado.
     */
    @GetMapping("/editar/{id}")
    public String mostrarFormularioEdicao(@PathVariable(name = "id") int id, Model model) {
        Jogador jogador = jogadorService.buscarPorId((long) id);

        if (jogador != null) {
            model.addAttribute("jogador", jogador);
            return "form-jogador";
        } else {
            return "redirect:/jogadores-view";
        }
    }

    /**
     * Deleta um jogador pelo ID.
     *
     * @param id ID do jogador a ser deletado.
     * @return Redirecionamento para a rota "/jogadores-view" após a exclusão.
     */
    @GetMapping("/deletar/{id}")
    public String deletarJogador(@PathVariable Long id) {
        jogadorService.deletar(id);
        return "redirect:/jogadores-view";
    }
}

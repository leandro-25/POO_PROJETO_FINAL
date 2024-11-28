package org.example.jogadores_futebol.controller;

import java.util.List;

import org.example.jogadores_futebol.model.Jogador;
import org.example.jogadores_futebol.service.JogadorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

/**
 * Controlador REST para gerenciar jogadores de futebol.
 * Oferece Endpoints para CRUD (Create, Read, Update, Delete).
 */
@RestController
@RequestMapping("/jogadores")
public class JogadorController {

    private final JogadorService jogadorService;

    /**
     * Construtor da classe JogadorController.
     *
     * @param jogadorService Serviço responsável por manipular as operações com jogadores.
     */
    public JogadorController(JogadorService jogadorService) {
        this.jogadorService = jogadorService;
    }

    /**
     * Lista todos os jogadores cadastrados.
     *
     * @return Lista de jogadores.
     */
    @GetMapping
    public List<Jogador> listarTodos() {
        return jogadorService.listarTodos();
    }

    /**
     * Salva um novo jogador no sistema.
     *
     * @param jogador Objeto jogador a ser salvo.
     * @return Jogador salvo, encapsulado em uma ResponseEntity.
     */
    @PostMapping
    @Operation(summary = "Salva um novo jogador", description = "Adiciona um novo jogador ao sistema.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Jogador salvo com sucesso"),
            @ApiResponse(responseCode = "400", description = "Erro de validação nos dados do jogador")
    })
    public ResponseEntity<Jogador> salvar(@RequestBody Jogador jogador) {
        Jogador jogadorSalvo = jogadorService.salvar(jogador);
        return ResponseEntity.ok(jogadorSalvo);
    }

    /**
     * Busca um jogador pelo ID.
     *
     * @param id Identificador único do jogador.
     * @return Jogador encontrado, encapsulado em uma ResponseEntity.
     */
    @GetMapping("/{id}")
    public ResponseEntity<Jogador> buscarPorId(@PathVariable Long id) {
        Jogador jogador = jogadorService.buscarPorId(id);
        return ResponseEntity.ok(jogador);
    }

    /**
     * Atualiza os dados de um jogador existente.
     *
     * @param id                Identificador único do jogador a ser atualizado.
     * @param jogadorAtualizado Objeto contendo os novos dados do jogador.
     * @return Jogador atualizado, encapsulado em uma ResponseEntity, ou 404 se o jogador não for encontrado.
     */
    @PutMapping("/{id}")
    public ResponseEntity<Jogador> atualizar(@PathVariable Long id, @RequestBody Jogador jogadorAtualizado) {
        Jogador jogadorExistente = jogadorService.buscarPorId(id);
        if (jogadorExistente == null) {
            return ResponseEntity.notFound().build(); // Retorna 404 se o jogador não existir
        }
        jogadorExistente.setNome(jogadorAtualizado.getNome());
        jogadorExistente.setIdade(jogadorAtualizado.getIdade());
        jogadorExistente.setPosicao(jogadorAtualizado.getPosicao());
        jogadorExistente.setDisponibilidade(jogadorAtualizado.getDisponibilidade());
        jogadorExistente.setSalario(jogadorAtualizado.getSalario());
        jogadorExistente.setClubesAnteriores(jogadorAtualizado.getClubesAnteriores());
        Jogador jogadorSalvo = jogadorService.salvar(jogadorExistente);
        return ResponseEntity.ok(jogadorSalvo);
    }

    /**
     * Deleta um jogador pelo ID.
     *
     * @param id Identificador único do jogador a ser deletado.
     * @return Resposta vazia (204 No Content) ao concluir a exclusão.
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        jogadorService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}

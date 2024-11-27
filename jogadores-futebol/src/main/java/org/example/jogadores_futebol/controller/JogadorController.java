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

@RestController
@RequestMapping("/jogadores")
public class JogadorController {

    private final JogadorService jogadorService;

    public JogadorController(JogadorService jogadorService) {
        this.jogadorService = jogadorService;
    }

    @GetMapping
    public List<Jogador> listarTodos() {
        return jogadorService.listarTodos();
    }

    @PostMapping
    public ResponseEntity<Jogador> salvar(@RequestBody Jogador jogador) {
        Jogador jogadorSalvo = jogadorService.salvar(jogador);
        return ResponseEntity.ok(jogadorSalvo);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Jogador> buscarPorId(@PathVariable Long id) {
        Jogador jogador = jogadorService.buscarPorId(id);
        return ResponseEntity.ok(jogador);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Jogador> atualizar(@PathVariable Long id, @RequestBody Jogador jogadorAtualizado) {
        Jogador jogadorExistente = jogadorService.buscarPorId(id);
        if (jogadorExistente == null) {
            return ResponseEntity.notFound().build();  // Retorna 404 se o jogador não existir
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
    

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        jogadorService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}

package org.example.jogadoresfutebol.controller;

import org.example.jogadoresfutebol.model.Jogador;
import org.example.jogadoresfutebol.service.JogadorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

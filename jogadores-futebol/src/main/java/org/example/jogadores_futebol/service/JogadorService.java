package org.example.jogadores_futebol.service;

import java.util.List;

import org.example.jogadores_futebol.model.Jogador;
import org.example.jogadores_futebol.repository.JogadorRepository;
import org.springframework.stereotype.Service;

@Service
public class JogadorService {

    private final JogadorRepository jogadorRepository;

    public JogadorService(JogadorRepository jogadorRepository) {
        this.jogadorRepository = jogadorRepository;
    }

    public List<Jogador> listarTodos() {
        return jogadorRepository.findAll();
    }

    public Jogador salvar(Jogador jogador) {
        return jogadorRepository.save(jogador);
    }

    public Jogador buscarPorId(Long id) {
        return jogadorRepository.findById(id).orElseThrow(() ->
                new IllegalArgumentException("Jogador não encontrado com ID: " + id));
    }

    public void deletar(Long id) {
        jogadorRepository.deleteById(id);
    }

}
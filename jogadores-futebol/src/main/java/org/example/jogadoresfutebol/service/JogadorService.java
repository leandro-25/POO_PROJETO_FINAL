package org.example.jogadoresfutebol.service;

import org.example.jogadoresfutebol.model.Jogador;
import org.example.jogadoresfutebol.repository.JogadorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

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

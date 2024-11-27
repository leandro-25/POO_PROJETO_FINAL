package org.example.jogadores_futebol.service;

import java.util.List;

import org.example.jogadores_futebol.model.Jogador;
import org.example.jogadores_futebol.repository.JogadorRepository;
import org.springframework.stereotype.Service;

/**
 * Classe de serviço responsável por gerenciar as operações relacionadas à entidade Jogador.
 * Utiliza o repositório para interagir com o banco de dados.
 */
@Service
public class JogadorService {

    // Dependência do repositório para interagir com a camada de persistência.
    private final JogadorRepository jogadorRepository;

    /**
     * Construtor da classe JogadorService.
     * @param jogadorRepository O repositório usado para interagir com os dados dos jogadores.
     */
    public JogadorService(JogadorRepository jogadorRepository) {
        this.jogadorRepository = jogadorRepository;
    }

    /**
     * Retorna uma lista com todos os jogadores registrados no banco de dados.
     * @return Uma lista de objetos Jogador.
     */
    public List<Jogador> listarTodos() {
        return jogadorRepository.findAll();
    }

    /**
     * Salva um novo jogador ou atualiza um jogador existente no banco de dados.
     * @param jogador O objeto Jogador a ser salvo.
     * @return O objeto Jogador salvo.
     */
    public Jogador salvar(Jogador jogador) {
        return jogadorRepository.save(jogador);
    }

    /**
     * Busca um jogador no banco de dados com base no ID fornecido.
     * @param id O ID do jogador a ser buscado.
     * @return O objeto Jogador encontrado.
     * @throws IllegalArgumentException Se nenhum jogador for encontrado com o ID fornecido.
     */
    public Jogador buscarPorId(Long id) {
        return jogadorRepository.findById(id).orElseThrow(() ->
                new IllegalArgumentException("Jogador não encontrado com ID: " + id));
    }

    /**
     * Remove um jogador do banco de dados com base no ID fornecido.
     * @param id O ID do jogador a ser removido.
     */
    public void deletar(Long id) {
        jogadorRepository.deleteById(id);
    }
}

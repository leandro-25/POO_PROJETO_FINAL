package org.example.jogadores_futebol.repository;

import org.example.jogadores_futebol.model.Jogador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JogadorRepository extends JpaRepository<Jogador, Long> {
}

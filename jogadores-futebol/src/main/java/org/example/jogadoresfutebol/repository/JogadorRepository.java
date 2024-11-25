package org.example.jogadoresfutebol.repository;

import org.example.jogadoresfutebol.model.Jogador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JogadorRepository extends JpaRepository<Jogador, Long> {
}

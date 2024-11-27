package org.example.jogadores_futebol.repository;

import org.example.jogadores_futebol.model.Jogador;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Interface de repositório para a entidade {@link Jogador}.
 * <p>
 * Esta interface utiliza o {@link JpaRepository} para fornecer métodos padrão
 * de manipulação de dados, como salvar, atualizar, deletar e buscar registros
 * da tabela associada à entidade {@link Jogador}.
 * </p>
 *
 * <p>
 * A implementação desta interface é gerada automaticamente pelo Spring Data JPA
 * no momento da execução, eliminando a necessidade de implementar métodos
 * básicos manualmente.
 * </p>
 */
public interface JogadorRepository extends JpaRepository<Jogador, Long> {
}

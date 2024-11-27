package org.example.jogadores_futebol.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Representa um jogador de futebol com informações sobre seu perfil, posição,
 * clubes anteriores e status no mercado.
 */
@Entity
public class Jogador {

    /**
     * Identificador único do jogador no banco de dados.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Nome do jogador. Este campo é obrigatório.
     */
    @Column(nullable = false)
    private String nome;

    /**
     * Idade do jogador. Este campo é obrigatório.
     */
    @Column(nullable = false)
    private int idade;

    /**
     * Posição do jogador em campo (exemplo: atacante, goleiro, zagueiro). Este
     * campo é obrigatório.
     */
    @Column(nullable = false)
    private String posicao;

    /**
     * Disponibilidade do jogador no mercado. Pode assumir valores como "Compra",
     * "Venda", "Empréstimo" ou "Livre". Este campo é obrigatório.
     */
    @Column(nullable = false)
    private String disponibilidade;

    /**
     * Salário do jogador em uma unidade monetária específica. Este campo é
     * obrigatório.
     */
    @Column(nullable = false)
    private double salario;

    /**
     * Lista de clubes pelos quais o jogador já passou em sua carreira.
     */
    @ElementCollection
    private List<String> clubesAnteriores;

    // Getters e Setters

    /**
     * Obtém o identificador único do jogador.
     *
     * @return ID do jogador.
     */
    public Long getId() {
        return id;
    }

    /**
     * Define o identificador único do jogador.
     *
     * @param id ID do jogador.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Obtém o nome do jogador.
     *
     * @return Nome do jogador.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do jogador.
     *
     * @param nome Nome do jogador.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém a idade do jogador.
     *
     * @return Idade do jogador.
     */
    public int getIdade() {
        return idade;
    }

    /**
     * Define a idade do jogador.
     *
     * @param idade Idade do jogador.
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * Obtém a posição do jogador em campo.
     *
     * @return Posição do jogador.
     */
    public String getPosicao() {
        return posicao;
    }

    /**
     * Define a posição do jogador em campo.
     *
     * @param posicao Posição do jogador.
     */
    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    /**
     * Obtém o status de disponibilidade do jogador no mercado.
     *
     * @return Disponibilidade do jogador.
     */
    public String getDisponibilidade() {
        return disponibilidade;
    }

    /**
     * Define o status de disponibilidade do jogador no mercado.
     *
     * @param disponibilidade Disponibilidade do jogador.
     */
    public void setDisponibilidade(String disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    /**
     * Obtém o salário atual do jogador.
     *
     * @return Salário do jogador.
     */
    public double getSalario() {
        return salario;
    }

    /**
     * Define o salário atual do jogador.
     *
     * @param salario Salário do jogador.
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * Obtém a lista de clubes pelos quais o jogador já passou.
     *
     * @return Lista de clubes anteriores.
     */
    public List<String> getClubesAnteriores() {
        return clubesAnteriores;
    }

    /**
     * Define a lista de clubes pelos quais o jogador já passou.
     *
     * @param clubesAnteriores Lista de clubes anteriores.
     */
    public void setClubesAnteriores(List<String> clubesAnteriores) {
        this.clubesAnteriores = clubesAnteriores;
    }
}

package org.example.jogadores_futebol.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Classe que representa um jogador de futebol no sistema.
 * <p>
 * Contém informações sobre o nome, idade, posição, disponibilidade para transações
 * (como compra ou venda), salário e clubes anteriores.
 */
@Entity
public class Jogador {

    /**
     * Identificador único do jogador, gerado automaticamente pelo banco de dados.
     * Este campo é oculto na documentação Swagger.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(hidden = true)
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
     * Posição do jogador em campo (exemplo: "Atacante", "Goleiro"). Este campo é obrigatório.
     */
    @Column(nullable = false)
    private String posicao;

    /**
     * Disponibilidade do jogador para transações. Exemplos: "Compra", "Venda", "Empréstimo", "Livre".
     * Este campo é obrigatório.
     */
    @Column(nullable = false)
    private String disponibilidade;

    /**
     * Salário atual do jogador. Este campo é obrigatório.
     */
    @Column(nullable = false)
    private double salario;

    /**
     * Histórico de clubes anteriores do jogador, armazenado como uma string delimitada por vírgulas.
     * Este campo é obrigatório.
     */
    @Column(nullable = false)
    private String clubesAnteriores;

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
     * Obtém a disponibilidade do jogador para transações.
     *
     * @return Disponibilidade do jogador.
     */
    public String getDisponibilidade() {
        return disponibilidade;
    }

    /**
     * Define a disponibilidade do jogador para transações.
     *
     * @param disponibilidade Disponibilidade do jogador.
     */
    public void setDisponibilidade(String disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    /**
     * Obtém o salário do jogador.
     *
     * @return Salário do jogador.
     */
    public double getSalario() {
        return salario;
    }

    /**
     * Define o salário do jogador.
     *
     * @param salario Salário do jogador.
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * Obtém o histórico de clubes anteriores do jogador como uma string.
     *
     * @return Histórico de clubes anteriores.
     */
    public String getClubesAnteriores() {
        return clubesAnteriores;
    }

    /**
     * Define o histórico de clubes anteriores do jogador como uma string.
     *
     * @param clubesAnteriores Histórico de clubes anteriores.
     */
    public void setClubesAnteriores(String clubesAnteriores) {
        this.clubesAnteriores = clubesAnteriores;
    }

}

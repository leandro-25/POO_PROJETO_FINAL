package org.example.jogadores_futebol.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Jogador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private int idade;

    @Column(nullable = false)
    private String posicao;

    @Column(nullable = false)
    private String disponibilidade; // Exemplo: "Compra", "Venda", "Empréstimo", "Livre"

    @Column(nullable = false)
    private double salario;

    @Column(nullable = false)
    private String clubesAnteriores; // Agora é uma String simples com delimitadores

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(String disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getClubesAnteriores() {
        return clubesAnteriores;
    }

    public void setClubesAnteriores(String clubesAnteriores) {
        this.clubesAnteriores = clubesAnteriores;
    }

    // Método para adicionar um novo clube à string de clubes anteriores
    public void adicionarClubeAnterior(String clube) {
        if (this.clubesAnteriores == null || this.clubesAnteriores.isEmpty()) {
            this.clubesAnteriores = clube;
        } else {
            this.clubesAnteriores += "," + clube; // Adiciona com vírgula como delimitador
        }
    }

    // Método para obter os clubes anteriores como um array
    public String[] obterClubesAnteriores() {
        if (this.clubesAnteriores != null && !this.clubesAnteriores.isEmpty()) {
            return this.clubesAnteriores.split(","); // Divide a string em um array usando a vírgula
        }
        return new String[0]; // Retorna um array vazio se não houver clubes anteriores
    }
}

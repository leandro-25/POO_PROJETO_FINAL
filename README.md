# POO_PROJETO_FINAL

Um sistema CRUD (Create, Read, Update, Delete) para gerenciamento de jogadores de futebol, desenvolvido com **Java**, utilizando **Spring Framework** para a lógica de negócios e **MySQL** como banco de dados relacional. Este projeto aplica conceitos de Programação Orientada a Objetos (POO) em um ambiente Full Stack.

## Funcionalidades

- **Adicionar Jogadores**: Insere novos jogadores no sistema.
- **Visualizar Jogadores**: Lista jogadores cadastrados com seus detalhes.
- **Atualizar Informações**: Permite editar os dados de um jogador, como salário, posição e status.
- **Remover Jogadores**: Exclui jogadores do sistema.
- **Gerenciamento Avançado**: Integração com banco de dados para armazenar todas as informações de forma persistente.

### Campos do Jogador

- **ID**: Identificação única do jogador.
- **Nome do Jogador**: Nome completo.
- **Time**: Nome do time ao qual o jogador pertence.
- **Status**: Situação do jogador (Indisponível, À venda, Emprestado, Livre no mercado).
- **Passe**: Valor de mercado do passe.
- **Salário**: Remuneração mensal do jogador.
- **Posição**: Posição no campo (Ex.: Atacante, Goleiro, etc.).
- **Idade**: Idade do jogador.

## Tecnologias Utilizadas

- **Java**: Linguagem principal para a implementação.
- **Spring Framework**: Para inversão de controle, injeção de dependência e desenvolvimento rápido.
- **MySQL**: Banco de dados relacional para armazenamento de informações.
- **Hibernate**: Para mapeamento objeto-relacional (ORM).
- **Maven**: Gerenciador de dependências.

## Como Executar

### Pré-requisitos
- Java JDK 11+
- MySQL instalado e configurado
- Maven
- IDE como IntelliJ IDEA ou Eclipse

### Passos
1. Clone este repositório:
   ```bash
   git clone https://github.com/leandro-25/POO_PROJETO_FINAL.git

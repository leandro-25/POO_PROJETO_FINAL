# Jogadores de Futebol - Sistema de Gerenciamento

Este repositório contém um sistema CRUD (Create, Read, Update, Delete) para gerenciamento de jogadores de futebol, desenvolvido em Java utilizando o Spring Framework e Spring Boot para a lógica de negócios e MySQL como banco de dados relacional. O sistema permite a criação, leitura, atualização e exclusão de informações sobre jogadores, incluindo dados como nome, idade, posição, disponibilidade, salário e clubes anteriores. Este projeto aplica conceitos de Programação Orientada a Objetos (POO) em um ambiente Full Stack.

## Tecnologias Utilizadas
- **Java**: Linguagem de programação principal.
- **Spring Boot**: Framework para desenvolvimento de aplicações Java.
- **Spring Data JPA**: Para interação com o banco de dados usando JPA (Java Persistence API).
- **H2 Database**: Banco de dados em memória para desenvolvimento e testes.
- **Thymeleaf**: Motor de template para renderização de páginas HTML.
- **Maven**: Gerenciador de dependências e construção de projetos.

## Funcionalidades

- **Adicionar Jogadores**: Insere novos jogadores no sistema.
- **Visualizar Jogadores**: Lista jogadores cadastrados com seus detalhes.
- **Atualizar Informações**: Permite editar os dados de um jogador, como salário, posição e status.
- **Remover Jogadores**: Exclui jogadores do sistema.
- **Buscar Jogador por ID**: Recupera as informações de um jogador específico.
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

## Endpoints da API

### Jogadores
- **GET** `/jogadores`: Lista todos os jogadores.
- **POST** `/jogadores`: Adiciona um novo jogador.
- **GET** `/jogadores/{id}`: Busca um jogador pelo ID.
- **PUT** `/jogadores/{id}`: Atualiza as informações de um jogador existente.
- **DELETE** `/jogadores/{id}`: Deleta um jogador pelo ID.

### Interface do Usuário
- **GET** `/jogadores-view`: Exibe a lista de jogadores em uma interface web.
- **GET** `/jogadores-view/novo`: Exibe o formulário para adicionar um novo jogador.
- **POST** `/jogadores-view/salvar`: Salva um novo jogador ou atualiza um existente.
- **GET** `/jogadores-view/editar/{id}`: Exibe o formulário para editar um jogador.
- **GET** `/jogadores-view/deletar/{id}`: Deleta um jogador e redireciona para a lista.

## SWAGGER da API

http://localhost:8080/swagger-ui/index.html#/

## Estrutura do Projeto
O projeto é organizado nas seguintes pastas principais:

### `src/main/java/org/example/jogadores_futebol`
- **controller**: Contém as classes responsáveis pelo controle das requisições HTTP e pela interação com o serviço.
    - `JogadorController.java`: Controlador REST para operações CRUD.
    - `JogadorViewController.java`: Controlador para operações de visualização e interação com a interface do usuário.
- **model**: Contém a classe `Jogador`, que representa a entidade do jogador no banco de dados.
- **repository**: Contém a interface `JogadorRepository`, que estende `JpaRepository` para operações de banco de dados.
- **service**: Contém a classe `JogadorService`, que implementa a lógica de negócios.
- `JogadoresFutebolApplication.java`: Classe principal que inicia a aplicação Spring Boot.

### `src/test/java/org/example/jogadores_futebol`
- `JogadoresFutebolApplicationTests.java`: Classe de teste para verificar se a aplicação carrega corretamente.

## Como Executar

### Pré-requisitos
- Java JDK 11+
- MySQL instalado e configurado
- Maven
- IDE como IntelliJ IDEA ou Eclipse

## Instruções de Instalação

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu_usuario/jogadores-futebol.git
   cd jogadores-futebol

-   Compile e execute a aplicação:
    Copiar código:
   ```bash       
    mvn spring-boot:run
```

-   Acesse a aplicação no navegador em: [http://localhost:8080/jogadores-view](http://localhost:8080/jogadores-view).
## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests.


## Licença

Este projeto está licenciado sob a MIT License. Veja o arquivo `LICENSE` para mais detalhes.

## Contato

Para mais informações, você pode entrar em contato com o autor do projeto através do e-mail:
- gustavo.barros7@fatec.sp.gov.br
- leandro.mariano@fatec.sp.gov.br
- thiago.foganholo@fatec.sp.gov.br













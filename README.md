# Projeto Algalog API

Este repositório implementa uma API de gerenciamento de entregas, com controle de status e registro de ocorrência. Aplicação foi desenvolvida em Java durante o evento MSR da Algaworks. 

## Pré-requisitos

- JDK: 11 
- Maven
- Database: Mysql 8.0
- IDE: IntelliJ IDEA
- Teste de endpoints: Postman/insomnia; 

## Configuração do Ambiente

1. Clone este repositório em sua máquina local.
2. Certifique-se de ter instalado todos os pré-requisitos listados acima.
3. Importe o projeto.
4. Configure as propriedades do banco de dados no arquivo `application.properties`.
5. Execute o comando `mvn clean install` para baixar as dependências e construir o projeto.

## Executando a Aplicação

1. Execute a classe principal `AlgalogApiApplication.java` como uma aplicação Java.
2. A aplicação estará disponível em `http://localhost:8080`.

## Estrutura do Projeto

- `src/main/java`: Contém o código-fonte da aplicação.
- `src/main/resources`: Contém arquivos de configuração, como `application.properties`.
- `db/migration`: Contém os scripts de migração do Flyway.



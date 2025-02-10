# TODO List

Esta API gerencia tarefas através da implementação de um CRUD completo.

Para executar o projeto, será necessário instalar os seguintes programas:

* [JDK 17.0.6: Necessário para executar o projeto Java](https://www.oracle.com/java/technologies/downloads/?er=221886)
* [Maven 3.9.6: Necessário para realizar o build do projeto Java](https://maven.apache.org/download.cgi)
* [IntelliJ IDEA: Para desenvolvimento do projeto](https://www.jetbrains.com/idea/download/?section=windows)
* [MySQL 8.0.36: Banco de dados utilizado utilizado para armazenar as informações da aplicação](https://dev.mysql.com/downloads/installer/)

## Tecnologias utilizadas

* [Spring Boot](https://spring.io/projects/spring-boot)
* [Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
* [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
* [SpringDoc OpenAPI 3](https://springdoc.org/)
* [MySQL](https://dev.mysql.com/downloads/)

## Práticas Adotadas

* SOLID, DRY, YAGNI, KISS
* API REST
* Consultas com Spring Data JPA
* Injeção de Dependências
* Tratamento de respostas de erro
* Geração automática do Swagger com a OpenAPI 3

## Como Executar

* Clonar repositório git
* Construir o projeto:

```
./mvnw clean package
```

* Executar a aplicação:
```
java -jar target/todolist-0.0.1-SNAPSHOT.jar
```


A aplicação poderá ser acessada em [localhost:8080](). O Swagger poderá ser visualizado em [localhost:8080/swagger-ui.html]()

## API Endpoints

Para fazer as requisições HTTP abaixo, foi utilizada a ferramenta [Postman](https://www.postman.com/):

* Criar Tarefa

**Endpoint:**`POST localhost:8080/todos`

**Body (JSON):**

```json
[
  {
    "descricao": "Desc Todo 1",
    "id": 1,
    "nome": "Todo 1",
    "prioridade": 1,
    "realizado": false
  }
]
```

* Listar Tarefas

**Endpoint:**
`GET localhost:8080/todos`

**Response (JSON):**

```json
[
  {
    "descricao": "Desc Todo 1",
    "id": 1,
    "nome": "Todo 1",
    "prioridade": 1,
    "realizado": false
  }
]
```
* Atualizar Tarefa

**Endpoint:**
`PUT localhost:8080/todos`

**Body (JSON):**

```json
[
  {
    "descricao": "Desc Todo 1",
    "id": 1,
    "nome": "Todo 1 Up",
    "prioridade": 2,
    "realizado": false
  }
]
```

* Remover Tarefa 

**Endpoint:**
`DELETE localhost:8080/todos/1`

**Response (JSON)**:

```json
[ ]
```

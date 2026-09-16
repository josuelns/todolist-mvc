# todolist-mvc

API REST minimalista de **lista de tarefas** com camadas MVC clássicas: Controller → Service → Repository → JPA sobre **H2 em memória**.

Projeto de estudo em **Java/Spring Boot** — foco em contratos REST e separação de responsabilidades.

## Stack

- Java 21 · Spring Boot 4 · Spring Web · Spring Data JPA · H2

## Como rodar

```bash
./gradlew bootRun
```

API disponível em http://localhost:8080

## Endpoints REST

| Método | Rota | Descrição |
|---|---|---|
| `GET` | `/api/todos` | Lista todas as tarefas |
| `GET` | `/api/todos/{id}` | Busca por ID |
| `POST` | `/api/todos` | Cria tarefa |
| `PUT` | `/api/todos/{id}` | Atualiza tarefa |
| `DELETE` | `/api/todos/{id}` | Remove tarefa |

## Testes

```bash
./gradlew test
```

## Evolução

Este projeto é a base conceitual do [tasks-api-spring](https://github.com/josuelns/tasks-api-spring), que adiciona MySQL, Flyway, relacionamentos e DTOs com MapStruct.

---

[Portfólio](https://josuelns.github.io/) · [GitHub](https://github.com/josuelns)

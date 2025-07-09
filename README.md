API Autores e Livros

API em Java com Spring Boot para gerenciar autores e seus livros. O sistema simula operações de CRUD para as entidades autor e livro, com relacionamento One-To-Many

Estrutura do projeto

controller(Camada responsável pelas rotas e requisições)

service (Camada de lógica de negócios)

repositories (Camada que simula acesso a dados)model (Classes de modelo)

dto (Classes DTO para comunicação entre camadas)

LivrosAutorApplication.java (Classe principal)



Endpoints de autores

Métodos

GET - listar todos os autores

GET - buscar autor por ID

POST - adicionar novo autor

PUT - atualizar autor

DELETE - excluir um autor


Endpoints de livros

Métodos

GET - listar todos os livros

GET - buscar livro por ID

POST - adicionar novo livro

PUT - atualizar livro

DELETE - excluir um livro



Tecnologias usadas

Java, Spring Boot, API REST, DTOs, Estrutura em camadas (Controller, Service, Repository, Model)

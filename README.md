<div align="center">
  
# AnimeVerse

Este é o repositório back-end do **AnimeVerse**, uma wiki interativa de animes. Aqui estão implementadas todas as regras de negócio, estrutura de dados e APIs REST que se comunicam com o front-end feito em React + Vite.

Desenvolvido com **Java 17** e **Spring Boot**, o backend oferece suporte robusto e escalável para gerenciamento de animes e usuários.

</div>

---

## 🌐 Visão Geral

Bem-vindo ao **AnimeVerse**! 🎉 Lançado neste vibrante 1º de julho de 2025 às 16:57 (horário de Brasília), este é um projeto apaixonado por animes, trazendo uma wiki interativa que une um frontend dinâmico em React + Vite a um backend robusto em Java 17 e Spring Boot. 🚀

### O que é o AnimeVerse?
O **AnimeVerse** é uma plataforma onde os fãs podem explorar, gerenciar e interagir com uma coleção de animes e usuários. Ele oferece:
- 📱 **Frontend**: Uma interface moderna construída com React, organizada em componentes como `AnimeCard` e páginas como `Home` e `AnimeDetail`, otimizada pelo Vite para performance ágil.
- 🛠️ **Backend**: Um sistema em Spring Boot que gerencia regras de negócio, dados (via JPA) e APIs REST (ex.: `/api/animes`), com suporte a funcionalidades como cadastro, atualização e exclusão de animes e usuários.

### Propósito
Desenvolvido como um exercício prático, o AnimeVerse busca criar uma experiência imersiva para amantes de animes, permitindo buscar, cadastrar e gerenciar conteúdos com facilidade. Com uma arquitetura modular e escalável, o projeto é uma base sólida para futuras expansões, como integração de mais funcionalidades ou comunidades de usuários. 🌱

---

## 📌 Funcionalidades

| Função                         | Descrição                                                   |
|-------------------------------|-------------------------------------------------------------|
| 🔍 **Buscar animes**           | Listagem de todos os animes disponíveis                     |
| ➕ **Cadastrar anime**         | Permite adicionar um novo anime à base de dados            |
| ✏️ **Atualizar anime**        | Edita informações de um anime existente                     |
| ❌ **Deletar anime**           | Remove um anime da base de dados                            |
| 🧑‍💼 **Gerenciamento de usuários** | Cadastro, listagem e administração básica dos usuários |

---

## 📂 Estrutura do Projeto (Backend)

Abaixo está a organização dos arquivos e pastas do backend, projetada para otimizar o desenvolvimento e a manutenção do sistema.

| **Pasta/Arquivo**         | **Descrição**                              |
|---------------------------|--------------------------------------------|
| `backend/`                | Contém todo o código-fonte do back-end.    |
| - `main/`                 | Código principal da aplicação.             |
|   - `java/`               | Classes Java.                              |
|     - `com/minverse/`     | Pacote base do projeto.                    |
|       - `controller/`     | Controllers REST (ex.: `AnimeController`, `UserController`). |
|       - `model/`          | Entidades JPA (ex.: `Anime.java`, `User.java`). |
|       - `repository/`     | Interfaces Spring Data JPA (ex.: `AnimeRepository`). |
|     - `BackendApplication.java` | Classe principal do Spring Boot.          |
|   - `resources/`          | Arquivos de configuração e recursos estáticos. |
|     - `static/`           | Arquivos estáticos (CSS, JS, imagens).     |
|     - `templates/`        | Templates HTML (se usar Thymeleaf).        |
|     - `application.properties` | Configurações do Spring (BD, porta, etc.). |
|   - `test/`               | Testes unitários/integração.               |
|     - `java/com/minverse/` | Classes de teste (ex.: `AnimeControllerTest.java`). |

Essa estrutura reflete um design modular e escalável, facilitando a expansão e a manutenção do backend.


## 📂 Estrutura do Projeto (Frontend)

Abaixo está a organização dos arquivos e pastas do frontend, projetada para otimizar o desenvolvimento e a manutenção da aplicação.

| **Pasta/Arquivo**         | **Descrição/Responsabilidade**                          |
|---------------------------|--------------------------------------------------------|
| `frontend/`               | Contém todo o código-fonte do front-end.               |
| - `public/`               | Arquivos públicos (ex.: `vite.svg`, favicon, etc.).    |
| - `src/`                  | Código-fonte principal da aplicação React.             |
|   - `assets/`             | Recursos estáticos como imagens e outros arquivos.     |
|   - `components/`         | Componentes reutilizáveis do React (ex.: `AnimeCard.jsx`, `AnimeCard.css`). |
|   - `pages/`              | Páginas da aplicação (ex.: `AnimeDetail.jsx`, `Home.jsx`). |
|   - `App.jsx`             | Componente principal da aplicação React.               |
|   - `index.css`           | Estilização global da aplicação.                      |
|   - `index.js`            | Ponto de entrada do JavaScript.                       |
| - `README.md`             | Documentação geral do projeto.                        |
| - `eslint.config.js`      | Configurações de linting para o código.               |
| - `package-lock.json`     | Garante consistência nas dependências instaladas.     |
| - `package.json`          | Lista dependências e scripts do projeto.              |
| - `vite.config.js`        | Configurações do Vite para build e desenvolvimento.   |
| - `.gitignore`            | Arquivos e pastas a serem ignorados pelo Git.         |

Essa estrutura reflete um design modular e escalável, facilitando a expansão e a manutenção do frontend.

---

## 📦 Organização de Pacotes (Backend)

Abaixo está a organização lógica dos pacotes e pastas do backend, projetada para otimizar o desenvolvimento e a manutenção da aplicação.

| **Pasta/Arquivo**         | **Descrição/Responsabilidade**                          |
|---------------------------|--------------------------------------------------------|
| `main/`                   | Contém o código principal da aplicação.                |
| - `java/`                 | Agrupa todas as classes Java do projeto.              |
|   - `com/minverse/`       | Define o pacote base e a estrutura lógica do projeto.  |
|     - `controller/`       | Gerencia os endpoints da API REST (ex.: `AnimeController`). |
|     - `model/`            | Contém as entidades do banco (ex.: `Anime.java`, `User.java`). |
|     - `repository/`       | Define interfaces que comunicam com o banco via Spring Data JPA. |
|     - `BackendApplication.java` | Classe principal que inicializa o Spring Boot.    |
| `resources/`              | Armazena arquivos de configuração, templates e recursos estáticos. |
| - `static/`               | Contém arquivos estáticos (CSS, JS, imagens).         |
| - `templates/`            | Gerencia templates HTML (se usar Thymeleaf).          |
| - `application.properties` | Configurações do Spring (BD, porta, etc.).           |
| `test/`                   | Contém os testes unitários e de integração.           |
| - `java/com/minverse/`    | Define classes de teste (ex.: `AnimeControllerTest.java`). |

Essa organização reflete um design modular e escalável, facilitando a expansão e a manutenção do backend.****

## 📦 Organização de Pacotes (Frontend)

Abaixo está a organização lógica dos pacotes e pastas do frontend, projetada para otimizar o desenvolvimento e a manutenção da aplicação.

| **Pasta/Arquivo**    | **Descrição/Responsabilidade**                     |
|-----------------------|----------------------------------------------------|
| `public/`            | Contém arquivos públicos e estáticos (ex.: `vite.svg`, favicon). |
| `src/`               | Contém o código-fonte principal da aplicação React. |
| - `assets/`          | Armazena recursos estáticos como imagens e outros arquivos. |
| - `components/`      | Define componentes reutilizáveis da interface (ex.: `AnimeCard.jsx`). |
| - `pages/`           | Gerencia as páginas da aplicação (ex.: `Home.jsx`, `AnimeDetail.jsx`). |
| - `App.jsx`          | Componente raiz que integra a estrutura da aplicação. |
| - `index.css`        | Estiliza globalmente a aplicação.                  |
| - `index.js`         | Ponto de entrada e inicialização do JavaScript.    |

Essa organização reflete um design modular e escalável, facilitando a expansão e a manutenção do frontend.

---

## 🚀 Tecnologias Utilizadas

### Front-end

- [React](https://reactjs.org/)
- [Vite](https://vitejs.dev/)

### Back-end

- [Java 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Maven](https://maven.apache.org/)

---

## 📄 Endpoints da API (Exemplos)

| Método | Rota                  | Descrição                          |
|--------|-----------------------|------------------------------------|
| GET    | `/api/animes`         | Retorna todos os animes            |
| POST   | `/api/animes`         | Cria um novo anime                 |
| PUT    | `/api/animes/{id}`    | Atualiza um anime existente        |
| DELETE | `/api/animes/{id}`    | Deleta um anime                    |
| GET    | `/api/usuarios`       | Retorna todos os usuários          |
| POST   | `/api/usuarios`       | Cadastra novo usuário              |

---

## 🔧 Como Rodar o Projeto

### Pré-requisitos

- Java 17
- Node.js (recomendado: versão 18+)
- Maven (ou usar `./mvnw`)

---

### ⬇️ Clonando o Repositório

```bash
git clone https://github.com/SeuUsuario/AnimeVerse.git
cd AnimeVerse
``

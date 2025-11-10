# Chat-Real-Time

# <a href="https://www.youtube.com/watch?v=qiTa1eJh9JI&feature=youtu.be">Clique aqui !! </a>

Ah, você quer uma **descrição (README)** para o seu projeto de chat em tempo real no GitHub\! Isso é essencial para que outros desenvolvedores entendam o que o projeto faz e como executá-lo.

Aqui está um modelo de README em Markdown, que você pode salvar como `README.md` na raiz do seu projeto antes de enviá-lo para o GitHub:

-----

# 💬 Chat Application (Spring Boot & WebSocket)

Este é um projeto simples de aplicação de chat em tempo real construído com **Spring Boot** no backend e **WebSockets** (utilizando STOMP e SockJS) no frontend.

## ✨ Recursos

  * **Comunicação em Tempo Real:** Utiliza WebSockets para envio e recebimento instantâneo de mensagens.
  * **Backend Robusto:** Desenvolvido com Spring Boot.
  * **Protocolo STOMP:** Utilizado para criar um *message broker* simples (`/topic/messages`).
  * **Frontend Simples:** Interface construída com HTML, JavaScript e Bootstrap.

## 🛠️ Tecnologias Utilizadas

  * **Backend:** Java 17+ e Spring Boot
  * **WebSockets:** Spring Messaging e SockJS/STOMP
  * **Frontend:** HTML5, CSS (Bootstrap 5.x) e JavaScript

## 🏗️ Estrutura do Projeto

O projeto segue a estrutura padrão do Spring Boot:

```
.
├── src/main/java/com/chat/app/
│   ├── AppApplication.java
│   ├── config/
│   │   └── WebSocketConfig.java  # Configurações de STOMP e Endpoints
│   ├── controller/
│   │   └── ChatController.java   # Mapeamento de Mensagens e Rotas
│   └── model/
│       └── ChatMenssage.java     # Modelo de Dados da Mensagem (Payload)
├── src/main/resources/
│   └── static/
│       └── chat.html             # Frontend da Aplicação (HTML/JS)
├── pom.xml                       # Dependências do Maven
└── README.md                     # Este arquivo
```

## 🚀 Como Executar

### Pré-requisitos

  * JDK (Java Development Kit) 17 ou superior
  * Maven ou Gradle
  * Uma IDE (IntelliJ IDEA, VS Code, Eclipse)

### Passos de Execução

1.  **Clone o Repositório**

    ```bash
    git clone https://github.com/SeuUsuario/Seu-Repositorio.git
    cd Seu-Repositorio
    ```

2.  **Compile e Execute**
    Utilize o Maven Wrapper para iniciar a aplicação:

    ```bash
    ./mvnw spring-boot:run
    ```

    *(Se estiver usando Windows, use `mvnw spring-boot:run`)*

3.  **Acesse a Aplicação**
    Após iniciar, a aplicação estará disponível em `http://localhost:8080`.
    A página de chat está na rota:

    ```
    http://localhost:8080/chat
    ```


<img width="1755" height="943" alt="image" src="https://github.com/user-attachments/assets/6ef55d29-d9b5-43e2-ac64-271ae83cd03c" />




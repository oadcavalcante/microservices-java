<div align="center">

🐇

# Microservices Java

**Microsserviços Spring Boot de usuários e e-mails comunicando de forma assíncrona via RabbitMQ.**

<br />

[![Repositório público](https://img.shields.io/badge/repo-público-2ea44f?style=flat-square&logo=github&logoColor=white)](https://github.com/oadcavalcante/microservices-java)

<br />

[![Java 17](https://img.shields.io/badge/Java-ED8B00?style=flat-square&logoColor=fff&logo=openjdk)](https://github.com/oadcavalcante/microservices-java) [![Spring Boot 3.5](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=flat-square&logoColor=fff&logo=springboot)](https://github.com/oadcavalcante/microservices-java) [![Spring AMQP](https://img.shields.io/badge/Spring_AMQP-555555?style=flat-square)](https://github.com/oadcavalcante/microservices-java) [![Spring Data JPA](https://img.shields.io/badge/Spring_Data_JPA-555555?style=flat-square)](https://github.com/oadcavalcante/microservices-java) [![Spring Mail](https://img.shields.io/badge/Spring_Mail-555555?style=flat-square)](https://github.com/oadcavalcante/microservices-java) [![SpringDoc OpenAPI](https://img.shields.io/badge/SpringDoc_OpenAPI-555555?style=flat-square)](https://github.com/oadcavalcante/microservices-java)

[![RabbitMQ](https://img.shields.io/badge/RabbitMQ-FF6600?style=flat-square&logoColor=fff&logo=rabbitmq)](https://github.com/oadcavalcante/microservices-java) [![PostgreSQL](https://img.shields.io/badge/PostgreSQL-4169E1?style=flat-square&logoColor=fff&logo=postgresql)](https://github.com/oadcavalcante/microservices-java)

[![Docker](https://img.shields.io/badge/Docker-2496ED?style=flat-square&logoColor=fff&logo=docker)](https://github.com/oadcavalcante/microservices-java)

<br />

[Stack completa ↓](#stack)

<br />

[Documentação](https://github.com/oadcavalcante/microservices-java/blob/main/README.md) · [Deploy](#deploy) · [API](http://localhost:8081/users) · [Issues](https://github.com/oadcavalcante/microservices-java/issues)

</div>

## Features

- ✨ Microsserviço user publica mensagens na fila ao cadastrar usuário
- 🚀 Microsserviço email consome fila e envia e-mails via Spring Mail
- ⚡ PostgreSQL e RabbitMQ orquestrados com Docker Compose
- 🎯 APIs REST documentadas com SpringDoc OpenAPI
- 🔧 Perfis docker com application-docker.yml para cada serviço

## Getting Started

| Ambiente | Comando / Link |
|----------|----------------|
| Primeira vez | `docker-compose up` |
| Documentação | [README](https://github.com/oadcavalcante/microservices-java/blob/main/README.md) |
| Produção | N/A |

## Stack

- **Backend:** Java 17, Spring Boot 3.5, Spring AMQP, Spring Data JPA, Spring Mail, SpringDoc OpenAPI
- **Dados:** RabbitMQ, PostgreSQL
- **Infra / DevOps:** Docker

---

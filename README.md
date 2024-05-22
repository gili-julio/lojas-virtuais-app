# Documentação Técnica do App

O +próximo app tem como objetivo ajudar os usuários a comparar lojas cadastradas no app e realizar pedidos. Permitindo visualizar as lojas, seus itens e preços, suas avaliações e feedbacks.

## Sumário

- [Objetivo](#objetivo)
- [Visão Geral](#visão-geral)
- [Requisitos do App](#requisitos-do-app)
- [Design do Banco de Dados](#design-do-banco-de-dados)
- [Endpoints da API](#endpoints-da-api)
- [Telas](#telas)
- [Testes](#testes)
- [Manutenção e Suporte](#manutenção-e-suporte)
- [Como instalar](#como-instalar)

## Objetivo

Fornecer um aplicativo intuitivo para o gerenciamento de lojas e produtos, de pedidos e de avaliações.

## Visão Geral

**Componentes Principais:**
 - Frontend: Aplicativo mobile (Android) desenvolvido em Kotlin
 - Backend: API desenvolvida em Java com Spring Boot ([github-repo](https://github.com/gili-julio/backend-loja-virtual))
 - Banco de Dados: a definir...

**Principais Funcionalidades:**
 - Visualização de Lojas cadastradas
 - Pesquisa de produtos e/ou lojas
 - Avaliar lojas com/sem comentários
 - Realizar compras
 - Criação e/ou exclusão e/ou edição de perfil

## Requisitos do App

**Requisitos Funcionais**
 - O app deve permitir que o usuário crie/exclua/edite/entre seu perfil
 - O app deve permitir que o usuário visualize todas as lojas cadastradas
 - O app deve permitir que o usuário pesquise qualquer produto e/ou loja
 - O app deve permitir que o usuário (com perfil logado) avalie qualquer loja cadastrada
 - O app deve permitir que o usuário (com perfil logado) possa realizar compras em qualquer loja cadastrada

**Requisitos Secundários**
- O app deve ser acessível em qualquer dispositivo móvel
- O app deve disponibilizar diversos filtros e ordem para a pesquisa de lojas e/ou produtos
- O app deve informar o usuário sobre o status atual de sua compra
- ...

## Design do Banco de Dados

### Modelo de dados

**Lojas (stores)**
 - `id`: Identificador único da loja
 - `name`: Nome da loja
 - `category`: Categoria da loja (Ex: eletronicos, roupas)
 - `createdAt`: Data do cadastro da loja no app
 - `updateAt`: Data da última alteração no cadastro da loja

**Produtos (itens)**
 - `id`: Identificador único do produto
 - `store.id`: Identificador da loja que o produto foi cadastrado
 - `createdAt`: Data do cadastro do produto no app
 - `updateAt`: Data da última alteração no cadastro do produto

**Usuários (users)**
 - `id`: Identificador único do usuário
 - `createdAt`: Data do cadastro do usuário no app
 - `updateAt`: Data da última alteração no cadastro do usuário

## Endpoints da API

### Endpoints

 - Citar os métodos e endpoints da API, exemplo:
 - **(GET) "/lojas":** Retorna todas as lojas
 ```json
 {
  "lojas": ["exemplar", "de novo imoveis"],
  "total": "2"
 }
 ```

## Telas

 - Inicial: ...
 - Login: ...
 - Perfil do Usuário: ...

## Testes

 - Citar os testes realizados depois

## Manutenção e Suporte

 - Citar como é feita a manutenção
 - Citar por onde entrar em contato para suporte

## Como instalar

 - Citar por onde e como pode ser feita a instalação

# System of Heroes

## Sobre o Projeto

Este projeto consiste em um sistema que cadastra diferentes tipos de heróis e simula seus ataques baseados em suas classes (tipos). Cada herói possui um nome, idade e tipo, e realiza um ataque específico de acordo com sua categoria.

## Funcionalidades

- Cadastro de heróis com nome, idade e tipo
- Diferentes tipos de heróis disponíveis:
  - **Wizard** - Ataque com magia
  - **Warrior** - Ataque com espada
  - **Monk** - Ataque com artes marciais
  - **Ninja** - Ataque com shuriken
  - **Archer** - Ataque padrão (caso não identificado)

## Estrutura do Projeto

O projeto é composto por duas classes principais:

### `Hero.java`
Classe principal que define as propriedades e comportamentos dos heróis:
- **Atributos**: name, age, type
- **Métodos**: 
  - `title()` - Exibe o título do sistema
  - `attack()` - Determina e executa o ataque baseado no tipo do herói

### `Main.java`
Classe responsável por executar o programa:
- Cria uma lista de heróis com diferentes tipos
- Itera sobre os heróis exibindo suas informações e ataques

## Exemplo de Uso

# Gerenciador de Tarefas (TO-DO List)

Um aplicativo simples de linha de comando desenvolvido em Java para gerenciar uma lista de tarefas pessoais. Este projeto demonstra conceitos fundamentais de programação orientada a objetos, estruturas de dados e interface de usuário em console.

## O que o programa faz

Este gerenciador permite que você:
- Crie uma lista de tarefas com IDs únicos
- Adicione novas tarefas à sua lista
- Remova tarefas específicas usando seu ID
- Visualize todas as suas tarefas cadastradas
- Navegue por um menu interativo simples

## Funcionalidades detalhadas

### 1. Adicionar Tarefa
- Solicita uma descrição da tarefa
- Atribui automaticamente um ID único
- Confirma a adição da tarefa

### 2. Remover Tarefa
- Lista está vazia: informa que não há tarefas
- Solicita o ID da tarefa a ser removida
- Confirma se a tarefa foi removida ou se o ID não foi encontrado

### 3. Listar Tarefas
- Mostra todas as tarefas com seus IDs e descrições
- Informa se a lista está vazia

### 4. Sair
- Encerra o programa de forma segura

## Estrutura do código

### Main.java
Classe principal que contém:
- Menu interativo com loop
- Lógica de controle do programa
- Gerenciamento da lista de tarefas
- Entrada e saída de dados

### Tarefa.java
Classe modelo que representa uma tarefa:
- Atributos: id (int) e descricao (String)
- Construtor para criar novas tarefas
- Métodos getter e setter
- Método toString para exibição formatada

## Conceitos de programação demonstrados

- **Programação Orientada a Objetos**: Classes, objetos, encapsulamento
- **Estruturas de dados**: ArrayList para armazenar tarefas
- **Controle de fluxo**: Switch-case, loops do-while
- **Tratamento de entrada**: Scanner para capturar dados do usuário
- **Expressões lambda**: removeIf() para remoção condicional

## Como executar

### Pré-requisitos
- Java Development Kit (JDK) 8 ou superior instalado
- Terminal ou prompt de comando

### Passos para execução

1. **Clone ou baixe o projeto**

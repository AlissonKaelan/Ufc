# Documentação do Projeto: Sistema de Lutas

## Descrição

Este projeto implementa um sistema simples de gerenciamento de lutas entre lutadores. O sistema permite criar lutadores, definir suas características e realizar lutas entre eles, registrando vitórias, derrotas e empates.

## Estrutura do Projeto

O projeto é composto por três classes principais:

1. **Lutador**: Representa um lutador com atributos como nome, nacionalidade, idade, altura, peso, categoria e estatísticas de luta (vitórias, derrotas e empates).
2. **Luta**: Gerencia a luta entre dois lutadores, verificando se a luta pode ser realizada e determinando o vencedor aleatoriamente.
3. **Main**: Classe principal que inicializa o sistema, cria lutadores e executa uma luta.

## Classe Lutador

### Atributos

- `nome`: Nome do lutador.
- `nacionalidade`: Nacionalidade do lutador.
- `idade`: Idade do lutador.
- `altura`: Altura do lutador em metros.
- `peso`: Peso do lutador em quilogramas.
- `categoria`: Categoria do lutador (Leve, Médio, Pesado ou Inválido).
- `vitorias`: Número de vitórias do lutador.
- `derrotas`: Número de derrotas do lutador.
- `empates`: Número de empates do lutador.

### Métodos

- **Construtor**: Inicializa um novo lutador com os atributos fornecidos.
- **Métodos Getters e Setters**: Permitem acessar e modificar os atributos do lutador.
- **apresentar()**: Exibe as informações do lutador.
- **status()**: Exibe o status do lutador, incluindo sua categoria e estatísticas de luta.
- **ganharLuta()**: Incrementa o número de vitórias.
- **perderLuta()**: Incrementa o número de derrotas.
- **empataLuta()**: Incrementa o número de empates.

## Classe Luta

### Atributos

- `desafiado`: Lutador que está sendo desafiado.
- `desafiante`: Lutador que está desafiando.
- `rouds`: Número de rounds da luta (não utilizado no momento).
- `aprovado`: Indica se a luta foi aprovada.

### Métodos

- **marcaLuta(Lutador lutador1, Lutador lutador2)**: Verifica se os lutadores estão na mesma categoria e se são diferentes, e aprova a luta se as condições forem atendidas.
- **lutar()**: Realiza a luta, apresentando os lutadores e determinando um vencedor aleatoriamente.

## Classe Main

### Método main

- Cria um array de lutadores e inicializa cada um com suas características.
- Cria uma instância da classe `Luta`, marca uma luta entre dois lutadores e executa a luta.
- Exibe o status dos lutadores após a luta.

## Exemplo de Uso

```java
public static void main(String[] args) {
    Lutador Lutadores[] = new Lutador[6];
    
    Lutadores[0] = new Lutador("Alisson", "Brasil", 20, 1.78f, 78.9f, 30, 2, 1);
    Lutadores[1] = new Lutador("John", "EUA", 25, 1.85f, 85.0f, 20, 5, 3);
    Lutadores[2] = new Lutador("Kenta", "Japão", 28, 1.75f, 70.0f, 15, 2, 1);
    Lutadores[3] = new Lutador("Carlos", "Argentina", 30, 1.80f, 82.5f, 25, 10, 5);
    Lutadores[4] = new Lutador("Mike", "Canadá", 27, 1.90f, 90.0f, 18, 4, 2);
    Lutadores[5] = new Lutador("Carol", "Africa", 22, 1.65f, 60.0f, 10, 1, 0);
    
    Luta Ufc01 = new Luta();
    Ufc01.marcaLuta(Lutadores[0], Lutadores[3]);
    Ufc01.lutar();
    Lutadores[0].status();
    Lutadores[3].status();
}
```


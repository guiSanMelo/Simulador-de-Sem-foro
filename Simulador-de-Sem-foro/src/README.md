# Simulador de Mobilidade Urbana com Controle de Semáforos - Mockup Java

Este projeto fornece a base para o desenvolvimento de um simulador de tráfego urbano usando conceitos de grafos, semáforos inteligentes e controle de mobilidade. O objetivo é permitir que os alunos implementem e testem heurísticas para otimização do trânsito, tempo de espera e consumo energético.

## Estrutura do Projeto

```
simulador/
├── Simulador.java
├── Main.java
├── cidade/
│   ├── Mapa.java
│   ├── Intersecao.java
│   ├── Rua.java
│   └── Grafo.java  (interface/abstrata, a ser implementada pelos alunos)
├── trafego/
│   ├── cidade.Veiculo.java
│   └── GeradorVeiculos.java
├── semaforo/
│   ├── Semaforo.java
│   ├── ControladorSemaforos.java
│   └── ModoOperacao.java
├── heuristica/
│   └── HeuristicaControle.java
```

## Responsabilidades das Classes

- **Simulador**: controla o tempo da simulação, serialização e execução.
- **Mapa**: representa a cidade como um grafo com ruas (arestas) e interseções (nós).
- **Rua**: define atributos como capacidade, direção e tempo de travessia.
- **Intersecao**: ponto onde ruas se encontram, podendo conter semáforo.
- **Grafo**: interface base para estrutura de grafo (a ser implementada pelos alunos).
- **cidade.Veiculo**: contém origem, destino e rota; realiza travessias.
- **GeradorVeiculos**: cria veículos aleatórios com origem e destino.
- **Semaforo**: controla o tempo de verde, amarelo e vermelho.
- **ControladorSemaforos**: ajusta o ciclo de semáforos conforme heurísticas.
- **ModoOperacao**: enumeração com: CICLO_FIXO, TEMPO_ESPERA, CONSUMO.
- **HeuristicaControle**: lógica adaptativa de controle dos semáforos.

## O que não está implementado

- As **estruturas internas do grafo, filas e listas** devem ser implementadas pelos alunos.
- A **algoritmo de Dijkstra** será fornecido externamente e não está incluso.

## Tarefas dos Alunos

- Implementar a estrutura do grafo, filas de veículos, pilhas e listas.
- Completar os métodos com lógica de movimentação, controle de fluxo e análise estatística.
- Adaptar os ciclos dos semáforos aos modos de operação (heurísticas).

## Execução

Compilar:
```bash
javac simulador/**/*.java
```

Executar:
```bash
java simulador.Main
```

## Considerações

- Cada segundo representa **1 minuto** de tempo simulado.
- Ao final da simulação, devem ser geradas estatísticas como tempo médio de viagem, espera e índice de congestionamento.

---
**Professor Sekeff - IFPI**
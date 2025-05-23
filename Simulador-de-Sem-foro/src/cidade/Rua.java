package cidade;

import tads.Fila;

import java.util.Scanner;

public class Rua {
    private Intersecao origem;
    private Intersecao destino;
    private int tempoTravessia;

    public Rua(Intersecao origem, Intersecao destino, int tempo) {
        this.origem = origem;
        this.destino = destino;
        this.tempoTravessia = tempo;
    }

    public int getTempoTravessia() {
        return tempoTravessia;
    }

    //Aqui a gente guardar os carros gerados antes mandar eles para outra intersecção
    public void receberCarro(){
        Fila fila = new Fila();
        int emissao = 0;
        int consumo = 0;

        Veiculo veiculo = new Veiculo(emissao, consumo);
        fila.enqueue(veiculo);
    }

    //Aqui a gente vai definir de qual nó do gráfico essa aresta vem
    public void definirOrigem (){

    }

    //Aqui a gente define para qual nó do grafo essa aresta vai
    public void definirDestino() {

    }

}
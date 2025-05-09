package cidade;

import tads.Fila;

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
        Fila f1 = new Fila();
        Veiculo v1 = new Veiculo(30, 30);
        Veiculo v2 = new Veiculo(35, 40);
        Veiculo v3 = new Veiculo(33, 34);
        f1.enqueue(v1);
        f1.enqueue(v2);
        f1.dequeue(v3);
    }

    //Aqui a gente vai definir de qual nó do gráfico essa aresta vem
    public void definirOrigem (){

    }

    //Aqui a gente define para qual nó do grafo essa aresta vai
    public void definirDestino() {

    }

}
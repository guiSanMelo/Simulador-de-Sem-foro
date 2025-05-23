package tads;

public class Aresta<T> {
    public Vertice origem;
    public Vertice destino;
    public Aresta<T> custo;

    public Aresta(Vertice origem, Vertice destino, Aresta custo) {
        this.origem = origem;
        this.destino = destino;
        this.custo = custo;
    }


    public <T> Aresta(Vertice destino, T peso) {
    }
}

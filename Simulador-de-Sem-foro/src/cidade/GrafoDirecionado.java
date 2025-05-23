package cidade;
import tads.Aresta;
import tads.ListaEncadeada;
import tads.Vertice;

import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GrafoDirecionado {
    private ListaEncadeada<Vertice> vertices;
    private ListaEncadeada<Aresta> arestas;

    private Aresta[][] listaAdjacencia;
    private int[] tamanhoListas;
    private int numVertice;
    private int maxArestasPorVertice;

    public GrafoDirecionado(int numVertice, int maxArestasPorVertice) {
        this.numVertice = numVertice;
        this.maxArestasPorVertice = maxArestasPorVertice;
        this.listaAdjacencia = new Aresta[numVertice][maxArestasPorVertice];
        this.tamanhoListas = new int[numVertice];
    }

    public <T> void adicionarVertice(Vertice v){
            if (vertices == null) {
                vertices = new ListaEncadeada<>();
            }
            vertices.add(v);
    }

    public <T> void removerVertice(Vertice v){
        if (vertices == null) {
            throw new RuntimeException("Não possui vértices nesse grafo");
        }
        vertices.remover(v);
    }

    public <T> void adicionarAresta(Vertice origem, Vertice destino, T custo){
        int origemId = origem.getId();
        int pos = tamanhoListas[origemId];

        // Verifica se não ultrapassa o máximo de arestas permitidas para o vértice
        if (pos >= maxArestasPorVertice) {
            throw new IllegalStateException("Número máximo de arestas por vértice atingido.");
        }

        listaAdjacencia[origemId][pos] = new Aresta<>(destino, custo);
        tamanhoListas[origemId]++;
    }

    public <T> void removerAresta(Vertice origem, Vertice destine){

    }

    public void exibirGrafo(){
        for (int i = 0; i<numVertice; i++){
            System.out.println("Vertice "+ i + ": ");
            for (int j = 0; j< tamanhoListas[i]; j++){
                Aresta a = listaAdjacencia[i][j];
                System.out.println("->"+ a.destino+"(peso " + a.custo +" )");
            }
            System.out.println();
        }
    }

}



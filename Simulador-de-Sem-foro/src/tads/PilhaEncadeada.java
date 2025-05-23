package tads;

public class PilhaEncadeada<T> {
    private No<T> topo;
    private int tamanho;

    public PilhaEncadeada() {//Aqui a
        this.topo = null;
        this.tamanho = 0;
    }

    // Verifica se a pilha está vazia
    public boolean estaVazia() {
        return topo == null;
    }

    // Empilha um elemento no topo
    public void empilhar(T valor) {
        No<T> novoNo = new No<>(valor); //Aqui cria o elemento a ser adicionado
        if (estaVazia()){
            topo = novoNo; //Atribui o valor do topo ao novo No
            tamanho++; //Aumenta o tamanho da Pilha
            return;
        }
        novoNo.prox = topo; //Aponta para o topo atual
        topo = novoNo; //Atualiza o topo para o novoNo
        tamanho++;
    }

    // Desempilha o elemento do topo e retorna ele
    public T desempilhar() {
        if (estaVazia()) { //Se tiver vazia lança uma exceção
            throw new RuntimeException("Pilha vazia!");
        }
        T dado = topo.getValor(); //Pega o valo do dado que está no topo
        topo = topo.prox; //Atualiza o novo valor do topo
        tamanho--; //Diminui o tamanho da Pilha
        return dado; //Retorna o dado retirado
    }

    // Retorna o elemento do topo sem remover
    public T topo() {
        if (estaVazia()) {
            throw new RuntimeException("Pilha vazia!");
        }
        return topo.getValor();
    }

    // Retorna o tamanho da pilha
    public int tamanho() {
        return tamanho;
    }

    /* Limpa a pilha -> Esse metodo é mais simples em Java do que em C por conta do Garbage Colector
                        que evita o vazamento de memória*/
    public void limpar() {
        topo = null; //Anula a referência pro topo e portando a pilha toda
        tamanho = 0; //Torna o tamanho 0
    }
}

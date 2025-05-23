package tads;

public class ListaEncadeada<T> {
    private No<T> inicio;
    private int tamanho;

    public ListaEncadeada() {
        this.inicio = null;
    }

    public void add(T valor) {
        add(valor, tamanho);  // Chama a versão com 2 parâmetros para adicionar no fim
    }

    public boolean add(T elemento, int p) {
        No<T> novoNo = new No<>(elemento);

        if (p < 0 || p > tamanho) { // Se a posição estiver fora do tamanho da Lista
            throw new RuntimeException("Essa posição é inválida");
        }

        if (p == 0) { // Se a posição for 0, insere no início
            novoNo.prox = inicio;
            inicio = novoNo;
            return true;
        }

        No<T> atual = inicio;
        int i = 0;
        while (atual != null && i < p - 1) { // Vai até a posição p-1
            atual = atual.prox;
            i++;
        }

        if (atual == null) {
            throw new RuntimeException("Posição não existe");
        }

        novoNo.prox = atual.prox; // Faz o novo nó apontar para o próximo
        atual.prox = novoNo; // Faz o nó anterior apontar para o novo nó

        return true;
    }

    public boolean remover(T valor) {
        // Caso a lista esteja vazia
        if (inicio == null) {
            throw new RuntimeException("Lista está vazia");
        }

        // Se o nó que quero remover é o primeiro
        if (inicio.getValor().equals(valor)) {
            inicio = inicio.prox;
            return true;
        }

        // Procurar pelo nó a ser removido
        No<T> atual = inicio;
        while (atual.prox != null && !atual.prox.getValor().equals(valor)) {
            atual = atual.prox;
        }

        // Se encontrou o nó para remoção
        if (atual.prox != null) {
            atual.prox = atual.prox.prox; // Remove o nó alterando o ponteiro do nó anterior
            return true;
        }

        // Se não encontrou o valor na lista
        return false;
    }

    public T obter(int indice) {

        if (indice < 0 || indice >= tamanho) throw new IndexOutOfBoundsException();

        No<T> atual = primeiro;
        for (int i = 0; i < indice; i++) {
            atual = atual.prox;
        }
        return atual.getValor();
    }

    public int tamanho() {
        return tamanho;
    }

}


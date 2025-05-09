package tads;

public class ListaDinamica<T>{
    private No<T> inicio;

    public ListaDinamica() {
        this.inicio = null;
    }

    public boolean add (T elemento, int p){
        No<T> novoNo = new No<T>(elemento);

        if(p<0){ //Se a posição não existir
            throw new RuntimeException("Essa posição é inválida");
        }

        if (p == 0){ //Se a lista estiver vazia
            novoNo.prox = inicio;
            inicio = novoNo;
            return true;
        }

        No<T> atual = inicio;
        int i = 0;
        while (atual!=null && i<p-1){
            atual = atual.prox;
            i++;
        }

        if (atual==null){
            throw new RuntimeException("Posição não existe"); //Se a posição não existir
        }

        novoNo.prox = atual.prox;
        atual.prox = novoNo;

        return true;
    }

    public boolean remover(T valor) {
        if (inicio == null) {
            throw new RuntimeException("Lista está vazia");};

        // Se o nó que quero remover é o primeiro
        if (inicio.getValor() == valor) {
            inicio = inicio.prox;
            return true;
        }

        // achar nó antes do a ser removido
        No<T> atual = inicio;
        while (atual.prox != null && atual.prox.getValor() != valor) {
            atual = atual.prox;
        }

        // Valor encontrado
        if (atual.prox != null) {
            atual.prox = atual.prox.prox;
            return true;
        }


        return false; // Valor não encontrado
    }


}

package tads;

public class Fila<T> {

    private No<T> head; // Referência para o início da fila
    private No<T> tail; // Referência para o final da fila
    private int tamanho; //

    public Fila() {
        this.head = null;
        this.tail = null;
        this.tamanho = 0;
    }

    //Verifica se a fila esta vazia
    public boolean estaVazia() {
        return (head == null); // Retorna true se não houver elementos.
    }

    // Insere novo elemento no final da fila
    public void enqueue(T elemento) {

        No<T> novoNo = new No<T>(elemento);


        if (this.estaVazia()) {
            head = novoNo;
            tail = novoNo;
        } else {
            novoNo.prox = head;
            head = novoNo;
        }
        tamanho++;
    }


    //Remove o primeiro elemento da fila (tail)

    public void dequeue (T valor) {
        if (estaVazia()) {
            throw new RuntimeException("A lista está vazia");
        }

        if (this.tail == null) {
            this.head = null;
        }

        int valorRemovido = tail.getValor();

        No<T> atual = head;
        while (atual.prox != tail) {
            atual = atual.prox;
        }

        tail = atual;
        atual.prox = null;

        tamanho --;
    }

    public void primeiro () {
        if (estaVazia()){
            throw new RuntimeException("Não há veículos nessa rua");
        }
    }

}

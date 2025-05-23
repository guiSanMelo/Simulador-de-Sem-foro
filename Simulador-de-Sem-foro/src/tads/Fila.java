package tads;

public class Fila<T> {

    private No<T> head; // Referência para o início da fila
    private No<T> tail; // Referência para o final da fila
    private int tamanho; // Tamanho da fila

    public Fila() { //Construtor para inicializar a fila
        this.head = null;
        this.tail = null;
        this.tamanho = 0;
    }

    // Verifica se a fila está vazia
    public boolean estaVazia() {
        return (head == null); // Retorna true se não houver elementos
    }

    // Insere novo elemento no final da fila
    public void enqueue(T elemento) {
        No<T> novoNo = new No<T>(elemento);

        if (this.estaVazia()) { // Se ela tiver vazia, o head e o tail serão iguais
            head = novoNo;
            tail = novoNo;
        } else {
            tail.prox = novoNo; // Adiciona o novo nó no final da fila
            tail = novoNo; // Atualiza o tail para o novo nó
        }
        tamanho++;
    }

    // Remove o primeiro elemento da fila
    public void dequeue() {

        if (estaVazia()) { //Se a fila tiver vazia faz uma exceção
            throw new RuntimeException("A fila está vazia");
        }

        T valorRemovido = head.getValor(); // Armazena o valor do nó removido


        if (head == tail) { //Se tiver só um Nó esse metodo esavazia a fila
            head = null;
            tail = null;
        } else {
            head = head.prox; //O Head se torno o próximo Nó
        }

        tamanho--;//Diminui o tamanho da fila
    }

    // Retorna o primeiro valor da fila sem remover
    public T primeiro() {
        if (estaVazia()) {
            throw new RuntimeException("A fila está vazia");
        }
        return head.getValor(); // Retorna o valor do primeiro nó
    }

    // Retorna o tamanho da fila
    public int tamanho() {
        return tamanho;
    }

}


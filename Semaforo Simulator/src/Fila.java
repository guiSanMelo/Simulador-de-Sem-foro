public class Fila {

    private Veiculo head; // Referência para o início da fila (último inserido)
    private Veiculo tail; // Referência para o final da fila (primeiro a sair)
    private  int tamanho; // Quantos veículos tem na fila

    public Fila () {
        this.head = null;
        this.tail = null;
        this.tamanho = 0;
    }

    //Verifica se a fila esta vazia
    public boolean estaVazia () {
        return (head == null); // Retorna true se não houver elementos.
    }

    // Insere novo elemento no final da fila
    public void enqueue (int emissao, int consumo) {

        Veiculo novo = new Veiculo (emissao, consumo); //Cria o novo veículo

        if (this.estaVazia()) {
            head = novo;
            tail = novo;
        } else {
            novo.prox = head;
            head = novo;
        }

        tamanho ++;
    }

    //Remove o primeiro elemento da fila (tail)

    public int dequeue () {
        if (estaVazia()) {
            throw new RuntimeException("Não há veículos nessa rua");
        }

        int valorRemovido = tail.getEmissao();

        Veiculo atual = head;
        while (atual.prox != tail) {
            atual = atual.prox;
        }

        tail = atual;
        atual.prox = null;

        tamanho --;

        if (this.tail == null) {
            this.head = null;
        }

        return valorRemovido;
    }

    public int primeiro () {
        if (estaVazia()){
            throw new RuntimeException("Não há veículos nessa rua");
        }

        return (tail.getEmissao());
    }

}

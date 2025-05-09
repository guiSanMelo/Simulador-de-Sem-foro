package tads;

import cidade.Veiculo;

public class ListaEstatica {

    private int[] valor; // Vetor que guarda a lista
    private int ultimo; //Ultima da lista
    private int tamanho;

    public ListaEstatica(int P) { //Define tamanho da lista
        this.tamanho = P;
        this.valor = new int[P];
        this.ultimo = -1; //Lista vazia
    }

    public boolean add (int elemento, int p) {

        if (p<0 || p>=ultimo+1||ultimo+1>tamanho){
            throw new RuntimeException("Posição inválida");
        }

        for (int i = ultimo; i>=p; i--){
            valor[i+1] = valor[i];
        }

        valor[p] = elemento; //Adiciona elemento
        ultimo++; //Atualiza a lista
        return true; // Deu certo :)
    }

    public boolean remove (int p) {
        if (p<0 || p>ultimo) {
            throw new RuntimeException("Posição inválida"); //Deu errado :(
        }

        for (int i = p; i<ultimo; i++){
            valor[i] = valor[i+1];
        }

        ultimo--;
        return true;
    }
}

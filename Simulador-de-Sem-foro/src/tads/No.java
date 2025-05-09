package tads;

public class No<T> {

    private T valor;
    No<T> prox;
    No<T> ant;

    public No(T valor) {
        this.valor = valor;
        this.prox = null;
        this.ant = null;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }
}

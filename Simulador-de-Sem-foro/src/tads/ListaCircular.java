package tads;

public class ListaCircular<T> {

    No<T> head = null;
    No<T> tail = null;

    public void add (T e){
            No<T> novoNo = new No<T>(e);
            if (head==null){
                head = novoNo;
                tail = novoNo;
                novoNo.prox = head;
            }else {
               tail.prox = novoNo;
               tail = novoNo;
               tail.prox = head;
            }
    }

    public void remover (T e) {
        if (head==null){
            throw new RuntimeException("Lista está vazia");
        }

        No<T> atual = head;
        No<T> ant = null;

        do {
            if (atual.getValor() == e) {
                if (ant != null) {
                    ant.prox = atual.prox;
                    if (atual == tail) {
                        tail = ant;
                    }
                } else {
                    if (head == tail) {
                        head = null;
                        tail = null;
                    } else {
                        head = head.prox;
                        tail.prox = head;
                    }
                }
                return;
            }
            ant = atual;
            atual = atual.prox;
        } while (atual != head);

    }

}

package semaforo;

import tads.ListaCircular;

public class Semaforo<T> {
        private No<T> estadoAtual;
        public ListaCircular estado;

        private static class No<T> {
            public T conteudo;
            public No<T> prox;

            public No(T conteudo) {
                this.conteudo = conteudo;
                this.prox = null;
            }
        }


        public Semaforo() {
            No<T> vermelho = new No<>("VERMELHO");
            No<T> verde = new No<>("VERDE");
            No<T> amarelo = new No<>("AMARELO");

            vermelho.prox = verde;
            verde.prox = amarelo;
            amarelo.prox = vermelho;

            estadoAtual = vermelho;
        }


        public void adicionarSinal(T novoSinal) {
            if (estadoAtual == null) {
                estadoAtual = new No<>(novoSinal);
                estadoAtual.prox = estadoAtual;
                return;
            }

            No<T> novoNo = new No<>(novoSinal);
            novoNo.prox = estadoAtual.prox;
            estadoAtual.prox = novoNo;
        }


        public void removerSinal(T sinal) {
            if (estadoAtual == null) return;

            No<T> atual = estadoAtual;
            No<T> anterior = null;

            do {
                if (atual.conteudo.equals(sinal)) {
                    if (anterior == null) {
                        if (atual.prox == atual) {
                        } else {

                            No<T> ultimo = estadoAtual;
                            while (ultimo.prox != estadoAtual) {
                                ultimo = ultimo.prox;
                            }
                            ultimo.prox = estadoAtual.prox;
                            estadoAtual = estadoAtual.prox;
                        }
                    } else {
                        anterior.prox = atual.prox;
                    }
                    return;
                }
                anterior = atual;
                atual = atual.prox;
            } while (atual != estadoAtual);
        }


        public void mudarSinal() {
            if (estadoAtual != null) {
                estadoAtual = estadoAtual.prox;
            }
        }


        public T getSinalAtual() {
            return (estadoAtual != null) ? estadoAtual.conteudo : null;
        }
    }
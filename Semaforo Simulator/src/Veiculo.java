public class Veiculo {

    private int emissao; // Propriedades que serão analisadas
    private int consumo;
    Veiculo prox; // Ponteiro para o próximo da fila

    public Veiculo (int emissao, int consumo) {
        this.emissao = emissao;
        this.consumo = consumo;
        this.prox = null;
    }

    public int getEmissao() {
        return emissao;
    }

    public void setEmissao(int emissao) {
        this.emissao = emissao;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }
}

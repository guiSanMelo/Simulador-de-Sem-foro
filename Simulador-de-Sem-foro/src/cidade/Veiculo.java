package cidade;

import Dijkstra.Dijkstra;

public class Veiculo {

    private int emissao; //
    private int consumo;
    public Veiculo prox; // Ponteiro para o próximo veículo da fila

    public Veiculo (int emissao, int consumo, ) {
        this.emissao = emissao;
        this.consumo = consumo;
        this.prox = null;
        Dijkstra.encontrarMenorCaminho();
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

    //Metodo para receber ps veículos do algorítimo de Dikstra?
    public void gerarVeiculo () {

    }

}

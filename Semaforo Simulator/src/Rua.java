public class Rua {

    private float comprimento;
    private int capFluxo;
    //private String direcao;
    private float tempo;

    public Rua(float comprimento, int capFluxo, float tempo) {
        this.comprimento = comprimento;
        this.capFluxo = capFluxo;
        this.tempo = tempo;
    }

    //Get e Setters, porque esses são elementos que o usuário não deve poder mexer.
    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public int getCapFluxo() {
        return capFluxo;
    }

    public void setCapFluxo(int capFluxo) {
        this.capFluxo = capFluxo;
    }

    public float getTempo() {
        return tempo;
    }

    public void setTempo(float tempo) {
        this.tempo = tempo;
    }




}

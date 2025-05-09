package cidade;

public class Intersecao {

    private String nome;


    public Intersecao(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    //Aqui a gente guarda as tuas que se chegam nessa aresta
    public void receberRua() {

    }

    //Aqui a gente guarda os semáforos desse cruzamento
    public void receberSemaforo(){
        
    }

}


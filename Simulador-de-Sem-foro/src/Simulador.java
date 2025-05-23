import java.io.*;
import java.util.Timer;
import java.util.TimerTask;

public class Simulador implements Serializable {
    private static final long serialVersionUID = 1L;

    private transient Timer timer;
    private int tempoSimulado = 0;
    private boolean pausado = false;

    public void iniciar() {
        System.out.println("Simulação iniciada...");
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                if (!pausado) {
                    tempoSimulado++;
                    atualizarSimulacao();
                }
            }
        }, 0, 1000);
    }

    public void pausar() {
        pausado = true;
    }

    public void continuarSimulacao() {
        pausado = false;
    }

    public void encerrar() {
        if (timer != null) timer.cancel();
    }

    public void gravar(String caminho) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(caminho))) {
            oos.writeObject(this);
        }
    }

    public static Simulador carregar(String caminho) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(caminho))) {
            Simulador sim = (Simulador) ois.readObject();
            sim.timer = new Timer();
            return sim;
        }
    }

    private void atualizarSimulacao() {
        System.out.println("Minuto simulado: " + tempoSimulado);
    }
}
import java.util.ArrayList;
import java.util.List;

public class Lustre implements Imprimivel {
    private List<LampadaInterface> lampadas;

    // Construtor que cria um lustre com uma quantidade específica de lâmpadas
    public Lustre(int numeroLampadas) {
        this.lampadas = new ArrayList<>();
        for (int i = 0; i < numeroLampadas; i++) {
            this.lampadas.add(new LampadaInterface());
        }
    }

    // Método para adicionar uma lâmpada ao lustre
    public void adicionarLampada(LampadaInterface lampada) {
        this.lampadas.add(lampada);
    }

    // Liga todas as lâmpadas do lustre
    public void ligar() {
        for (LampadaInterface lampada : lampadas) {
            lampada.ligar();
        }
    }

    // Desliga todas as lâmpadas do lustre
    public void desligar() {
        for (LampadaInterface lampada : lampadas) {
            lampada.desligar();
        }
    }

    @Override
    public double imprimir() {
        System.out.println("+-----------------------------------+");
        System.out.println("|           DADOS DO LUSTRE         |");
        System.out.println("+-----------------------------------+");
        System.out.println("| Quantidade de Lampadas: " + lampadas.size());
        
        for (int i = 0; i < lampadas.size(); i++) {
            System.out.println("| Lampada " + (i + 1) + ": " + lampadas.get(i).getEstado());
        }
        System.out.println("+-----------------------------------+");

        // O consumo de tinta depende da quantidade de lâmpadas no lustre
        double tintaGasta = lampadas.size() * 2.5;
        return tintaGasta;
    }
} 
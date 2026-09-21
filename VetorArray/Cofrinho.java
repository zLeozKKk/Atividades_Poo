import java.util.ArrayList;

public class Cofrinho {
    
    ArrayList<Moeda> moedas;

    public Cofrinho() {
        this.moedas = new ArrayList<>();
    }

    public boolean insere(Moeda moeda) {
        if (moedas.size() < 10) {
            moedas.add(moeda);
            System.out.println("A moeda foi inserida no cofrinho!");
            return true;
        } else {
            return false;
        }
    }

    public Moeda retira() {
        if (moedas.isEmpty()) {
            System.out.println("Não existe moedas no cofrinho.");
            return null;
        }

        int ultimaMoeda = moedas.size() - 1;
        Moeda moedaRetirada = moedas.remove(ultimaMoeda);

        System.out.println("Moeda retirada: " + moedaRetirada);
        return moedaRetirada;
    }
    
    public int getQtdadeMoedas() {
        return moedas.size();
    }

    public int getQtdadeMoedasTipo(NomeMoeda nomeMoeda) {
        int cont = 0;

        for (Moeda tipo : moedas) {
            if (tipo.getNomeMoeda() == nomeMoeda) { // Corrigido aqui
                cont++;
            }
        }
        System.out.println("Quantidade de moedas do tipo " + nomeMoeda + " é: " + cont);
        return cont;
    }

    public int getValorTotalCentavos() {
        int x = 0;
        for (Moeda centavos : moedas) {
            x += centavos.getValorCentavos();
        }
        return x;
    }

    public double getValorTotalReais() { // Corrigido aqui (double)
        double x = 0.0; // Corrigido para double
        for (Moeda reais : moedas) {
            x += reais.getValorReais();
        }
        return x;
    }
}
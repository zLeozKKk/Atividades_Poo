package heranca;

public abstract class Passagem {
    private String cpf;
    private String nome;
    private String assento;
    private double custoPassagem;

    public Passagem(String cpf, String nome, String assento, double custoPassagem) {
        this.cpf = cpf;
        this.nome = nome;
        this.assento = assento;
        this.custoPassagem = custoPassagem;
    }

    // Calcula a bagagem base (R$ 0.50 por kg)
    public double custoBagagem(int qnt, int[] pesos) {
        double pesoTotal = 0;
        for (int i = 0; i < qnt; i++) {
            pesoTotal += pesos[i];
        }
        return pesoTotal * 0.50;
    }

    // Método comum herdado por todas as subclasses
    public double defineAssento(String a) {
        setAssento(a);
        return 5.0;
    }

    // Getters e Setters
    public String getCpf() { return cpf; }
    public String getNome() { return nome; }
    public String getAssento() { return assento; }
    public void setAssento(String assento) { this.assento = assento; }
    public double getCustoPassagem() { return custoPassagem; }
}
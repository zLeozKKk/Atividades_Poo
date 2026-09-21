

public class Executive extends Passagem {
    private double milhas;

    public void setMilhas(double milhas) {
		this.milhas = milhas;
	}

	public Executive(String cpf, String nome, String assento, double custoPassagem) {
        super(cpf, nome, assento, custoPassagem);
        this.milhas = getCustoPassagem() * 0.10; 
    }

    @Override
    public double custoBagagem(int qnt, int[] pesos) {
        double pesoTotal = 0;
        if (qnt > 2) {
            for (int i = 2; i < qnt; i++) {
                pesoTotal += pesos[i];
            }
        }
        return pesoTotal * 0.50;
    }

    public double getMilhas() {
        return this.milhas;
    }
	
}
package heranca;

public class Economy extends Passagem {

    public Economy(String cpf, String nome, String assento, double custoPassagem) {
        super(cpf, nome, assento, custoPassagem);
    }

    @Override
    public double custoBagagem(int qnt, int[] pesos) {
        double custoBase = super.custoBagagem(qnt, pesos);
        return custoBase + (qnt * 10.0); // Taxa fixa adicional de R$ 10 por mala
    }
}
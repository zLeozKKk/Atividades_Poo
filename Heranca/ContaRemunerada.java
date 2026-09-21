
public class ContaRemunerada extends ContaBancaria {

    private double percentualRemuneracao; // Exemplo: 0.01 para 1%

    public ContaRemunerada(int nroConta, String nomeCorrentista, double saldo) {
        super(nroConta, nomeCorrentista, saldo);
        this.percentualRemuneracao = 0.0;
    }

    public void definePercentRemuneracao(double valor) {
        this.percentualRemuneracao = valor;
    }

    @Override
    public boolean deposito(double valor) {
        if (valor > 0) {
            // Calcula o rendimento extra no momento do depósito
            double valorComRemuneracao = valor + (valor * this.percentualRemuneracao);
            return super.deposito(valorComRemuneracao);
        }
        return false;
    }
}


public class ContaComLimite extends ContaBancaria {

    private double limite;
    private double taxaJuros;
    private double jurosGerados;

    public ContaComLimite(int nroConta, String nomeCorrentista, double saldo, double limite) {
        super(nroConta, nomeCorrentista, saldo);
        this.limite = limite;
        this.taxaJuros = 0.05; // Taxa padrão de 5%
        this.jurosGerados = 0.0;
    }

    public void defineLimite(double limite) {
        this.limite = limite;
    }

    public void defineTaxaJuros(double taxa) {
        this.taxaJuros = taxa;
    }

    public double getJuros() {
        return this.jurosGerados;
    }

    @Override
    public boolean retirada(double valor) {
        double saldoTotal = getSaldo() + this.limite;

            // verifica se o valor a ser sacado é menor que o SALDO TOTAL (saldo atual + limite)
        if (valor > 0 && valor <= saldoTotal) {
                            // eu tenho dinheiro? sim vc tem; nao vc nao tem 
           double saldoAtual = getSaldo() > 0 ? getSaldo() : 0;

            double limiteUtilizado = valor - saldoAtual;
            jurosGerados += limiteUtilizado * taxaJuros;
            setSaldo(getSaldo() - valor);
            return true;
        }
        return false;
    }

    public boolean quitaJuros() {
        if (this.jurosGerados > 0 && getSaldo() >= this.jurosGerados) {
            setSaldo(getSaldo() - this.jurosGerados);
            this.jurosGerados = 0.0;
            return true;
        }
        return false;
    }
}
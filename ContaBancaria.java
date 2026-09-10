public abstract class ContaBancaria {
    
    private int nroConta;
    private String nomeCorrentista;
    private double saldo;

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ContaBancaria(int nroConta,String nomeCorrentista,double saldo) {
        this.nroConta=nroConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = saldo;
    }

    public int getNroConta() {
        return nroConta;
    }
    public void setNroConta(int nroConta) {
        this.nroConta = nroConta;
    }
    public String getNomeCorrentista() {
        return nomeCorrentista;
    }
    public void setNomeCorrentista(String nomeCorrentista) {
        this.nomeCorrentista = nomeCorrentista;
    }
    public double getSaldo() {
        return saldo;
    }

    public boolean deposito (double valor){
        if(valor > 0){
        saldo += valor;
        return true;
    }
        return false;
    }

    public boolean retirada (double valor){
        if(valor <= saldo && valor > 0){
            saldo -= valor;
            return true;
        }
        return false;
    }

    
}

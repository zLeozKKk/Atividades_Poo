public class ClienteJuridico extends Cliente {

    private double mensalidade;

    public ClienteJuridico( String umNome ,double mensalidade) {
        super(umNome);
        this.mensalidade=mensalidade;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }
     public double getMensalidade(){
        return mensalidade;
    }
}

package Heranca;

public class PessoaJuridica extends Pessoa {
    private String razaoS;
    private int anoF; // Alterado para int (ano de fundação)
    private String cnpj;

    public PessoaJuridica(String razaoS, int anoF, String cnpj) {
        super();
        this.razaoS = razaoS;
        this.anoF = anoF;
        this.cnpj = cnpj;
    }

    public String getRazaoS() { return razaoS; }
    public void setRazaoS(String razaoS) { this.razaoS = razaoS; }
    public int getAnoF() { return anoF; }
    public void setAnoF(int anoF) { this.anoF = anoF; }
    public String getCnpj() { return cnpj; }
    public void setCnpj(String cnpj) { this.cnpj = cnpj; }
}
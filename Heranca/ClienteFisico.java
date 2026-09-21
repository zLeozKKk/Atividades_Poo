public class ClienteFisico extends Cliente {
    
    private int idade;
    private double salario;

    public ClienteFisico( String umNome , int umaIdade , double umSalario) {
        super(umNome);
        this.idade = umaIdade;
        this.salario = umSalario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override 
    public double getMensalidade(){
        return getIdade() < 60 ? salario*0.10 : salario*0.15;
    }

    

    
}

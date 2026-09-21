public class funcionarioDeRisco extends Funcionario {

    private String risco;
    public funcionarioDeRisco( String matricula, String nome,double salarioBruto ,String catRisco, String risco ) {
        super(matricula,nome, salarioBruto,catRisco);
        this.risco = risco;
    }
    
}

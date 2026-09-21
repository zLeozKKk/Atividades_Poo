public class Funcionario{
    public static final double LIM_ISENCAO_IR = 2000;
    private String matricula;
    private String nome;
    private double salarioBruto;
    private boolean insubridade; 
    private String catRisco;
    
    public Funcionario(String matricula, String nome, double salarioBruto, String catRisco){
        this.matricula = matricula;
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        
        if( catRisco == null){
            this.catRisco = catRisco;
            this.insubridade = false;
        }else{
            this.catRisco = catRisco;
            this.insubridade = true;
        }

    }

	public String getMatricula() {
		return matricula;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getSalarioBruto() {
    
		return salarioBruto;
	}
    
    public double getINSS(){
        return salarioBruto*0.1;
    }

    public double getImpRenda(){
        double adicional = (salarioBruto - getINSS())*0.25;
        double novoSB = salarioBruto + adicional;
            if (novoSB <= LIM_ISENCAO_IR){
            return 0.0;
        }else{
            double aux = novoSB - LIM_ISENCAO_IR;
            double ir = aux * 0.2;
            return ir;
 }

    }

    public double getSalarioLiquido(){
        return salarioBruto - getINSS() - getImpRenda();
    }

    public String toString() {
        String aux = "";
        aux += "Categoria: "+this.getClass().getName()+"\n";
        aux += "Matricula: "+this.getMatricula()+"\n";
        aux += "Nome: "+this.getNome()+"\n";
        aux += "Salario bruto: "+this.getSalarioBruto()+"\n";
        aux += "(-) INSS: "+this.getINSS()+"\n";
        aux += "(-) IR: "+this.getImpRenda()+"\n";
        aux += "Salario liquido: "+this.getSalarioLiquido()+"\n";
        aux += "----------";
        return aux;    
    }
}
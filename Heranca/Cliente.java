public abstract class Cliente {
    
    private String nome;

    public Cliente( String umNome) {
       this.nome = umNome; 
    }

    public String getNome() {
        return nome;
    }

    // metodo que todas as classes filhas devem ter. 

    public abstract double getMensalidade();


}

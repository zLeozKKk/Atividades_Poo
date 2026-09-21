public class VagasEstacionamento {
    
     private String [] vagas;

    public VagasEstacionamento() {
        this.vagas = new String [6];
    }

    public void estacionar (int indice, String placa ){

            if( indice < 0 || indice >= vagas.length) {
                System.out.println("Vaga inválida.");
            }

            if ( vagas [indice] == null ){
                vagas[indice] = placa;
                System.out.println("Carro " + placa + " estacionou na vaga " + indice);
            } else {
            System.out.println("Vaga " + indice + " já está OCUPADA!");
            }   
    }

    public void removerDaVaga (int indice){
             if( vagas[indice] == null ){
                    System.out.println(" A vaga já está vazia.");
             }else{
                    vagas[indice] = null;
                    System.out.println("A vaga agora está vazia.");
            }
    }

    public void mapaEstacionamento (){
        int vagasL = 0;
        int vagasNL = 0;
        for(int i = 0 ; i < vagas.length ; i ++){
            if (vagas [i] == null){
                vagasL++;
            }else {
                vagasNL++;
            }
        }
        System.out.println("Quantidade de vagas livres : " + vagasL);
        System.out.println("Quantidade de vagas ocupadas : " + vagasNL);
    }
}

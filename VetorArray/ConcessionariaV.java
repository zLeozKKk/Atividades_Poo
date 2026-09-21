import java.util.ArrayList;

public class ConcessionariaV {

    private Carro [] carros;
    
    
    public ConcessionariaV( int tam) {
        this.carros = new Carro[tam];
    } 

     //  posicao:  i   conteudo:  carros [i]
    public void adcCarro (Carro carro){

        for(int i = 0 ; i < carros.length; i ++){
            if( carros [i] == null){
            carros[i] = carro; 
            return;
            }
        }
    }

    public void removerCarro (Carro carro) {
        // verificar se existe carros adc no veotr
        // listar todos os itens do vetor  FOR; somente aquele
        // verificar se ele está la IF [i] 

        for(int i = 0 ; i < carros.length; i ++){
            if ( carros[i] != null && carros[i].equals(carro)){
                System.out.println("O seu carro foi removido.");
                carros[i] = null;
            }
        }
    }

    public void consultaCarrosVetor () {

        int qntCarros = 0 ;
    System.out.println("--- LISTA DE CARROS (VETOR) ---");
        for(int i = 0 ; i < carros.length; i ++){
            if(carros[i] != null){
            qntCarros++;
            System.out.println("Carro numero: " + i + " Info: " + carros[i]);
            }
        }
         System.out.println( " Quantidade total de carros : "+qntCarros);
    }

    public Carro consultarPlaca(String placa) {
    for (int i = 0; i < carros.length; i++) {
        // Checa se não é null E se a placa coincide (sem o ponto e vírgula após o if)
        if (carros[i] != null && carros[i].getPlaca().equalsIgnoreCase(placa)) {
            return carros[i];
        }
    }
    return null;
}

}
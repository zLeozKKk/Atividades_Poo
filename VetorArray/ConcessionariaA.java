import java.util.ArrayList;

public class ConcessionariaA {
    
    private ArrayList<Carro> carros;

    public ConcessionariaA() {
        carros = new ArrayList<>();
    }

    public void addCarro (Carro carro) {

        carros.add(carro);
        System.out.println(" Veículo adicionado!");
    }

    public void removerCarro (Carro carro){

        // verificar se o carro existe dentro do array. 

        if(carros.remove(carro)){
            System.out.println("Veículo removido");
        } else {
            System.out.println("Veículo não encontrado");
        }
    }

    public void consultarCarros () {
       System.out.println("Quantidade total de carros: "+ carros.size());
        for( int i = 0 ; i < carros.size(); i ++){
            System.out.println( carros.get(i));
       }
    }

    public Carro consultarPlaca (String placa){
        for(int i = 0 ; i < carros.size(); i ++){
            if (carros.get(i).getPlaca().equalsIgnoreCase(placa)){
                return carros.get(i);
            }
        }
        return null;
    }
}

    
public class LampadaInterface implements Imprimivel{
    public static enum EstadoLampada { Desligada, Ligada, Queimada };
    private static final double CHANCE_QUEIMAR = 0.3;

    private EstadoLampada estado;
    
    public LampadaInterface () {
        desligar();
    }
    
    public void ligar () {
        if (this.estado == EstadoLampada.Ligada)
            return; // ignorar pedido de ligar

        if (this.estado == EstadoLampada.Queimada)
            return; // manter queimada
            
        if (Math.random() < CHANCE_QUEIMAR) {
            this.estado = EstadoLampada.Queimada;
        } else {
            this.estado = EstadoLampada.Ligada;
        }
    }
    
    public void desligar () {
        if (this.estado == EstadoLampada.Queimada)
            return; // manter queimada
            
        this.estado = EstadoLampada.Desligada;
    }
    
    public EstadoLampada getEstado () {
        return estado;
    }

    @Override 
    public double imprimir(){
        double tintaGasta;
        System.out.println("+-----------------------------------+");
        System.out.println("|           DADOS DA LAMPADA        |");
        System.out.println("+-----------------------------------+");
        System.out.println("| Estado Atual: " + getEstado());
        System.out.println("+-----------------------------------+");

        tintaGasta = 2.5; // ml de tinta  
        return tintaGasta;
    }


}

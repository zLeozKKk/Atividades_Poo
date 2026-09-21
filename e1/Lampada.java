    
public class Lampada
{
    public static enum EstadoLampada { Desligada, Ligada, Queimada };
    private static final double CHANCE_QUEIMAR = 0.3;

    private EstadoLampada estado;
    
    public Lampada () {
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


}

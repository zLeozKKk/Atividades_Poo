

public class Semaforo {

    public static enum CoresSemaforo {
        VERDE,
        AMARELO,
        VERMELHO;
    }

    public static enum Estado {
        FECHADO,
        ABERTO,
        ATENCAO;
    }
    private Lampada [] lampadas;
    private Estado estado;
    private CoresSemaforo semaforo;
    
    public Semaforo() {
        this.lampadas = new Lampada[3];
        for(int i = 0 ; i < lampadas.length; i ++){
            lampadas [i] = new Lampada();
        }
        this.semaforo = CoresSemaforo.VERMELHO;
        this.estado = Estado.FECHADO;
        
    }

    public void avancaEstado (){

        for(int i= 0 ; i < lampadas.length; i ++){
            lampadas[i].desligar();
        }

        if(estado == Estado.FECHADO){
            System.out.println("Mudando o estado do sinal. ");
            estado = Estado.ABERTO;        
            semaforo = CoresSemaforo.VERDE;
            lampadas [0].ligar();
        }else if (estado == Estado.ABERTO){
            System.out.println("Mudando o estado do sinal. ");
            estado = Estado.ATENCAO;
            semaforo = CoresSemaforo.AMARELO;
            lampadas [1].ligar();
        }else if (estado == Estado.ATENCAO){
            System.out.println("Mudando o estado do sinal. ");
            estado = Estado.FECHADO;
            semaforo = CoresSemaforo.VERMELHO;
            lampadas[2].ligar();
        }
    }

    public Estado getEstadoSemaforo(){
        return  estado; 
    }

    public boolean precisaManutencao () {

       for(Lampada queimadas : lampadas){

        if(queimadas.getEstado() == Lampada.EstadoLampada.Queimada){
            return true;
        }       
       } 
       return false;
    }

}
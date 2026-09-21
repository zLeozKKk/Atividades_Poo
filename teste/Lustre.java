import java.util.ArrayList;

public class Lustre {

    // receber uma lista de lampdas formam um lustre

    private ArrayList<Lampada> lampadas;

    public Lustre( int qntLampada) {
        
        int y;

        if( qntLampada >= 2 ){
            y = qntLampada;
        }else{
            y = 2;
        }

        this.lampadas = new ArrayList<>();
        
        for (int i = 0 ; i < lampadas.size() ; i++ ) {

            lampadas.add(new Lampada());
        }
    }

    public void ligarTodas (){

        for(int i = 0; i < lampadas.size(); i ++){
            lampadas.get(i).ligandoLampada();
        }
    }

    public void desligarTodas() {
    for (int i = 0; i < lampadas.size(); i++) {
        lampadas.get(i).desligandoLampada();
    }
}
}
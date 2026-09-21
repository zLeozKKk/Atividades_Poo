

public class LustreProf {

    // receber uma lista de lampdas formam um lustre

    private LampadaProF [] lamp;

	public LustreProf(int qntLampada) {
		
		// adc o TAMANHO DO VETOR COMO?
		int x;
		
		if( qntLampada >= 2){
			x = qntLampada;
		}else{
			x = 2;
		}

		this.lamp = new LampadaProF[x];

		for(int i = 0; i < lamp.length ; i++){
			lamp [i] = new LampadaProF();
		}
	}

	public void ligarTodas (){

		for(int i = 0; i < lamp.length ; i ++){
			lamp [i].ligar();
		}
	}

	public void desligarTodas (){

		for(int i = 0; i < lamp.length ; i ++){
			lamp [i].desligar();
		}
	}


}
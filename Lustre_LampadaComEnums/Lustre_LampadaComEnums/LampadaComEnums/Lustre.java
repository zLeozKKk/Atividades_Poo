

public class Lustre
{
    private boolean ligado;
    private Lampada[] lampadas;   
    
    public Lustre (int qtdLampadas) {
        // lustre nasce desligado
        ligado = false;
        
        // garante no minimo 2 lampadas
        int qtdLampadasACriar = Math.max(qtdLampadas, 2);
        lampadas = new Lampada[qtdLampadasACriar];
            
        // cria e armazena as lampadas
        for (int i=0; i<qtdLampadasACriar; i++) {
            lampadas[i] = new Lampada();
        }
    }
    
    public void ligar () {
        // ligar cada uma das lampadas
        for (int i=0; i<lampadas.length; i++) {
            lampadas[i].ligar();
        }
        
        // lembrar que o lustre agora está ligado
        ligado = true;
    }
    
    public void desligar () {
         // desligar cada uma das lampadas
        for (Lampada l : lampadas) {
            l.desligar();
        }
        
        // lembrar que o lustre agora está desligado
        ligado = false;       
    }
    
    public int getQtdLampadasQueimadas () {
        int qtd = 0;
        
        for (Lampada l : lampadas) {
            if (l.getEstado() == Lampada.EstadoLampada.Queimada)
                qtd++;
        }
        
        return qtd;
    }
    
    
    public boolean temLampadaQueimada () {
        return (getQtdLampadasQueimadas() > 0);
    }
    
    public int[] getIndicesLampadasQueimadas () {
        int[] arIndicesQueimadas = new int[getQtdLampadasQueimadas()];
        int pos = 0;
        
        // percorrer lampadas, adicionar ao array o indice das queimadas
        for (int indice=0; indice<lampadas.length; indice++) {
            if (lampadas[indice].getEstado() == Lampada.EstadoLampada.Queimada) {
                arIndicesQueimadas[pos] = indice;
                pos++;
            }
                
        }
        
        // ASSERCAO
        if(getQtdLampadasQueimadas() != pos)
            System.out.println("BUG EM getIndicesLampadasQueimadas()");
        
        return arIndicesQueimadas;
    }
}

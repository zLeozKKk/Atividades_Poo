public class Impressora {
    
    private String id;
    private int qntMaxFolhas;
    private int qntFolhasAtual;
    private double qntDispoinvelTinta;
    private StatusImpressora status;

    public enum StatusImpressora {
        ATIVA,INATIVA,SEM_PAPEL,SEM_TINTA;
    }

    public Impressora(String id,int qntMaxFolhas,int qntFolhasAtual,double qntDispoinvelTinta,StatusImpressora status) {
        this.id = id;
        this.qntMaxFolhas = qntMaxFolhas;
        this.qntFolhasAtual = qntFolhasAtual;
        this.qntDispoinvelTinta = qntDispoinvelTinta;
        this.status = StatusImpressora.ATIVA;
    }

    public void recarregarPapel(int qntAddPapel) {
    if (qntAddPapel <= 0) {
        System.out.println("Quantidade para recarga de papel inválida.");
        return;
    }

    if (qntFolhasAtual + qntAddPapel > qntMaxFolhas) {
        System.out.println("Não é possível adicionar " + qntAddPapel + " folhas. O limite máximo da impressora é " + qntMaxFolhas + " e ela já possui " + qntFolhasAtual + " folhas.");
        return;
    }

    qntFolhasAtual += qntAddPapel;
    System.out.println("Quantidade de papel adicionada: " + qntAddPapel);
    System.out.println("Quantidade de folhas atual: " + qntFolhasAtual);

    // Se o status era SEM_PAPEL e agora temos papel e tinta, reativa a impressora
    if (status == StatusImpressora.SEM_PAPEL && qntDispoinvelTinta > 0) {
        status = StatusImpressora.ATIVA;
    }
    }

    public void recarregarTinta(double qntAddTinta) {
    if (qntAddTinta <= 0) {
        System.out.println("Quantidade para recarga de tinta inválida.");
        return;
    }

    qntDispoinvelTinta += qntAddTinta;
    System.out.println("Tinta adicionada: " + qntAddTinta + " ml");
    System.out.println("Quantidade de tinta atual: " + qntDispoinvelTinta + " ml");

    // Se estava sem tinta e agora temos tinta e papel, reativa a impressora
    if (this.status == StatusImpressora.SEM_TINTA && this.qntFolhasAtual > 0) {
        this.status = StatusImpressora.ATIVA;
        System.out.println("Impressora reativada e pronta para uso!");
    }
    }

    public void imprecao (Imprimivel obj){

        double gastoTinta = obj.imprimir();

        if(qntFolhasAtual <= 0){
            System.out.println("Não foi possível realizar a impressão. Sem papel disponível.");
            status = StatusImpressora.SEM_PAPEL;
            return;
        }

        if(status != StatusImpressora.ATIVA){
            System.out.println("Não foi possível realizar a impressão. Status atual: " + status);
            return;
        }

        if(gastoTinta > qntDispoinvelTinta){
            System.out.println("Não foi possível realizar a impressão. Tinta insuficente.");
            status = StatusImpressora.SEM_TINTA;
            return;
        }
        if (qntFolhasAtual == 0) {
                 status = StatusImpressora.SEM_PAPEL;
        } else if (qntDispoinvelTinta <= 0) {
                    status = StatusImpressora.SEM_TINTA;
        }

        qntDispoinvelTinta -= gastoTinta;
        qntFolhasAtual--;
        
    }
}

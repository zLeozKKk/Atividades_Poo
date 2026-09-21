public class RelatorioFinanceiro implements Agendavel {

    private Status statusF;
    private String horarioAgendado;
    private String mesReferencia;
    private boolean formatoPdf;

    public RelatorioFinanceiro(String mesReferencia, boolean formatoPdf) {
        this.statusF = Status.NAO_AGENDADA;
        this.mesReferencia = mesReferencia;
        this.formatoPdf = formatoPdf;
    }

    public void trocaPdf() {
        this.formatoPdf = !this.formatoPdf;
    }

    @Override
    public String agendar(String horario) {
        this.horarioAgendado = horario;
        this.statusF = Status.AGENDAVEL;
        return "Relatório do mês de " + mesReferencia + " agendado para as: " + horario;
    }

    @Override
    public void executar() {
        System.out.println("Executando relatório financeiro...");
        this.statusF = Status.EM_EXECUCAO;
        this.statusF = Status.CONCLUIDA;
    }

    @Override
    public void monitorar() {
        System.out.println("+------------------------------------------+");
        System.out.println("|        MONITORAMENTO DE TAREFA           |");
        System.out.println("+------------------------------------------+");
        System.out.println("| TAREFA           : RELATÓRIO FINANCEIRO  |");
        System.out.println("| HORÁRIO AGENDADO : " + (horarioAgendado != null ? horarioAgendado : "Não definido") + "             |");
        System.out.println("| STATUS ATUAL     : " + statusF + "            |");
        System.out.println("| MÊS DE REFERÊNCIA: " + mesReferencia + "             |");
        System.out.println("| FORMATO PDF      : " + (formatoPdf ? "Sim" : "Não") + "                    |");
        System.out.println("+------------------------------------------+");
    }
}
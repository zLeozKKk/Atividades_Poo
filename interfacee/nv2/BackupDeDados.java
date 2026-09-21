public class BackupDeDados implements Agendavel {

    private Status statusB;
    private String horarioAgendado;

    public BackupDeDados() {
        this.statusB = Status.NAO_AGENDADA;
    }

    @Override
    public String agendar(String horario) {
        this.horarioAgendado = horario;
        this.statusB = Status.AGENDAVEL;
        return "Backup de Dados agendado para as: " + horario;
    }

    @Override
    public void executar() {
        System.out.println("Executando backup de dados...");
        this.statusB = Status.EM_EXECUCAO;
        this.statusB = Status.CONCLUIDA;
    }

    @Override
    public void monitorar() {
        System.out.println("+------------------------------------------+");
        System.out.println("|        MONITORAMENTO DE TAREFA           |");
        System.out.println("+------------------------------------------+");
        System.out.println("| TAREFA           : BACKUP DE DADOS       |");
        System.out.println("| HORÁRIO AGENDADO : " + (horarioAgendado != null ? horarioAgendado : "Não definido") + "             |");
        System.out.println("| STATUS ATUAL     : " + statusB + "            |");
        System.out.println("+------------------------------------------+");
    }
}
public class LimpezaDeSistema implements Agendavel {

    private Status statusL;
    private String horarioAgendado;
    private double espacoLiberadoMb;
    private boolean esvaziarLixeira;

    // Apenas o construtor padrão simples
    public LimpezaDeSistema() {
        this.statusL = Status.NAO_AGENDADA;
        this.esvaziarLixeira = false;
        this.espacoLiberadoMb = 0.0;
    }

    @Override
    public String agendar(String horario) {
        if (horario == null || horario.trim().isEmpty()) {
            return "Erro: Horário de agendamento inválido!";
        }
        this.horarioAgendado = horario;
        this.statusL = Status.AGENDAVEL;
        return "Limpeza de Sistema agendada para as: " + horario;
    }

    @Override
    public void executar() {
        System.out.println("Executando limpeza de sistema...");
        this.statusL = Status.EM_EXECUCAO;

        if (this.esvaziarLixeira) {
            System.out.println("-> Esvaziando lixeira do sistema...");
            this.espacoLiberadoMb += 450.5;
        } else {
            System.out.println("-> Apagando apenas arquivos temporários...");
            this.espacoLiberadoMb += 150.0;
        }

        this.statusL = Status.CONCLUIDA; // Ajuste se no seu Enum for outro nome (ex: CONCLUIDO)
        System.out.println("Limpeza concluída com sucesso!");
    }

    @Override
    public void monitorar() {
        System.out.println("+------------------------------------------+");
        System.out.println("|        MONITORAMENTO DE TAREFA           |");
        System.out.println("+------------------------------------------+");
        System.out.println("| TAREFA           : LIMPEZA DE SISTEMA    |");
        System.out.println("| HORÁRIO AGENDADO : " + (horarioAgendado != null ? horarioAgendado : "Não definido") + "             |");
        System.out.println("| STATUS ATUAL     : " + statusL + "            |");
        System.out.println("| ESVAZIAR LIXEIRA : " + (esvaziarLixeira ? "Sim" : "Não") + "                    |");
        System.out.println("| ESPAÇO LIBERADO  : " + espacoLiberadoMb + " MB               |");
        System.out.println("+------------------------------------------+");
    }
}
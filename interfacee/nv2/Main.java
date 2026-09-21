public class Main {
    public static void main(String[] args) {
        SistemaDeTarefas st = new SistemaDeTarefas();

        BackupDeDados bk = new BackupDeDados();
        RelatorioFinanceiro rl = new RelatorioFinanceiro("Fevereiro", true);
        LimpezaDeSistema ls = new LimpezaDeSistema();

        // ADICIONANDO AS TAREFAS NA LISTA DO SISTEMA
        st.adicionarTarefa(bk);
        st.adicionarTarefa(rl);
        st.adicionarTarefa(ls);

        System.out.println("=== AGENDANDO TODAS AS TAREFAS ===");
        st.agendarTodas("10:00");

        System.out.println("\n=== EXECUTANDO TODAS AS TAREFAS ===");
        st.executarTodas();

        System.out.println("\n=== MONITORANDO TODAS AS TAREFAS ===");
        st.monitorarTarefas();
    }
}
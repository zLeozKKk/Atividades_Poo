import java.util.*;

public class SistemaDeTarefas {

    private List<Agendavel> tarefas;

    public SistemaDeTarefas() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(Agendavel tarefa) {
        tarefas.add(tarefa);
    }

    public void agendarTodas(String horario) {
        for (Agendavel ag : tarefas) {
            // Imprime a String que o método agendar() retorna!
            String mensagem = ag.agendar(horario);
            System.out.println(mensagem); 
        }
    }

    public void executarTodas() {
        for (Agendavel ex : tarefas) {
            ex.executar();
        }
    }

    public void monitorarTarefas() {
        for (Agendavel mo : tarefas) {
            mo.monitorar();
            System.out.println(); // Pula uma linha entre os painéis
        }
    }
}
public interface Agendavel {
    String agendar (String horario);
    void executar();
    void monitorar();
    public enum Status { AGENDAVEL , EM_EXECUCAO, CONCLUIDA , NAO_AGENDADA;}  
} 

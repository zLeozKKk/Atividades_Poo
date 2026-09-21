public class Main {
    public static void main(String[] args) {
        
        Semaforo[] x = new Semaforo[10];

        
        for (int i = 0; i < x.length; i++) {
            x[i] = new Semaforo();
        }
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < 3; j++) {
                x[i].avancaEstado();
            }
        }
        for (int i = 0; i < x.length; i++) {
            System.out.println("Semáforo no índice " + i + ": " + x[i].getEstadoSemaforo());
        }

        boolean algumPrecisaManutencao = false;

        for (int i = 0; i < x.length; i++) {
            if (x[i].precisaManutencao()) {
                System.out.println("Semáforo " + i + " precisa de manutenção!");
                algumPrecisaManutencao = true;
            }
        }
        if (!algumPrecisaManutencao) {
            System.out.println("Nenhum semáforo precisa de manutenção!");
        }
    }
}
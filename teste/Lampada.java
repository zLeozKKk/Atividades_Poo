import java.util.Random;

public class Lampada {
    

    // ATRIBUTOS
    private Estados estado;
    // REMOVIDO: boolean ligada = false; 
    // Motivo: Redundante. O 'estado' (Enum) já nos diz se a lâmpada está LIGADA, DESLIGADA ou QUEIMADA.

    private Random chanceQueimar = new Random();

    // CONSTRUTOR
    // REMOVIDO: public Lampada(Estados estado, boolean ligada)
    // Motivo: Não precisa receber 'ligada' e 'estado' no parâmetro. Toda lâmpada nova nasce DESLIGADA por padrão.
    public Lampada() {
        this.estado = Estados.DESLIGADA;
        // REMOVIDO: this.ligada = false;
    }

    public enum Estados {
    LIGADA,
    DESLIGADA,
    QUEIMADA;
    }

    // GETTERS
    public Estados getEstado() {
        return this.estado;
    }

    // REMOVIDO: public boolean getLigada() { return ligada; }
    // SUBST ITUÍDO POR:
    public boolean isLigada() {
        // Em vez de ler uma variável extra, checamos direto o 'estado'
        return this.estado == Estados.LIGADA; 
    
    }

    // MÉTODOS
    public void ligandoLampada() {

        if (this.estado == Estados.QUEIMADA) {
            System.out.println("A lâmpada está queimada e não pode ser ligada.");
            return;
        }

        // ADICIONADO: Trava para evitar religar se já estiver ligada
        if (this.estado == Estados.LIGADA) {
            System.out.println("A lâmpada já está ligada.");
            return;
        }

        // Teste de 30% de chance de queimar
        if (chanceQueimar.nextDouble() < 0.30) {
            this.estado = Estados.QUEIMADA;
            // REMOVIDO: ligada = false; (A lâmpada queimada já é considerada não-ligada pelo estado)
            System.out.println("A lâmpada queimou ao tentar ligar!");
        } else {
            this.estado = Estados.LIGADA;
            // REMOVIDO: ligada = true; (Atualizar o Enum para LIGADA já é o suficiente)
            System.out.println("A lâmpada foi ligada com sucesso!");
        }
    }

    public void desligandoLampada() {
        if (this.estado == Estados.QUEIMADA) {
            System.out.println("A lâmpada está queimada.");
        } else if (this.estado == Estados.DESLIGADA) {
            System.out.println("A lâmpada já está apagada.");
        } else if (this.estado == Estados.LIGADA) {
            // REMOVIDO: ligada = false;
            this.estado = Estados.DESLIGADA;
            System.out.println("Desligando lâmpada...");
        }
    }
    // MÉTODO MAIN DENTRO DA PRÓPRIA CLASSE
        public static void main(String[] args) {
        
        System.out.println("--- Criando uma nova Lâmpada ---");
        Lampada minhaLampada = new Lampada();
        
        System.out.println("Estado inicial: " + minhaLampada.getEstado());

        System.out.println("\n--- Simulando cliques no interruptor ---");
        
        // Loop simulando 10 tentativas de ligar e desligar para testar a sorte dos 30%
        for (int i = 1; i <= 10; i++) {
            System.out.println("\n[Tentativa " + i + "]");
            
            minhaLampada.ligandoLampada();
            
            // Se a lâmpada queimou no teste, encerra o loop de testes
            if (minhaLampada.getEstado() == Estados.QUEIMADA) {
                System.out.println("Lâmpada inutilizada. Parando os testes.");
                break;
            }

            // Desliga a lâmpada para poder ligar de novo no próximo ciclo
            minhaLampada.desligandoLampada();
        }

        System.out.println("\n--- Estado Final ---");
        System.out.println("Estado da lâmpada: " + minhaLampada.getEstado());
    }
}
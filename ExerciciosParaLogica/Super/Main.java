package ExerciciosParaLogica.Super;

public class Main {
    public static void main(String[] args) {
        // Inicializa o supermercado com 5 caixas
        Supermercado sup = new Supermercado(5);

        System.out.println("--- 1. ENTRADA DE CLIENTES ---");
        // Adiciona vários clientes para encher as filas
        for (int i = 0; i < 12; i++) {
            sup.entraCliente();
        }

        // Exibe a situação inicial das filas e caixas
        sup.listaCaixas();

        System.out.println("--- 2. PROCESSANDO ATENDIMENTOS (AVANÇA) ---");
        // Atende 1 cliente de cada fila
        sup.avanca();
        sup.listaCaixas();

        System.out.println("--- 3. MUDANDO STATUS DO CAIXA 1 (DESATIVANDO) ---");
        // Desativa o caixa de ID 1 para testar a realocação da fila dele
        sup.mudaStatusCaixa(1);
        sup.listaCaixas();

        System.out.println("--- 4. RESUMO DOS RELATÓRIOS ---");
        System.out.println("Caixas operando: " + sup.caixasOperando());
        System.out.println("Caixas parados: " + sup.caixasParados());
        sup.valorFaturado();
        System.out.printf("Valor perdido (não atendidos): R$ %.2f\n", sup.valorPerdido());
    }
}
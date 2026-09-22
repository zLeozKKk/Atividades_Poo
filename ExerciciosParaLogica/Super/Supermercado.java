package ExerciciosParaLogica.Super;

import java.util.Random;
import ExerciciosParaLogica.Super.Caixa.Operacional;

public class Supermercado {
    
    private Caixa[] caixas;
    private int nroClientesEntraram;
    private int clientesNaoAtendidos;
    private double valorPerdido;

    public Supermercado(int qntCaixa) {
        this.nroClientesEntraram = 0;
        this.clientesNaoAtendidos = 0;
        this.valorPerdido = 0;
        this.caixas = new Caixa[qntCaixa];
        for (int i = 0; i < caixas.length; i++) {
            this.caixas[i] = new Caixa(Caixa.Operacional.FUNCIONANDO);
        }
    }

    public void entraCliente() {
        nroClientesEntraram++;
        Random compra = new Random();
        for (Caixa disp : caixas) {
            if (disp.incFila()) {
                System.out.println("Cliente entrou na fila do caixa " + disp.getId());
                return;
            }
        }
        double valorCompra = compra.nextDouble() * 100;
        clientesNaoAtendidos++;
        valorPerdido += valorCompra;
        System.out.println("Todos os caixas cheios ou parados. Cliente não atendido!");
    }

    public void avanca() {
        for (Caixa disp : caixas) {
            if (disp != null) {
                disp.realizaAtendimento();
            }
        }
    }

    public void listaCaixas() {
        System.out.println("\n=== STATUS DOS CAIXAS ===");
        for (Caixa caixa : caixas) {
            if (caixa != null) {
                System.out.println("ID: " + caixa.getId() 
                    + " | Status: " + caixa.getStatus() 
                    + " | Faturamento: R$ " + String.format("%.2f", caixa.getFaturamento()) 
                    + " | Fila: " + caixa.getTamFilaAtual() + " cliente(s)");
            }
        }
        System.out.println("=========================\n");
    }

    public double valorFaturado() {
        double totalF = 0;
        for (Caixa c : caixas) {
            if (c != null) {
                totalF += c.getFaturamento();
            }
        }
        System.out.printf("Valor total faturado: R$ %.2f\n", totalF);
        return totalF;
    }

    public double valorPerdido() {
        return this.valorPerdido;
    }

    public int caixaDisponiveis() {
        int c = 0;
        for (Caixa caixa : caixas) {
            if (!caixa.cheio() && caixa.getStatus() == Operacional.FUNCIONANDO) {
                c++;
                System.out.println("Caixa disponível ID: " + caixa.getId());
            }
        }
        return c;
    }

    public int caixasOperando() {
        int c = 0;
        for (Caixa caixa : caixas) {
            if (caixa.getStatus() == Operacional.FUNCIONANDO) {
                c++;
            }
        }
        return c;
    }

    public int caixasParados() {
        int c = 0;
        for (Caixa caixa : caixas) {
            if (caixa.getStatus() == Operacional.NAO_FUNCIONANDO) {
                c++;
            }
        }
        return c;
    }

    public void mudaStatusCaixa(int id) {
        for (Caixa caixa : caixas) {
            if (caixa.getId() == id) {
                if (caixa.getStatus() == Operacional.NAO_FUNCIONANDO) {
                    caixa.setStatus(Operacional.FUNCIONANDO);
                    System.out.println("Caixa " + id + " reativado.");
                } else if (caixa.getStatus() == Operacional.FUNCIONANDO) {
                    Random x = new Random();
                    int clientesRealocados = caixa.getTamFilaAtual();
                    caixa.setStatus(Operacional.NAO_FUNCIONANDO);
                    System.out.println("Caixa " + id + " desativado. Realocando " + clientesRealocados + " clientes...");

                    for (int i = 0; i < clientesRealocados; i++) {
                        boolean realocar = false;

                        for (Caixa realocados : caixas) {
                            if (realocados.getStatus() == Operacional.FUNCIONANDO && !realocados.cheio()) {
                                realocados.incFila();
                                realocar = true;
                                break;
                            }
                        }

                        // Verificação feita FORA do loop de busca dos caixas
                        if (!realocar) {
                            double valorP = x.nextDouble() * 100;
                            this.clientesNaoAtendidos++;
                            this.valorPerdido += valorP;
                            System.out.println("Sem vagas em outros caixas. Compra de cliente perdida!");
                        }
                    }
                }
                return; // Encerra o método após encontrar e processar o caixa correto
            }
        }
        System.out.println("Caixa com ID " + id + " não encontrado.");
    }
}
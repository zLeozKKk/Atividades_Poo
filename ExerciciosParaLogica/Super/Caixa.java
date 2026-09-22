package ExerciciosParaLogica.Super;

import java.util.Random;

public class Caixa {
    
    private int id;
    private int tamFilaAtual;
    private double faturamento;
    private Operacional status;
    public enum Operacional { FUNCIONANDO, NAO_FUNCIONANDO }

    // Atributos de classe (static) pedidos no enunciado
    private static int nroMaximoNaFila = 5; 
    private static int classId = 1;

    public Caixa(Operacional status) {
        this.id = classId++;
        this.status = status;
        this.tamFilaAtual = 0;
        this.faturamento = 0.0;
    }

    public void setTamFilaAtual(int tamFilaAtual) {
        this.tamFilaAtual = tamFilaAtual;
    }

    public int getId() {
        return id;
    }

    public int getTamFilaAtual() {
        return tamFilaAtual;
    }

    public double getFaturamento() {
        return faturamento;
    }

    public Operacional getStatus() {
        return status;
    }

    public void setStatus(Operacional status) {
        this.status = status;
        if (status == Operacional.NAO_FUNCIONANDO) {
            this.tamFilaAtual = 0; // Conforme enunciado: como resultado, elimina a fila
        }
    }

    public boolean incFila() {
        if (this.tamFilaAtual < Caixa.nroMaximoNaFila && this.status == Operacional.FUNCIONANDO) {
            this.tamFilaAtual++;
            return true;
        }
        return false;
    }

    public boolean cheio() {
        if (this.tamFilaAtual == Caixa.nroMaximoNaFila) {
            System.out.println("Caixa cheio!");
            return true;
        }
        return false;
    }

    public void realizaAtendimento() {
        if (this.tamFilaAtual > 0) {
            Random compra = new Random();
            this.tamFilaAtual--;
            double valorCompra = compra.nextDouble() * 100.0;
            this.faturamento += valorCompra;
        }
    }
}
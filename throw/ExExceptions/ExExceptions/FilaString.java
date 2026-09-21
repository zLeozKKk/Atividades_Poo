public class FilaString {

    private String[] fila;
    private int qtd;

    public FilaString (int capacidade) {
        fila = new String[(capacidade>0)?capacidade:10];
        qtd = 0;
    }

    public int quantidade () {
        return qtd;
    }

    public boolean ingressar (String nome) {
        if (qtd == fila.length) {
            return false; // fila cheia. nao cabem mais nomes!
        }

        fila[qtd] = nome;
        qtd++;

        return true;
    }

    public String atender () throws Exception {
        if (qtd == 0) {
            throw new Exception("Fila vazia");
        }

        String nomeFrente = fila[0];
        for (int i = 1; i < qtd; i++) {
            fila[i-1] = fila[i];
        }
        qtd--;

        return nomeFrente;
    }

}

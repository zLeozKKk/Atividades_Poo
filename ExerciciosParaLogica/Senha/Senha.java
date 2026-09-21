package ExerciciosParaLogica.Senha;

public class Senha {

    private static int senhaAtual = 1; // todos os objtos iniciam em 1.
    private int minhaSenha;

    public Senha() {
        this.minhaSenha = senhaAtual;
        senhaAtual++;
    }

    public int getSenhaAtual() {
        return senhaAtual;
    }
    public int getMinhaSenha() {
        return minhaSenha;
    }

}
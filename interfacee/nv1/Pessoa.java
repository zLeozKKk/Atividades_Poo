public class Pessoa implements Imprimivel {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "[nome=" + nome + " ,idade=" + idade + "]";
    }

    @Override
    public double imprimir() {
        System.out.println("+-----------------------------------+");
        System.out.println("|           DADOS DA PESSOA         |");
        System.out.println("+-----------------------------------+");
        System.out.println("| Nome:  " + nome);
        System.out.println("| Idade: " + idade + " anos");
        System.out.println("+-----------------------------------+");

        // Define o consumo fixo de tinta para a impressão dos dados da pessoa
        double tintaGasta = 1.5; // ml de tinta
        return tintaGasta;
    }
}
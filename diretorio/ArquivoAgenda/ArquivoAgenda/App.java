import java.io.*;
import java.util.*;

public class App
{
    private static String nome;
    private static String idade;
    private static String telefone;
    private static boolean dadosModificados = false;

    public static void carregarDados ()
    {
        System.out.println("Carregando dados...");

        try
        {
            FileReader fileReader = new FileReader("Dados.txt");
            BufferedReader entrada = new BufferedReader(fileReader);

            nome = entrada.readLine();
            idade = entrada.readLine();
            telefone = entrada.readLine();

            entrada.close();
            System.out.println("Dados carregados.");
            dadosModificados = false;

            exibirDados();

        }
        catch (IOException e)
        {
            System.out.println("ERRO ao carregar dados!" + e);
        }

    }

    public static void salvarDados ()
    {
        System.out.println("Salvando dados...");

        try
        {
            FileWriter fileWriter = new FileWriter("Dados.txt");
            PrintWriter saida = new PrintWriter(fileWriter);
            saida.println(nome);
            saida.println(idade);
            saida.println(telefone);
            saida.close();
            System.out.println("Dados salvos.");
            dadosModificados = false;
        }
        catch (IOException e)
        {
            System.out.println("ERRO ao salvar dados!");
        }

    }

    public static void editarDados ()
    {
        System.out.println("Os dados atuais são:");
        exibirDados();
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite o nome:");
        nome = in.nextLine();
        System.out.println("Digite a idade:");
        idade = in.nextLine();
        System.out.println("Digite o telefone:");
        telefone = in.nextLine();
        dadosModificados = true;
        
    }
    
    public static void exibirDados ()
    {
        System.out.println("====== DADOS EM MEMÓRIA =====");
        System.out.println("Nome.....: " + nome);
        System.out.println("Idade....: " + idade);
        System.out.println("Telefone.: " + telefone);
        System.out.println("=============================");
        if (dadosModificados)
        {
            System.out.println("  * Aviso: dados ainda não foram salvos.");
        }
    }

    public static void main (String args[])
    {
        int opcao;
        
        do  // Loop do menu principal
        {
            System.out.println("== Sistema de Arquivo ==");
            System.out.println("Escolha uma opção:");
            System.out.println("1. Carregar");
            System.out.println("2. Salvar");
            System.out.println("3. Exibir dados em memória");
            System.out.println("4. Editar dados");
            System.out.println("0. Sair do programa");
            System.out.println("Sua opção:");

            Scanner in = new Scanner(System.in);

            opcao = in.nextInt();

            switch (opcao)
            {
                case 0:
                    System.out.println("Fim do programa.");
                    break;
                    
                case 1:
                    carregarDados();
                    break;

                case 2:
                    salvarDados();
                    break;

                case 3:
                    exibirDados();
                    break;
                    
                case 4:
                    editarDados();
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }
}

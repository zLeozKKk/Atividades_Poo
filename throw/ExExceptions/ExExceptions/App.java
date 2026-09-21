import java.util.Scanner;

public class App
{
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        int capacidade = 0;
        
        boolean dadosValidos = false;
        
        while (!dadosValidos) {
            try
            {
                System.out.println("Digite a capacidade da fila:");
                String valorDigitado = in.nextLine();
                capacidade = Integer.parseInt(valorDigitado);
                dadosValidos = true;
            }
            catch(NumberFormatException e) {
                System.out.println("Numero invalido");
            }
        }
        
        
        
        
        ////////////////////////////////////
        
        FilaString minhaFila = new FilaString(capacidade);
        

        minhaFila.ingressar("Ana");
        minhaFila.ingressar("Daniel");
        minhaFila.ingressar("Giovana");
        minhaFila.ingressar("Carlos");
        minhaFila.ingressar("Pedro");


        try {
            System.out.println("Tentando...");
            String nomeAtender = minhaFila.atender();
            System.out.println("Atendendo: " + nomeAtender);
            System.out.println("Sucesso!");
        }
        catch (Exception e) {
            System.out.println("Ops! deu algo errado");
        }
        finally {
            System.out.println("Finalizando.");
        }
        
        System.out.printf("Ainda existem %d pessoas na fila.\n", 
            minhaFila.quantidade());
        
        
    }
    
}


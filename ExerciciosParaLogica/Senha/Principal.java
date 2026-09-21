package ExerciciosParaLogica.Senha;

import java.util.Random;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        Scanner l = new Scanner(System.in);
        Random aleatorio = new Random();

        System.out.println("Informe o tamanho do vetor:");
        int vetor = l.nextInt();

        Senha [] senhas = new Senha[vetor];

        int objcriados = 0;

        while (objcriados < vetor) {
            int pos = aleatorio.nextInt(vetor);

            if(senhas[pos] == null){
                senhas[pos] = new Senha();
                objcriados++;
            }
        }

        System.out.println("Senhas do vetor.");

        for(int i = 0; i < senhas.length; i ++){
            System.out.println("Posição: "+i+" Senhas: "+ senhas[i].getMinhaSenha());
        }
        l.close();
    }
}

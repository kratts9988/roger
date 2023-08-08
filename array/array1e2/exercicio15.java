package array.array1e2;

import java.util.Random;
import java.util.Scanner;

public class exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        String[] nomesConvidados = new String[10]; 

        for (int i = 0; i < nomesConvidados.length; i++) {
            System.out.print("Digite o nome do convidado " + (i + 1) + ": ");
            nomesConvidados[i] = scanner.nextLine();
        }

        System.out.println("\nOs ganhadores do sorteio são:");

        for (int i = 0; i < 3; i++) {
            int indiceSorteado = random.nextInt(nomesConvidados.length);

            System.out.println(nomesConvidados[indiceSorteado]);

            nomesConvidados = removerNome(nomesConvidados, indiceSorteado);
        }

        scanner.close();
    }

    public static String[] removerNome(String[] nomes, int indice) {
        String[] novoVetor = new String[nomes.length - 1];
        int j = 0;
        for (int i = 0; i < nomes.length; i++) {
            if (i != indice) {
                novoVetor[j] = nomes[i];
                j++;
            }
        }
        return novoVetor;
    }
}

package array.array1e2;

import java.util.Random;
import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1;

        int tentativa;

        int contadorTentativas = 0;

        do {
            System.out.print("Tente adivinhar o número secreto (entre 1 e 100): ");
            tentativa = scanner.nextInt();
            contadorTentativas++;

            if (tentativa < numeroSecreto) {
                System.out.println("Tente um número maior!");
            } else if (tentativa > numeroSecreto) {
                System.out.println("Tente um número menor!");
            } else {
                System.out.println("Parabéns! Você acertou o número secreto em " + contadorTentativas + " tentativas!");
            }
        } while (tentativa != numeroSecreto);

        scanner.close();
    }
}

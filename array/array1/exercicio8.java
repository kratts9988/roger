package array.array1;

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = { 10, 25, 7, 12, 31, 8, 15, 6, 18, 23 };

        System.out.print("Digite um número: ");
        int numeroDigitado = scanner.nextInt();

        boolean estaPresente = false;
        for (int numero : numeros) {
            if (numero == numeroDigitado) {
                estaPresente = true;
                break; 
            }
        }

        if (estaPresente) {
            System.out.println("O número " + numeroDigitado + " está presente no vetor.");
        } else {
            System.out.println("O número " + numeroDigitado + " não está presente no vetor.");
        }

        scanner.close();
    }
}

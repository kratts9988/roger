package array.array1;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] frutas = { "Maçã", "Banana", "Laranja" };

        System.out.println("Digite um número de 0 a 2:");
        int numero = scanner.nextInt();

        if (numero >= 0 && numero < frutas.length) {
            System.out.println("A fruta correspondente é: " + frutas[numero]);
        } else {
            System.out.println("Número inválido. Digite um número de 0 a 2.");
        }

        scanner.close();
    }
}

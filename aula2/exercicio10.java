package aula2;

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de elementos do array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o elemento " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        int soma = 0;
        for (int elemento : array) {
            soma += elemento;
        }

        double media = (double) soma / n;

        System.out.println("A média dos elementos é: " + media);

        scanner.close();
    }
}

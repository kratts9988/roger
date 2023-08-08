package array.array1;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

        String[] palavras = new String[4];

        for (int i = 0; i < palavras.length; i++) {
            System.out.print("Digite a " + (i + 1) + "ª palavra: ");
            palavras[i] = scanner.nextLine();
        }

        System.out.println("\nPalavras digitadas:");

        for (String palavra : palavras) {
            System.out.println(palavra);
        }

        scanner.close();
    }
}

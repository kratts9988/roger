package array.array1e2;

import java.util.Scanner;

public class exercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nomesAmigos = new String[5];
        int[] quantidadesQuebraCabecas = new int[5];

        for (int i = 0; i < nomesAmigos.length; i++) {
            System.out.print("Digite o nome do amigo " + (i + 1) + ": ");
            nomesAmigos[i] = scanner.nextLine();

            System.out.print("Digite a quantidade de quebra-cabeças resolvidos por " + nomesAmigos[i] + ": ");
            quantidadesQuebraCabecas[i] = scanner.nextInt();
            scanner.nextLine();
        }

        System.out.println("\nRelatório de quebra-cabeças resolvidos por amigos:");
        for (int i = 0; i < nomesAmigos.length; i++) {
            System.out.println(nomesAmigos[i] + ": " + quantidadesQuebraCabecas[i] + " quebra-cabeças");
        }

        scanner.close();
    }
}

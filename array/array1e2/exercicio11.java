package array.array1e2;

import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] listaCompras = new String[5];

        for (int i = 0; i < listaCompras.length; i++) {
            System.out.print("Digite o item " + (i + 1) + " da lista de compras: ");
            listaCompras[i] = scanner.nextLine();
        }

        System.out.println("\nLista de compras:");
        for (String item : listaCompras) {
            System.out.println("- " + item);
        }

        scanner.close();
    }
}

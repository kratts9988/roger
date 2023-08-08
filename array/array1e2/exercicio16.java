package array.array1e2;

import java.util.Scanner;

public class exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vendasDiarias = new int[7];

        for (int i = 0; i < vendasDiarias.length; i++) {
            System.out.print("Digite a quantidade de vendas do dia " + (i + 1) + ": ");
            vendasDiarias[i] = scanner.nextInt();
        }

        double mediaVendasDiarias = calcularMediaVendas(vendasDiarias);

        System.out.println("\nMédia de vendas diárias da semana: " + mediaVendasDiarias);

        scanner.close();
    }

    public static double calcularMediaVendas(int[] vendasDiarias) {
        int somaVendas = 0;
        for (int vendas : vendasDiarias) {
            somaVendas += vendas;
        }

        return (double) somaVendas / vendasDiarias.length;
    }
}

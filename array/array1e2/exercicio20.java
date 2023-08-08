package array.array1e2;

import java.util.Scanner;

public class exercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] caloriasConsumidas = new int[5][7]; 

        for (int i = 0; i < caloriasConsumidas.length; i++) {
            System.out.println("Registro de calorias consumidas para a pessoa " + (i + 1) + ":");
            for (int j = 0; j < caloriasConsumidas[i].length; j++) {
                System.out.print("Digite a quantidade de calorias consumidas no dia " + (j + 1) + ": ");
                caloriasConsumidas[i][j] = scanner.nextInt();
            }
            scanner.nextLine(); 
        }

        int indicePessoaMaiorConsumo = encontrarPessoaMaiorConsumo(caloriasConsumidas);

        System.out.println("\nPessoa com maior consumo de calorias em um único dia: Pessoa " + (indicePessoaMaiorConsumo + 1));

        scanner.close();
    }

    public static int encontrarPessoaMaiorConsumo(int[][] calorias) {
        int maiorConsumo = 0;
        int indicePessoaMaiorConsumo = 0;

        for (int i = 0; i < calorias.length; i++) {
            for (int j = 0; j < calorias[i].length; j++) {
                if (calorias[i][j] > maiorConsumo) {
                    maiorConsumo = calorias[i][j];
                    indicePessoaMaiorConsumo = i;
                }
            }
        }

        return indicePessoaMaiorConsumo;
    }
}

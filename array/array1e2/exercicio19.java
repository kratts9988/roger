package array.array1e2;

import java.util.Scanner;

public class exercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nomesNadadores = new String[5];
        double[] temposNadadores = new double[5];

        for (int i = 0; i < nomesNadadores.length; i++) {
            System.out.print("Digite o nome do nadador " + (i + 1) + ": ");
            nomesNadadores[i] = scanner.nextLine();

            System.out.print("Digite o tempo de conclusão da prova (em segundos) de " + nomesNadadores[i] + ": ");
            temposNadadores[i] = scanner.nextDouble();
            scanner.nextLine(); 
        }

        int indiceVencedor = encontrarVencedor(temposNadadores);

        System.out.println("\nNadador vencedor: " + nomesNadadores[indiceVencedor]);

        scanner.close();
    }

    public static int encontrarVencedor(double[] tempos) {
        int indiceVencedor = 0;
        for (int i = 1; i < tempos.length; i++) {
            if (tempos[i] < tempos[indiceVencedor]) {
                indiceVencedor = i;
            }
        }
        return indiceVencedor;
    }
}

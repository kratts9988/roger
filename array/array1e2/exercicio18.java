package array.array1e2;

import java.util.Scanner;

public class exercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] precosAcao = new double[10];

        for (int i = 0; i < precosAcao.length; i++) {
            System.out.print("Digite o preço da ação no dia " + (i + 1) + ": ");
            precosAcao[i] = scanner.nextDouble();
        }

        double maiorVariacao = calcularMaiorVariacao(precosAcao);

        System.out.println("\nMaior variação de preço entre dois dias consecutivos: " + maiorVariacao);

        scanner.close();
    }

    public static double calcularMaiorVariacao(double[] precos) {
        double maiorVariacao = 0;
        for (int i = 1; i < precos.length; i++) {
            double variacao = Math.abs(precos[i] - precos[i - 1]);
            if (variacao > maiorVariacao) {
                maiorVariacao = variacao;
            }
        }
        return maiorVariacao;
    }
}

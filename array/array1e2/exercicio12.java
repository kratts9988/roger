package array.array1e2;

import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] temperaturas = new double[7];

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.print("Digite a temperatura média do dia " + (i + 1) + ": ");
            temperaturas[i] = scanner.nextDouble();
        }

        double temperaturaMedia = calcularTemperaturaMedia(temperaturas);

        System.out.println("\nTemperatura média da semana: " + temperaturaMedia + "°C");

        scanner.close();
    }

    public static double calcularTemperaturaMedia(double[] temperaturas) {
        double soma = 0;
        for (double temperatura : temperaturas) {
            soma += temperatura;
        }

        return soma / temperaturas.length;
    }
}

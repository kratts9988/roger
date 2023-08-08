package array.array1e2;

import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] horasTarefas = new double[5];

        for (int i = 0; i < horasTarefas.length; i++) {
            System.out.print("Digite as horas gastas na tarefa " + (i + 1) + ": ");
            horasTarefas[i] = scanner.nextDouble();
        }

        double totalHorasTrabalhadas = calcularTotalHorasTrabalhadas(horasTarefas);

        System.out.println("\nTotal de horas trabalhadas: " + totalHorasTrabalhadas + " horas");

        scanner.close();
    }

    public static double calcularTotalHorasTrabalhadas(double[] horasTarefas) {
        double totalHoras = 0;
        for (double horas : horasTarefas) {
            totalHoras += horas;
        }
        return totalHoras;
    }
}

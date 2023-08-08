package aula2;

import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de números da série de Fibonacci: ");
        int n = scanner.nextInt();

        System.out.println("Série de Fibonacci:");

        int primeiroNumero = 1;
        int segundoNumero = 1;
        int proximoNumero;

        for (int i = 1; i <= n; i++) {
            if (i == 1 || i == 2) {
                System.out.print(primeiroNumero + " ");
            } else {
                proximoNumero = primeiroNumero + segundoNumero;
                System.out.print(proximoNumero + " ");
                primeiroNumero = segundoNumero;
                segundoNumero = proximoNumero;
            }
        }
        scanner.close();
    }
}

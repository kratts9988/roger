package aula2;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        System.out.print("Escolha a operação: ");
        int escolha = scanner.nextInt();

        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        switch (escolha) {
            case 1:
                System.out.println("Resultado da soma: " + (numero1 + numero2));
                break;
            case 2:
                System.out.println("Resultado da subtração: " + (numero1 - numero2));
                break;
            case 3:
                System.out.println("Resultado da multiplicação: " + (numero1 * numero2));
                break;
            case 4:
                if (numero2 != 0) {
                    System.out.println("Resultado da divisão: " + (numero1 / numero2));
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida!");
                }
                break;
            default:
                System.out.println("Opção inválida!");
        }

        scanner.close();
    }
}

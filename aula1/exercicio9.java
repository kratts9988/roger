package aula1;
import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para ver sua tabuada de multiplicação: ");
        int numero = scanner.nextInt();

        System.out.println("Tabuada de multiplicação do número " + numero + ":");

        for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {

            int resultado = numero * multiplicador;

            System.out.println(numero + " x " + multiplicador + " = " + resultado);
        }

        scanner.close();
    }
}

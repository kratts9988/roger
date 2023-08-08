package aula1; 
 import java.util.Scanner;

public class exercicio7 {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
 

           System.out.print("Digite o primeiro número: ");
            double numero1 = Scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            double numero2 = Scanner.nextDouble();

            double maiorNumero;
            if (numero1 > numero2) {
                maiorNumero = numero1;
            } else {
                maiorNumero = numero2;
            }

            System.out.println("O maior número é: " + maiorNumero);
            Scanner.close();
        }

    }


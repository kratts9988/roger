package array;
import java.util.Scanner;

public class EXEMPLO {
    public static void main(String[] args) {

        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        
        System.out.println("Primeiro elemento: " + numbers[0]);
        System.out.println("Tamanho do array numbers: " + numbers.length);
        
        System.out.println("== Array numbers ==");
        for (int i = 0; i < numbers.length; i++) {
        System.out.println(numbers[i]);
        }
        
        // Criando um novo array para inserir números de forma infinita
        int[] infiniteNumbers = new int[100]; // Aqui, estou definindo o tamanho inicial como 100, mas poderia ser maior se necessário.
        int infiniteIndex = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nInsira números para o array infinito (ou digite '0' para sair):");
        
        // Loop para inserir números de forma infinita até que seja digitado 0
        while (true) {
        int num = scanner.nextInt();
        if (num == 0) {
        break;
        }
        infiniteNumbers[infiniteIndex] = num;
        infiniteIndex++;
        
        // Redimensionando o array se estiver quase cheio (aumentando o tamanho em 100)
        if (infiniteIndex == infiniteNumbers.length) {
        int[] newArray = new int[infiniteNumbers.length + 100];
        System.arraycopy(infiniteNumbers, 0, newArray, 0, infiniteNumbers.length);
        infiniteNumbers = newArray;
        }
        }
        scanner.close();
        
        System.out.println("\n== Array infinito ==");
        for (int i = 0; i < infiniteIndex; i++) {
        System.out.println(infiniteNumbers[i]);
        }
        
        // Criando um novo array para números até 100 usando loop for
        int[] numbersUpTo100 = new int[100];
        for (int i = 0; i < 100; i++) {
        numbersUpTo100[i] = i + 1;
        }
        
        System.out.println("\n== Array até 100 ==");
        for (int i = 0; i < numbersUpTo100.length; i++) {
        System.out.println(numbersUpTo100[i]);
        }
    }
}

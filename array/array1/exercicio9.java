package array.array1;

public class exercicio9 {
    public static void main(String[] args) {
        int[] numeros = { 2, 4, 6, 8, 10 };

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] *= 2;
        }

        System.out.println("Vetor resultante:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
    }
}

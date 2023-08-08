package array.array1;

public class exercicio10 {
    public static void main(String[] args) {
        int[] vetor1 = { 2, 4, 6 };
        int[] vetor2 = { 1, 3, 5 };

        int[] vetorSoma = new int[3];

        for (int i = 0; i < 3; i++) {
            vetorSoma[i] = vetor1[i] + vetor2[i];
        }

        System.out.println("Terceiro vetor (soma dos elementos dos dois primeiros):");
        for (int numero : vetorSoma) {
            System.out.print(numero + " ");
        }
    }
}

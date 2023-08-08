package array.array1;

public class exercicio5 {
    public static void main(String[] args) {
        int[] vetor = { 1, 2, 3, 4, 5, 6, 7 };

        int quantidadePares = contarNumerosPares(vetor);

        System.out.println("Quantidade de números pares no vetor: " + quantidadePares);
    }

    public static int contarNumerosPares(int[] vetor) {
        int quantidadePares = 0;

        for (int i = 0; i < vetor.length; i++) {
            int numero = vetor[i]; // Obtém o número atual do vetor no índice i
            if (numero % 2 == 0) {
                quantidadePares++; // Incrementa a quantidade de pares se o número atual for par
            }
        }

        return quantidadePares;
    }
}

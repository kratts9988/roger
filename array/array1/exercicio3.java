package array.array1;

public class exercicio3 {
    public static void main(String[] args) {
        int[] vetor = { 5, 10, 2, 8, 15, 3, 7, 12 };

        int maiorValor = encontrarMaiorValor(vetor);

        System.out.println("O maior valor presente no vetor é: " + maiorValor);
    }

    public static int encontrarMaiorValor(int[] vetor) {
        int maior = vetor[0]; 

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i]; 
            }
        }

        return maior;
    }
}

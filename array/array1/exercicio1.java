package array.array1;

public class exercicio1 {
    public static void main(String[] args) {
         int[] vetor = { 10, 5, 8, 3, 6 };

         int soma = 0;
         for (int i = 0; i < vetor.length; i++) {
             soma += vetor[i];
         }
 
         System.out.println("A soma dos elementos do vetor é: " + soma);
 
    }
}

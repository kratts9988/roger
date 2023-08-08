
package array.array1;

public class exercicio4 {
    public static void main(String[] args) {
        int[] notas = { 7, 8, 6, 9, 10, 5 };

        double media = calcularMedia(notas);

        System.out.println("A média das notas dos alunos é: " + media);
    }

    public static double calcularMedia(int[] notas) {
        int soma = 0;
        int quantidadeNotas = notas.length; // Armazena o número de notas no array
    
        for (int i = 0; i < quantidadeNotas; i++) {
            int nota = notas[i]; // Obtém a nota atual do índice i
            soma += nota; // Adiciona a nota atual à soma
        }

        return (double) soma / notas.length;
    }
}
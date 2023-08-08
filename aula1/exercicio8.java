package aula1;
public class exercicio8 {
    public static void main(String[] args) {
        int termo1 = 0;
        int termo2 = 1;

        System.out.println("Sequência de Fibonacci até o décimo termo:");
        System.out.print(termo1 + ", " + termo2);

        for (int i = 2; i < 10; i++) {

            int proximoTermo = termo1 + termo2;

            termo1 = termo2;
            termo2 = proximoTermo;

            System.out.print(", " + proximoTermo);
        }

        System.out.println();
    }
}

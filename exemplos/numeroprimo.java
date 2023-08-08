package exemplos;
public class numeroprimo {
    public static void main(String[] args) {
        int numero = 7;
        boolean ehPrimo = true;

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                ehPrimo = false;
                break;
            }
        }

        if (ehPrimo) {
            System.out.println("O número é primo.");
        } else {
            System.out.println("O número não é primo.");
        }
    }
}
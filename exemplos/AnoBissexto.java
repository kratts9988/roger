package exemplos;
public class AnoBissexto {
    public static void main(String[] args) {
        int ano = 2024;

        boolean ehBissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);

        if (ehBissexto) {
            System.out.println("O ano é bissexto.");
        } else {
            System.out.println("O ano não é bissexto.");
        }
    }
}

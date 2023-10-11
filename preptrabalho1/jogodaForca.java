package preptrabalho1;

import java.util.Random;
import java.util.Scanner;

public class jogodaForca {
    public static void main(String[] args) {
        // Definir as palavras secretas
        String[] palavrasSecretas = {"JAVA", "PYTHON", "CPLUSPLUS", "JAVASCRIPT", "RUBY", "PHP"};

        Scanner scanner = new Scanner(System.in);

        // Loop para jogar novamente
        do {
            // Escolher aleatoriamente uma palavra da lista
            Random random = new Random();
            String palavraSecreta = palavrasSecretas[random.nextInt(palavrasSecretas.length)];

            // Inicializar vidas e array de letras descobertas
            int vidas = 6;
            char[] letrasDescobertas = new char[palavraSecreta.length()];
            for (int i = 0; i < letrasDescobertas.length; i++) {
                letrasDescobertas[i] = '-';
            }

            // Loop principal do jogo
            while (vidas > 0) {
                // Exibir estado atual da palavra
                System.out.println("Palavra: " + new String(letrasDescobertas));
                System.out.println("Vidas restantes: " + vidas);
                System.out.print("Digite uma letra: ");
                char letra = scanner.next().toUpperCase().charAt(0);

                boolean letraDescoberta = false;
                for (int i = 0; i < palavraSecreta.length(); i++) {
                    if (palavraSecreta.charAt(i) == letra) {
                        letrasDescobertas[i] = letra;
                        letraDescoberta = true;
                    }
                }

                if (!letraDescoberta) {
                    vidas--;
                    System.out.println("Letra não encontrada na palavra.");
                }

                // Verificar se a palavra foi completamente descoberta
                if (new String(letrasDescobertas).equals(palavraSecreta)) {
                    System.out.println("Parabéns, você acertou a palavra secreta: " + palavraSecreta);
                    break;
                }
            }

            if (vidas == 0) {
                System.out.println("Suas vidas acabaram! A palavra secreta era: " + palavraSecreta);
            }

            System.out.print("Deseja jogar novamente? (S/N): ");
        } while (scanner.next().trim().equalsIgnoreCase("S"));

        System.out.println("Obrigado por jogar!");
        scanner.close();
    }
}
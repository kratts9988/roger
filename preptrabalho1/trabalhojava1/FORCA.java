import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class FORCA {
    
    private static final String[] PalavrasSecretas = null;
    static int[] acertos = new int[3];
    static String[] nome = new String[3];
    static char resposta;
    static int contador = 0;
    String[] palavrasSecretas = {"OTARIO", "VOA MLK", "LAELE", "VUK MAL", "HOP", "K9"};
    public static void main(String[] Forca) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(BemVindo());
        Menu();
        scanner.close();
    }

        public static String Menu() {
            Scanner in = new Scanner(System.in);
            System.out.println("FALA RELIKIA, QUER JOGAR UM JOGO MALADEZA?: ");
            System.out.println("1- QUERO JOGAR ZÉ!");
            System.out.println("2- CÊ QUER FALAR MEUS PONTOS CÊ FALA ZÉ.");
            System.out.println("3- ANÃO ZÉ, CE NÃO ME ESTRESSA NÃO ZÉ, TCHÔ SAIR DAQUI.");
            System.out.println("DIGITE UM NUMERO: ");
            int jogo= in.nextInt();
        switch (jogo) {
            case 1:
            JogoMaladeza();
                break;
            case 2:
                Pontos();
                break;
            case 3:
                Sair();
                break;
            default:
            System.out.println("O ZÉ CÊ E BURRU MERMO EIN. OPÇÃO INVALIDA!!!!");
            break;
            }
            in.close();
            return "menu";
        }

        public static String JogoMaladeza() {
            Scanner in = new Scanner(System.in);
            PrintStream out = System.out;
            System.out.println("\033[H\033[2J");
            System.out.println(BemVindo());

            for (int i = 0; i < nome.length; i++) {
                nome[i] = null;
            }
            for (int i = 0;i < 1;i++) {
                System.out.println("CHAME TEU VULGO MALVADÃO: ");
                nome[i] = in.nextLine();
                System.out.printf("FORTE ABRAÇO RLK, %S!\n", nome[i]);
            }
            Random random = new Random();
            String PalavraCerta = in.nextLine();
            boolean letraDescoberta = false;
            
            StringBuilder PalavraDescoberta = new StringBuilder();
            int tentativas = 0;
            
            String palavrasSecretas = PalavrasSecretas[random.nextInt(PalavrasSecretas.length)];

            char[] letrasDescobertas = new char[PalavraCerta.length()];
            for (int i = 0; i < letrasDescobertas.length; i++) {
                letrasDescobertas[i] = '-';
            }


            
        
            while (!letraDescoberta) {
                System.out.println("DIGITE UMA LETRA: ");
                char letra = in.next().charAt(0);
                for (int i = 0; i < PalavraCerta.length(); i++){
                    if (palavrasSecretas.charAt(i) == letra) {
                        letraDescoberta = true;
                        PalavraDescoberta.setCharAt(i, letra);
                }
            }
            for (int i = 0; i < PalavraCerta.length();i++) {
                PalavraDescoberta.append("-");
            }
            System.out.printf("CÊ TEM -1 TENTATIVA ZÉ. \nPALAVRA ATUAL: %s\n",PalavraCerta);
            
            if (letra > 1) {
                System.out.println("DIGITE UMA LETRA: ");
            }
            System.out.printf("Palavra atual : %s\n", PalavraDescoberta);
            if (letraDescoberta) {
                System.out.println("Letra correta! ");
            } else{
                tentativas = tentativas +1;
                System.out.println("Letra incorreta! ");
            }
            if (tentativas == 5) {
                out.printf("Você perdeu %s!", nome[0]);
                System.out.printf("Suas vidas acabaram! A palavra secreta era: ", PalavraCerta);
                letraDescoberta = true;
                out.printf("\nPontuação do jogador %s: %d\n", nome[0], acertos[0]);
                out.printf("\n%s, você deseja jogar novamente? (S/N): ", nome[0]);
                char resposta = in.next().charAt(0);
                if (resposta == 'S' || resposta == 's') {
                    JogoMaladeza();
                }
                if (resposta == 'N' || resposta == 'n') {
                    Sair();
                    letraDescoberta = false;
                    break;
                }
                break;
            }

            if (PalavraDescoberta.toString().equals(PalavraCerta)) {
                out.printf("Parabéns %s, você acertou a palavra: [%s]. ", nome[0], PalavraCerta);
                letraDescoberta = true;
                contador = contador + 1;
                if (contador == 1) {
                    acertos[0] = acertos[0] + 1;
                }
                out.printf("\nPontuação do jogador %s: %d\n", nome[0], acertos[0]);
                out.printf("\n%s, você deseja jogar novamente? (S/N): ", nome[0]);
                char resposta = in.next().charAt(0);
                if (resposta == 'S' || resposta == 's') {
                    JogoMaladeza();
                }
                if (resposta == 'N' || resposta == 'n') {
                    Menu();
                    letraDescoberta = true;
                    break;
                }
                contador = contador + 1;

                break;

            }
        }
        in.close();
        return "IniciarJogo";
    }
    public static String Pontos() { // método VerificarPontuacao
        Scanner in = new Scanner(System.in);
        PrintStream out = System.out;
        out.println("\033[H\033[2J");
        boolean palavraValida = false;

        while (!palavraValida) {
            if (contador == 0 || nome[0] == null){
                palavraValida = true;
                out.println("Você ainda não jogou ou não acertou nenhuma palavra!");
                out.printf("\nVocê deseja ir para o menu? (S/N): ");
                char resposta = in.next().charAt(0);
                if (resposta == 'S' || resposta == 's') {
                    Menu();
                }
                if (resposta == 'N' || resposta == 'n') {
                    Sair();
                    palavraValida = true;
                    break;

                }
                break;
            }

            /*
             * if (acertos == 0 || nome == null) {
             * out.printf("Você ainda não jogou ou não acertou nenhuma palavra!\n");
             * } else if (acertos == 1 || nome == null) {
             * out.printf("Você acertou %d palavras!", acertos);
             * } else if (acertos > 1 || nome == null) {
             * out.printf("vapo\n");
             * }
             */

            if (nome[0] == null) {
                if (resposta == 'S' || resposta == 's') {
                    Menu();
                }
                if (resposta == 'N' || resposta == 'n') {
                    Sair();
                    palavraValida = true;
                    break;
                }
            }
            if (nome[0] != null) {
                // verificar as pontuações dos jogadores
                for (int i = 0; i < nome.length; i++) {
                    out.printf("\nPontuação do jogador %s: %d.\n", nome[i], acertos[i]);
                }
                out.printf("\n%s, você deseja ir para o menu? (S/N): ", nome[0]);
                char resposta = in.next().charAt(0);
                if (resposta == 'S' || resposta == 's') {
                    Menu();
                }
                if (resposta == 'N' || resposta == 'n') {
                    Sair();
                    palavraValida = true;
                    break;
                }
                palavraValida = true;
            }

            if (resposta == 'N' || resposta == 'n') {
                Sair();
                palavraValida = true;
                break;
            }
        }
        in.close();
        return "VerificarPontuacao";
    }
 public static String Sair() { // método Sair
        PrintStream out = System.out;
        out.println("\033[H\033[2J");
        out.println("Jogo encerrado.");
        return "Jogo encerrado";
    }

    /* 5 */
    public static String BemVindo() { // método boas vindas
        return "Bem vindo ao Jogo da Forca!";
    }

}

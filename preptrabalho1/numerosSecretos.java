package preptrabalho1;
//exercicio1
import java.util.Random;
import java.util.Scanner;
//Estas importações permitem o uso das classes Random (para gerar números aleatórios) e Scanner (para ler a entrada do jogador).
public class numerosSecretos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] numerosSecretos = new int[10];
        int tentativas = 0;
//Aqui estamos criando uma instância do Scanner para ler a entrada do jogador, uma instância do Random para gerar números aleatórios e um vetor numerosSecretos para armazenar os números secretos. A variável tentativas será usada para contar quantas tentativas o jogador fez.
        
        numerosSecretos[0] = random.nextInt(2);// Primeira casa pode ser 0 ou 1
        for (int i = 0; i < 5; i++){
            numerosSecretos[i] = random.nextInt(10);// Demais casas de 0 a 9
        }
//Estamos definindo o valor da primeira casa do vetor usando random.nextInt(2), que gera um número aleatório entre 0 (inclusivo) e 2 (exclusivo), ou seja, 0 ou 1. Depois, usamos um loop for para preencher as demais casas do vetor com números aleatórios de 0 a 9.

        // Mensagem de boas-vindas e instruções para o jogador
System.out.println("Teste sua sorte no Jogo de Adivinhação!");
System.out.println("Tente adivinhar um número de 0 a 9.");


//Este é o loop principal do jogo. Ele continuará executando até que uma condição de saída seja atingida (como acertar o número ou atingir o limite de tentativas).
        do {
            System.out.println("Adivinhe o número secreto (0 a 9): ");
            int tentativa = scanner.nextInt();
            tentativa++;

            boolean acertou = true;
            for (int i = 0; i < numerosSecretos.length; i++){
                if (numerosSecretos[i] != tentativa) {
                    acertou = false;
                    break;
                }
            }
//O jogador é solicitado a adivinhar um número entre 0 e 9. A variável tentativa armazena o valor digitado pelo jogador. A variável acertou é inicializada como true e será usada para verificar se a tentativa do jogador corresponde ao número secreto. Um loop for percorre o vetor numerosSecretos, comparando cada valor com a tentativa. Se algum valor for diferente, a variável acertou se torna false e o loop é interrompido.
            if (acertou) {
                System.out.println("Parabéns! Você acertou o número secreto.");
                break;
            } else {
                System.out.println("Número não encontrado. Tente novamente.");   
            }
            if (tentativas == 7) {
                System.out.println("Você usou todas as tentativas. O número secreto era: " + numerosSecretos[0]);
                break;
            }
//Se o jogador acertar o número, é exibida uma mensagem de parabéns. Caso contrário, é exibida uma mensagem informando que a tentativa não foi encontrada. Além disso, se o jogador usar todas as 10 tentativas, o programa exibirá qual era o número secreto e sairá do loop.
        } while (true);

        System.out.print("Deseja jogar novamente? (S/N): ");
        String jogarNovamente = scanner.next();
        if (jogarNovamente.equalsIgnoreCase("S")) {
            main(args);
        } else {
            System.out.println("Obrigado por jogar!");
        }
//O jogador é perguntado se deseja jogar novamente. Se a resposta for "S" (ou "s", devido ao uso de equalsIgnoreCase), o método main é chamado novamente para iniciar um novo jogo. Caso contrário, o programa é encerrado.

        scanner.close();
    }
}
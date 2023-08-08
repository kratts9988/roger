package preptrabalho1;
//exercicio1
import java.util.Random;

public class numerosSecretos {
    public static void main(String[] args) {

        int [] numerosSecretos = new int[3];
    
        int tentativas = 0;
    
        Random random = new Random();

        for (int i = 0; i < numerosSecretos.length; i++){
        numerosSecretos[i] = random.nextInt(10);
        }


            System.out.println("Números Secretos: ");

            for (int numero : numerosSecretos) {
                System.out.println(numero + " ");
        }
        System.out.println();
    }
}
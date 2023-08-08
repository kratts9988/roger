package exemplos;
public class media {
    public static double calcularMedia(double num1, double num2, double num3) {
        double soma = num1 + num2 + num3;
        double media = soma / 3;
        return media;
        
    }
    public static void main(String[] args) {        
        double num1 = 8;
        double num2 = 1; 
        double num3 = 9;
    
        double media = calcularMedia(num1, num2, num3);
        System.out.println("A média é: " + media);
    }
}

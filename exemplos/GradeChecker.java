package exemplos;

public class GradeChecker {
    public static void main(String[]args){
        int grade = 55;

        if (grade >=80) {
            System.out.println("excellent!");
        } else if (grade>=80) {
            System.out.println("Very good!");
        } else if (grade>=70) {
            System.out.println("Good!");
        } else if (grade>=60) {
            System.out.println("Satisfactory!");
        } else {
            System.out.println("Needs improvement!");
        }
    }
    
}

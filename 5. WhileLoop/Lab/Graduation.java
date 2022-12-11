package WhileLoop.Lab;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        double sum = 0.0;
        int failed = 0;
        int grade = 0;

        while (grade < 12){
         double score = Double.parseDouble(scanner.nextLine());
         if (score < 4.00){
             failed++;
         }
         if (failed >= 2){
             System.out.printf("%s has been excluded at %d grade", name, grade);
             return;
         }
         grade++;
         sum += score;
        }
        double averageScore = sum / grade;
        System.out.printf("%s graduated. Average grade: %.2f", name, averageScore);
    }
}

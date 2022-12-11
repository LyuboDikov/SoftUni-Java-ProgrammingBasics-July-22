package WhileLoop.MoreExercises;

import java.util.Scanner;

public class ReportSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int expectedSum = Integer.parseInt(scanner.nextLine());
        int totalSum = 0;
        int transaction = 2;
        int CS = 0;
        int CC = 0;
        int csCount = 0;
        int ccCount = 0;
        String input = scanner.nextLine();

        boolean amountReached = false;


        while (!input.equals("End")) {
            int payment = Integer.parseInt(input);
            transaction++;
            if (transaction % 2 == 1) {
                if (payment > 100) {
                    System.out.println("Error in transaction!");
                } else {
                    System.out.println("Product sold!");
                    CS += payment;
                    totalSum += payment;
                    csCount++;
                }
            } else {
                if (payment < 10) {
                    System.out.println("Error in transaction!");
                } else {
                    System.out.println("Product sold!");
                    CC += payment;
                    totalSum += payment;
                    ccCount++;
                }
            }
            if (totalSum >= expectedSum){
                amountReached = true;
                break;
            }
            input = scanner.nextLine();
        }
        if (amountReached){
            System.out.printf("Average CS: %.2f\n", CS * 1.0 / csCount);
            System.out.printf("Average CC: %.2f", CC * 1.0 / ccCount);
        } else {
            System.out.println("Failed to collect required money for charity.");
        }
    }
}

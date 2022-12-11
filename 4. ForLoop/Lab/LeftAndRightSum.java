package ForLoop.Lab;

import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countNumber = Integer.parseInt(scanner.nextLine());
        int sum1 = 0;
        int sum2 = 0;

        for (int num = 1; num <= countNumber; num++) {
            int value = Integer.parseInt(scanner.nextLine());
            sum1 += value;
        }

        for (int num2 = 1; num2 <= countNumber; num2++){
            int value2 = Integer.parseInt(scanner.nextLine());
            sum2 += value2;
        }

        if (sum1 == sum2) {
            System.out.println("Yes, sum = " + sum1);
        } else {
            System.out.println("No, diff = " + Math.abs(sum1 - sum2));
        }
    }
}
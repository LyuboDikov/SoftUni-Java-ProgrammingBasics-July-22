package ForLoop.Lab;

import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countNumbers = Integer.parseInt(scanner.nextLine());

        int sumOdd = 0;
        int sumEven = 0;

        for (int num = 1; num <= countNumbers; num++) {
            int value = Integer.parseInt(scanner.nextLine());

            if (num % 2 != 0) {
                sumOdd += value;
            } else {
                sumEven += value;
            }
        }
        if (sumEven == sumOdd) {
            System.out.println("Yes\nSum = " + sumEven);
        } else {
            System.out.println("No\nDiff = " + Math.abs(sumEven - sumOdd));
        }
    }
}

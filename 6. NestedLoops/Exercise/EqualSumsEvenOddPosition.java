package Nested_Loops_Exercise;

import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        int currentNum = 0;
        for (int i = num1; i <= num2; i++) {

            currentNum = i;

            int evenSum = 0;
            int oddSum = 0;
            for (int j = 6; j >= 1; j--) {
                int digit = currentNum % 10;
                if (j % 2 == 0) {
                    evenSum += digit;
                } else {
                    oddSum += digit;
                }
                currentNum = currentNum / 10;
            }
            if (evenSum == oddSum){
                System.out.printf("%d ", i);
            }
        }
    }
}

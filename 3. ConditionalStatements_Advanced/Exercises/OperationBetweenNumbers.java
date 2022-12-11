package ConditionalStatements_Advanced.Exercises;

import java.util.Scanner;

public class OperationBetweenNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N1 = Integer.parseInt(scanner.nextLine());
        int N2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int result = 0;
        String type = "";

        if (operator.equals("+")) {
            result = N1 + N2;
            if (result % 2 == 0) {
                type = "even";
                System.out.printf("%d %s %d = %d - %s", N1, operator, N2, result, type);
            } else {
                type = "odd";
                System.out.printf("%d %s %d = %d - %s", N1, operator, N2, result, type);
            }
        } else if (operator.equals("-")) {
            result = N1 - N2;
            if (result % 2 == 0) {
                type = "even";
                System.out.printf("%d %s %d = %d - %s", N1, operator, N2, result, type);
            } else {
                type = "odd";
                System.out.printf("%d %s %d = %d - %s", N1, operator, N2, result, type);
            }
        } else if (operator.equals("*")) {
            result = N1 * N2;
            if (result % 2 == 0) {
                type = "even";
                System.out.printf("%d %s %d = %d - %s", N1, operator, N2, result, type);
            } else {
                type = "odd";
                System.out.printf("%d %s %d = %d - %s", N1, operator, N2, result, type);
            }
        } else if (operator.equals("/")) {
            double result2 = (N1 * 1.0) / N2;
            if (N2 == 0) {
                System.out.printf("Cannot divide %d by zero", N1);
            } else {
                System.out.printf("%d %s %d = %.2f", N1, operator, N2, result2);
            }
        } else if (operator.equals("%")) {
            double result3 = (N1 * 1.0) % N2;
            if (N2 == 0) {
                System.out.printf("Cannot divide %d by zero", N1);
            } else {
                System.out.printf("%d %s %d = %.0f", N1, operator, N2, result3);
            }
        }
    }
}
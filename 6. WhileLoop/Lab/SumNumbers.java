package WhileLoop.Lab;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initialNumber = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        while (sum < initialNumber) {
            int number = Integer.parseInt(scanner.nextLine());
            sum += number;
        }
        System.out.println(sum);
    }
}

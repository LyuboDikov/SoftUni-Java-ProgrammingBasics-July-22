package ForLoop.Exercise;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countNumbers = Integer.parseInt(scanner.nextLine());
        int max = Integer.MIN_VALUE;
        int sum = 0;


        for (int i = 1; i <= countNumbers; i++) {
            int value = Integer.parseInt(scanner.nextLine());
            sum += value;

            if (value > max) {
                max = value;
            }
        }
        int sumWithoutMax = sum - max;

        if (max == sumWithoutMax) {
            System.out.println("Yes\nSum = " + max);
        } else {
            int diff = Math.abs(max - sumWithoutMax);
            System.out.println("No\nDiff = " + diff);
        }
    }
}

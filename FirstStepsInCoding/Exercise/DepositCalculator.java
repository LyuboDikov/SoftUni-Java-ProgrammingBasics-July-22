package FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double depositSum = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double interest = Double.parseDouble(scanner.nextLine());
        double interestPerMonth = depositSum * (interest / 100) / 12;
        double totalSum = depositSum + months * interestPerMonth;

        System.out.println(totalSum);
    }
}

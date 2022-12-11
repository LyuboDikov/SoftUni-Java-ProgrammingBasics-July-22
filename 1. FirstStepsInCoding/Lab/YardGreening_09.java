package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class YardGreening_09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double squareMeters = Double.parseDouble(scanner.nextLine());

        double totalCost = squareMeters * 7.61;
        double discount = 0.18 * totalCost;

        double finalPrice = totalCost - discount;

        System.out.println("The final price is: " + finalPrice + " lv.");
        System.out.println("The discount is: " + discount + " lv.");

    }
}

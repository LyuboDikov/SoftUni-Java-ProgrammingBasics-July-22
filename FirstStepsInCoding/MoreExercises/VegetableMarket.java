package FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double vegetableKgPrice = Double.parseDouble(scanner.nextLine());
        double fruitsKgPrice = Double.parseDouble(scanner.nextLine());
        int vegetablesKg = Integer.parseInt(scanner.nextLine());
        int fruitsKg = Integer.parseInt(scanner.nextLine());

        double totalRevenue = (vegetableKgPrice * vegetablesKg) + (fruitsKgPrice * fruitsKg);

        double totalRevenueInEuro = totalRevenue / 1.94;

        System.out.printf("%.2f", totalRevenueInEuro);
    }
}

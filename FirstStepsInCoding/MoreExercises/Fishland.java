package FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class Fishland {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double mackerelKgPrice = Double.parseDouble(scanner.nextLine());
        double spratKgPrice = Double.parseDouble(scanner.nextLine());
        double bonitoKg = Double.parseDouble(scanner.nextLine());
        double scadKg = Double.parseDouble(scanner.nextLine());
        int musselsKg = Integer.parseInt(scanner.nextLine());

        double bonitoKgPrice = mackerelKgPrice + (mackerelKgPrice * 0.60);
        double scadKgPrice = spratKgPrice + (spratKgPrice * 0.80);

        double bonitoTotalPrice = bonitoKgPrice * bonitoKg;
        double scadTotalPrice = scadKgPrice * scadKg;
        double musselsTotalPrice = musselsKg * 7.50;

        double totalPrice = bonitoTotalPrice + scadTotalPrice + musselsTotalPrice;
        System.out.printf("%.2f", totalPrice);
    }
}

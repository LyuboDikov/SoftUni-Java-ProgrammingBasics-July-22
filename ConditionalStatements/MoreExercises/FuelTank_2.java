package ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class FuelTank_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String fuelType = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        String clubCard = scanner.nextLine();

        double gasPrice = 0;
        double gasolinePrice = 0;
        double dieselPrice = 0;

        if (clubCard.equals("Yes")) {
            gasPrice = 0.93 - 0.08;
            gasolinePrice = 2.22 - 0.18;
            dieselPrice = 2.33 - 0.12;
            switch (fuelType) {
                case "Gas":
                    if (quantity >= 20 && quantity <= 25) {
                        double total = (quantity * gasPrice) - (quantity * gasPrice * 0.08);
                        System.out.printf("%.2f lv.", total);
                    } else if (quantity > 25) {
                        double total = (quantity * gasPrice) - (quantity * gasPrice * 0.10);
                        System.out.printf("%.2f lv.", total);
                    } else {
                        double total = quantity * gasPrice;
                        System.out.printf("%.2f lv.", total);
                    }
                    break;
                case "Gasoline":
                    if (quantity >= 20 && quantity <= 25) {
                        double total = (quantity * gasolinePrice) - (quantity * gasolinePrice * 0.08);
                        System.out.printf("%.2f lv.", total);
                    } else if (quantity > 25) {
                        double total = (quantity * gasolinePrice) - (quantity * gasolinePrice * 0.10);
                        System.out.printf("%.2f lv.", total);
                    } else {
                        double total = quantity * gasolinePrice;
                        System.out.printf("%.2f lv.", total);
                    }
                    break;
                case "Diesel":
                    if (quantity >= 20 && quantity <= 25) {
                        double total = (quantity * dieselPrice) - (quantity * dieselPrice * 0.08);
                        System.out.printf("%.2f lv.", total);
                    } else if (quantity > 25) {
                        double total = (quantity * dieselPrice) - (quantity * dieselPrice * 0.10);
                        System.out.printf("%.2f lv.", total);
                    } else {
                        double total = quantity * dieselPrice;
                        System.out.printf("%.2f lv.", total);
                    }
                    break;
            }
        } else if (clubCard.equals("No")) {
            gasPrice = 0.93;
            gasolinePrice = 2.22;
            dieselPrice = 2.33;
            switch (fuelType) {
                case "Gas":
                    if (quantity >= 20 && quantity <= 25) {
                        double total = (quantity * gasPrice) - (quantity * gasPrice * 0.08);
                        System.out.printf("%.2f lv.", total);
                    } else if (quantity > 25) {
                        double total = (quantity * gasPrice) - (quantity * gasPrice * 0.10);
                        System.out.printf("%.2f lv.", total);
                    } else {
                        double total = quantity * gasPrice;
                        System.out.printf("%.2f lv.", total);
                    }
                    break;
                case "Gasoline":
                    if (quantity >= 20 && quantity <= 25) {
                        double total = (quantity * gasolinePrice) - (quantity * gasolinePrice * 0.08);
                        System.out.printf("%.2f lv.", total);
                    } else if (quantity > 25) {
                        double total = (quantity * gasolinePrice) - (quantity * gasolinePrice * 0.10);
                        System.out.printf("%.2f lv.", total);
                    } else {
                        double total = quantity * gasolinePrice;
                        System.out.printf("%.2f lv.", total);
                    }
                    break;
                case "Diesel":
                    if (quantity >= 20 && quantity <= 25) {
                        double total = (quantity * dieselPrice) - (quantity * dieselPrice * 0.08);
                        System.out.printf("%.2f lv.", total);
                    } else if (quantity > 25) {
                        double total = (quantity * dieselPrice) - (quantity * dieselPrice * 0.10);
                        System.out.printf("%.2f lv.", total);
                    } else {
                        double total = quantity * dieselPrice;
                        System.out.printf("%.2f lv.", total);
                    }
                    break;
            }
        }
    }
}
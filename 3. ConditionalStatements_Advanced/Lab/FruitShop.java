package ConditionalStatements_Advanced.Lab;

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double banana = 0.0;
        double apple = 0.0;
        double orange = 0.0;
        double grapefruit = 0.0;
        double kiwi = 0.0;
        double pineapple = 0.0;
        double grapes = 0.0;

        if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")) {
            switch (fruit) {
                case "banana":
                    banana = quantity * 2.50;
                    System.out.printf("%.2f", banana);
                    break;
                case "apple":
                    apple = quantity * 1.20;
                    System.out.printf("%.2f", apple);
                    break;
                case "orange":
                    orange = quantity * 0.85;
                    System.out.printf("%.2f", orange);
                    break;
                case "grapefruit":
                    grapefruit = quantity * 1.45;
                    System.out.printf("%.2f", grapefruit);
                    break;
                case "kiwi":
                    kiwi = quantity * 2.70;
                    System.out.printf("%.2f", kiwi);
                    break;
                case "pineapple":
                    pineapple = quantity * 5.50;
                    System.out.printf("%.2f", pineapple);
                    break;
                case "grapes":
                    grapes = quantity * 3.85;
                    System.out.printf("%.2f", grapes);
                    break;
                default:
                    System.out.println("error");
                    break;
            }
        } else if (day.equals("Saturday") || day.equals("Sunday")) {
            switch (fruit) {
                case "banana":
                    banana = quantity * 2.70;
                    System.out.printf("%.2f", banana);
                    break;
                case "apple":
                    apple = quantity * 1.25;
                    System.out.printf("%.2f", apple);
                    break;
                case "orange":
                    orange = quantity * 0.90;
                    System.out.printf("%.2f", orange);
                    break;
                case "grapefruit":
                    grapefruit = quantity * 1.60;
                    System.out.printf("%.2f", grapefruit);
                    break;
                case "kiwi":
                    kiwi = quantity * 3.00;
                    System.out.printf("%.2f", kiwi);
                    break;
                case "pineapple":
                    pineapple = quantity * 5.60;
                    System.out.printf("%.2f", pineapple);
                    break;
                case "grapes":
                    grapes = quantity * 4.20;
                    System.out.printf("%.2f", grapes);
                    break;
                default:
                System.out.println("error");
                break;
            }
        } else {
            System.out.println("error");
        }
    }
}
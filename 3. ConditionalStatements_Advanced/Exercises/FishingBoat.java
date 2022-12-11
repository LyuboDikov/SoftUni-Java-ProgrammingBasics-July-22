package ConditionalStatements_Advanced.Exercises;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermen = Integer.parseInt(scanner.nextLine());
        double boatPrice = 0.0;

        switch (season) {
            case "Spring":
                boatPrice = 3000;
                if (fishermen <= 6) {
                    boatPrice = 3000 - (3000 * 0.10);
                } else if (fishermen <= 11) {
                    boatPrice = 3000 - (3000 * 0.15);
                } else {
                    boatPrice = 3000 - (3000 * 0.25);
                }
                break;
            case "Summer":
            case "Autumn":
                boatPrice = 3000;
                if (fishermen <= 6) {
                    boatPrice = 4200 - (4200 * 0.10);
                } else if (fishermen <= 11) {
                    boatPrice = 4200 - (4200 * 0.15);
                } else {
                    boatPrice = 4200 - (4200 * 0.25);
                }
                break;
            case "Winter":
                boatPrice = 2600;
                if (fishermen <= 6) {
                    boatPrice = 2600 - (2600 * 0.10);
                } else if (fishermen <= 11) {
                    boatPrice = 2600 - (2600 * 0.15);
                } else {
                    boatPrice = 2600 - (2600 * 0.25);
                }
                break;
            }
        if (season.equals("Summer") || season.equals("Spring") || season.equals("Winter")){
            if (fishermen % 2 == 0){
                boatPrice = boatPrice - (boatPrice * 0.05);
            }
        } if (budget >= boatPrice){
            System.out.printf("Yes! You have %.2f leva left.", budget - boatPrice);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", boatPrice - budget);
        }
    }
}
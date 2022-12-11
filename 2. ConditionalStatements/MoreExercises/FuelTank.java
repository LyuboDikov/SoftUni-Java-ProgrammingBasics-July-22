package ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class FuelTank {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Напишете програма, която познава дали резервоара на едно превозно средство има нужда от презареждане на горивото или не.
        // От конзолата се четат два реда – текст и реално число, на първия ред се чете типа на горивото – текст с възможности:
        // "Diesel", "Gasoline" или "Gas", а на втория литрите гориво, които има в резервоара.
        // Ако литрите гориво са повече или равни на 25, на конзолата да се отпечата "You have enough {вида на горивото}.",
        // ако са по-малко от 25, да се отпечата "Fill your tank with {вида на горивото}!".
        // В случай, че бъде въведено гориво, различно от посоченото, да се отпечата "Invalid fuel!".

        String fuel = scanner.nextLine();
        double liters = Double.parseDouble(scanner.nextLine());
        fuel = fuel.toLowerCase();

        if (fuel.equals("diesel") || fuel.equals("gasoline") || fuel.equals("gas")) {
            if (liters >= 25) {
                System.out.printf("You have enough %s.", fuel);
            } else {
                System.out.printf("Fill your tank with %s!", fuel);
            }
        } else {
            System.out.println("Invalid fuel!");
        }
    }
}

package ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int foodKg = Integer.parseInt(scanner.nextLine());
        double dogFoodPerDay = Double.parseDouble(scanner.nextLine());
        double catFoodPerDay = Double.parseDouble(scanner.nextLine());
        double turtleFoodPerDay = Double.parseDouble(scanner.nextLine());

        double totalDogFood = dogFoodPerDay * days;
        double totalCatFood = catFoodPerDay * days;
        double totalTurtleFood = (turtleFoodPerDay * days) / 1000;

        double totalFood = totalDogFood + totalCatFood + totalTurtleFood;

        if (totalFood <= foodKg) {
            System.out.printf("%.0f kilos of food left.", Math.floor(foodKg - totalFood));
        } else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(totalFood - foodKg));
        }
    }
}

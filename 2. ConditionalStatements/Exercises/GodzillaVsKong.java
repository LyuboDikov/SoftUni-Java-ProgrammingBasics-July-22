package ConditionalStatements.Exercises;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //•	Декорът за филма е на стойност 10% от бюджета.
        //•	При повече от 150 статиста,  има отстъпка за облеклото на стойност 10%.

        double filmBudget = Double.parseDouble(scanner.nextLine());
        int extras = Integer.parseInt(scanner.nextLine());
        double pricePerOutfit = Double.parseDouble(scanner.nextLine());

        double decorPrice = filmBudget * 0.10;
        double totalOutfitPrice = pricePerOutfit * extras;

        if (extras > 150){
            totalOutfitPrice = totalOutfitPrice - totalOutfitPrice * 0.10;
        }
        if (totalOutfitPrice + decorPrice > filmBudget){
            double moneyNeeded = (totalOutfitPrice + decorPrice) - filmBudget;
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", moneyNeeded );
        } else {
            double moneyLeft = filmBudget - (totalOutfitPrice + decorPrice);
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", moneyLeft);
        }
    }
}

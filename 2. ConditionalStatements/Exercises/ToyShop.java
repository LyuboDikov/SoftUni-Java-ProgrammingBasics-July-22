package ConditionalStatements.Exercises;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //1.	Цена на екскурзията - реално число в интервала [1.00 … 10000.00]
        //2.	Брой пъзели - цяло число в интервала [0… 1000]
        //3.	Брой говорещи кукли - цяло число в интервала [0 … 1000]
        //4.	Брой плюшени мечета - цяло число в интервала [0 … 1000]
        //5.	Брой миньони - цяло число в интервала [0 … 1000]
        //6.	Брой камиончета - цяло число в интервала [0 … 1000]

        double tripPrice = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        //Ако поръчаните играчки са 50 или повече магазинът прави отстъпка 25% от общата цена.
        // От спечелените пари Петя трябва да даде 10% за наема на магазина. Да се пресметне дали парите ще ѝ стигнат да отиде на екскурзия.

        int toysCount = puzzles + dolls + bears + minions + trucks;

        double puzzlePrice = puzzles * 2.60;
        double dollsPrice = dolls * 3;
        double bearsPrice = bears * 4.10;
        double minionPrice = minions * 8.20;
        double truckPrice = trucks * 2;

        double totalPrice = puzzlePrice + dollsPrice + bearsPrice + minionPrice + truckPrice;

        if (toysCount >= 50) {
            totalPrice = totalPrice - totalPrice * 0.25;
        }
        double rent = totalPrice * 0.10;
        double budget = totalPrice - rent;

        if (budget >= tripPrice) {
            double moneyLeft = budget - tripPrice;
            System.out.printf("Yes! %.2f lv left.", moneyLeft);
        } else {
            double moneyNeeded = tripPrice - budget;
            System.out.printf("Not enough money! %.2f lv needed.", moneyNeeded);
        }

    }
}


package ConditionalStatements.Exercises;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //1.	Бюджетът на Петър - реално число в интервала [0.0…100000.0]
        //2.	Броят видеокарти - цяло число в интервала [0…100]
        //3.	Броят процесори - цяло число в интервала [0…100]
        //4.	Броят рам памет - цяло число в интервала [0…100]

        double budget = Double.parseDouble(scanner.nextLine());
        int videoCards = Integer.parseInt(scanner.nextLine());
        int processors = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());

        //Петър иска да купи N видеокарти, M процесора и P на брой рам памет. Ако броя на видеокартите е по-голям от този на процесорите
        // получава 15% отстъпка от крайната сметка. Важат следните цени:
        //•	Видеокарта – 250 лв./бр.
        //•	Процесор – 35% от цената на закупените видеокарти/бр.
        //•	Рам памет – 10% от цената на закупените видеокарти/бр.
        //Да се изчисли нужната сума за закупуване на материалите и да се пресметне дали бюджета ще му стигне.

        int videoCardPrice = videoCards * 250;
        double processorsPrice = processors * (videoCardPrice * 0.35);
        double ramPrice = ram * (videoCardPrice * 0.10);
        double totalPrice = videoCardPrice + ramPrice + processorsPrice;

        if (videoCards > processors){
            totalPrice = totalPrice - (totalPrice * 0.15);
        }
        if (budget >= totalPrice){
            double remainingMoney = budget - totalPrice;
            System.out.printf("You have %.2f leva left!", remainingMoney);
        } else {
            totalPrice = totalPrice - budget;
            System.out.printf("Not enough money! You need %.2f leva more!", totalPrice);
        }
    }
}

package ConditionalStatements_Advanced.Exercises;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Съществуват следните отстъпки:
        //•	Ако Нели купи повече от 80 Рози - 10% отстъпка от крайната цена
        //•	Ако Нели купи повече от 90  Далии - 15% отстъпка от крайната цена
        //•	Ако Нели купи повече от 80 Лалета - 15% отстъпка от крайната цена
        //•	Ако Нели купи по-малко от 120 Нарциса - цената се оскъпява с 15%
        //•	Ако Нели Купи по-малко от 80 Гладиоли - цената се оскъпява с 20%
        //От конзолата се четат 3 реда:
        //•	Вид цветя - текст с възможности - "Roses", "Dahlias", "Tulips", "Narcissus", "Gladiolus"
        //•	Брой цветя - цяло число в интервала [10…1000]
        //•	Бюджет - цяло число в интервала [50…2500]

        String flowerType = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0.0;
        double moneyLeft = 0.0;
        double moneyNeeded = 0.0;

        switch (flowerType) {
            case "Roses":
                if (quantity > 80) {
                    totalPrice = (quantity * 5) - ((quantity * 5) * 0.10);
                } else {
                    totalPrice = quantity * 5;
                }
                if (budget >= totalPrice) {
                    moneyLeft = budget - totalPrice;
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", quantity, flowerType, moneyLeft);
                } else {
                    moneyNeeded = totalPrice - budget;
                    System.out.printf("Not enough money, you need %.2f leva more.", moneyNeeded);
                }
                break;
            case "Dahlias":
                if (quantity > 90) {
                    totalPrice = (quantity * 3.80) - ((quantity * 3.80) * 0.15);
                } else {
                    totalPrice = quantity * 3.80;
                }
                if (budget >= totalPrice) {
                    moneyLeft = budget - totalPrice;
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", quantity, flowerType, moneyLeft);
                } else {
                    moneyNeeded = totalPrice - budget;
                    System.out.printf("Not enough money, you need %.2f leva more.", moneyNeeded);
                }
                break;
            case "Tulips":
                if (quantity > 80) {
                    totalPrice = (quantity * 2.80) - ((quantity * 2.80) * 0.15);
                } else {
                    totalPrice = quantity * 2.80;
                }
                if (budget >= totalPrice) {
                    moneyLeft = budget - totalPrice;
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", quantity, flowerType, moneyLeft);
                } else {
                    moneyNeeded = totalPrice - budget;
                    System.out.printf("Not enough money, you need %.2f leva more.", moneyNeeded);
                }
                break;
            case "Narcissus":
                if (quantity < 120) {
                    totalPrice = (quantity * 3) + ((quantity * 3) * 0.15);
                } else {
                    totalPrice = quantity * 3;
                }
                if (budget >= totalPrice) {
                    moneyLeft = budget - totalPrice;
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", quantity, flowerType, moneyLeft);
                } else {
                    moneyNeeded = totalPrice - budget;
                    System.out.printf("Not enough money, you need %.2f leva more.", moneyNeeded);
                }
                break;
            case "Gladiolus":
                if (quantity < 80) {
                    totalPrice = (quantity * 2.50) + ((quantity * 2.50) * 0.20);
                } else {
                    totalPrice = quantity * 2.50;
                }
                if (budget >= totalPrice) {
                    moneyLeft = budget - totalPrice;
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", quantity, flowerType, moneyLeft);
                } else {
                    moneyNeeded = totalPrice - budget;
                    System.out.printf("Not enough money, you need %.2f leva more.", moneyNeeded);
                }
                break;
        }
    }
}
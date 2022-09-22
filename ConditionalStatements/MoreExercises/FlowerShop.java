package ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Мария иска да купи подарък на сина си. Тя работи в магазин за цветя. В магазина идва поръчка за цветя.
        // Напишете програма, която пресмята сумата от поръчката и дали печалбата е достатъчна за подаръка. Цветята имат следните цени:
        //
        //•	Магнолии – 3.25 лева
        //•	Зюмбюли – 4 лева
        //•	Рози – 3.50 лева
        //•	Кактуси – 8 лева
        //От общата сума, Мария трябва да плати 5% данъци.

        int magnolia = Integer.parseInt(scanner.nextLine());
        int hyacinth = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int cactus = Integer.parseInt(scanner.nextLine());
        double presentPrice = Double.parseDouble(scanner.nextLine());

        double magnoliaTotal = magnolia * 3.25;
        double hyacinthTotal = hyacinth * 4.00;
        double rosesTotal = roses * 3.50;
        double cactusTotal = cactus * 8;

        double totalBeforeTax = magnoliaTotal + hyacinthTotal + rosesTotal + cactusTotal;
        double total = totalBeforeTax - (totalBeforeTax * 0.05);

        if (total >= presentPrice) {
            System.out.printf("She is left with %d leva.", Math.round(Math.floor(total - presentPrice)));
        } else {
            System.out.printf("She will have to borrow %d leva.", Math.round(Math.ceil(presentPrice - total)));
        }
    }
}

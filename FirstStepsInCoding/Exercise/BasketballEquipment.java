package FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Напишете програма, която изчислява какви разходи ще има Джеси, ако започне да тренира,
        // като знаете колко е таксата за тренировки по баскетбол за период от 1 година. Нужна екипировка:
        //•	Баскетболни кецове – цената им е 40% по-малка от таксата за една година
        //•	Баскетболен екип – цената му е 20% по-евтина от тази на кецовете
        //•	Баскетболна топка – цената ѝ е 1 / 4 от цената на баскетболния екип
        //•	Баскетболни аксесоари – цената им е 1 / 5 от цената на баскетболната топка

        int taxPerYear = Integer.parseInt(scanner.nextLine());

        double sneakers = taxPerYear - (taxPerYear * 0.40);
        double jersey = sneakers - (sneakers * 0.20);
        double ball = jersey / 4;
        double accessories = ball / 5;

        double totalExpenses = taxPerYear + sneakers + jersey + ball + accessories;
        System.out.println(totalExpenses);

    }
}

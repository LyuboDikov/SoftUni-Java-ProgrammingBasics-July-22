package ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //От лозе с площ X квадратни метри се заделя 40% от реколтата за производство на вино. От 1 кв.м лозе се изкарват Y килограма грозде.
        // За 1 литър вино са нужни 2,5 кг. грозде. Желаното количество вино за продан е Z литра.
        //Напишете програма, която пресмята колко вино може да се произведе и дали това количество е достатъчно.
        // Ако е достатъчно, остатъкът се разделя по равно между работниците на лозето.

        //•	1ви ред: X кв.м е лозето – цяло число в интервала [10 … 5000]
        //•	2ри ред: Y грозде за един кв.м – реално число в интервала [0.00 … 10.00]
        //•	3ти ред: Z нужни литри вино – цяло число в интервала [10 … 600]
        //•	4ти ред: брой работници – цяло число в интервала [1 … 20]

        int vineyardArea = Integer.parseInt(scanner.nextLine());
        double grapePerSquareMeter = Double.parseDouble(scanner.nextLine());
        int neededLitres = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());

        double totalGrapeKg = grapePerSquareMeter * vineyardArea;
        double totalGrapeForWine = totalGrapeKg * 0.4;
        double totalLitres = totalGrapeForWine / 2.5;

        if (totalLitres < neededLitres){
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(neededLitres - totalLitres));
        } else {
            System.out.printf("Good harvest this year! Total wine: %.0f liters.\n", Math.floor(totalLitres));
            System.out.printf("%.0f liters left -> %.0f liters per person.", Math.ceil(totalLitres - neededLitres), Math.ceil((totalLitres - neededLitres) / workers));
        }
    }
}

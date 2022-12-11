package FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //•	Предпазен найлон - 1.50 лв. за кв. метър
        //•	Боя - 14.50 лв. за литър
        //•	Разредител за боя - 5.00 лв. за литър

        //За всеки случай, към необходимите материали, Румен иска да добави още 10% от количеството боя и 2 кв.м. найлон,
        // разбира се и 0.40 лв. за торбички.
        // Сумата, която се заплаща на майсторите за 1 час работа, е равна на 30% от сбора на всички разходи за материали.

        int neededNylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int amb = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        int totalNylon = neededNylon + 2;
        double totalPaint = paint + (paint * 0.10);
        double bags = 0.40;

        double nylonPrice = totalNylon * 1.50;
        double paintPrice = totalPaint * 14.50;
        double ambPrice = amb * 5.00;

        double totalMaterialPrice = paintPrice + nylonPrice + ambPrice + bags;

        double labourPerHour = totalMaterialPrice * 0.3;
        double totalLabourPrice = labourPerHour * hours;

        double totalSum = totalLabourPrice + totalMaterialPrice;

        System.out.println(totalSum);
    }
}

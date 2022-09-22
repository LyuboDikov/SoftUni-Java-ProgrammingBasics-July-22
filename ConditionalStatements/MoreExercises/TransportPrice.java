package ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Студент трябва да пропътува n километра. Той има избор измежду три вида транспорт:
        //•	Такси. Начална такса: 0.70 лв. Дневна тарифа: 0.79 лв. / км. Нощна тарифа: 0.90 лв. / км.
        //•	Автобус. Дневна / нощна тарифа: 0.09 лв. / км. Може да се използва за разстояния минимум 20 км.
        //•	Влак. Дневна / нощна тарифа: 0.06 лв. / км. Може да се използва за разстояния минимум 100 км.
        //Напишете програма, която въвежда броя километри n и период от деня (ден или нощ) и изчислява цената на най-евтиния транспорт.

        //•	Първият ред съдържа числото n – брой километри – цяло число в интервала [1…5000]
        //•	Вторият ред съдържа дума “day” или “night” – пътуване през деня или през нощта

        int distance = Integer.parseInt(scanner.nextLine());
        String timeOfDay = scanner.nextLine();
        double price = 0;

        if (distance < 20) {
            if (timeOfDay.equals("day")){
                price = 0.70 + (distance * 0.79);
            } else if (timeOfDay.equals("night")){
                price = 0.70 + (distance * 0.90);
            }
            System.out.printf("%.2f", price);
        } else if (distance < 100) {
            if (timeOfDay.equals("day") || timeOfDay.equals("night")) {
                price = distance * 0.09;
                System.out.printf("%.2f", price);
            }
        } else {
            if (timeOfDay.equals("day") || timeOfDay.equals("night")){
                price = distance * 0.06;
                System.out.printf("%.2f", price);
            }
        }
    }
}

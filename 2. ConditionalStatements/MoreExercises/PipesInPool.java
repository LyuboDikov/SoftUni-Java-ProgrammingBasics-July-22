package ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //Басейн с обем V има две тръби от които се пълни. Всяка тръба има определен дебит (литрите вода минаващи през една тръба за един час).
        // Работникът пуска тръбите едновременно и излиза за N часа.
        // Напишете програма, която изкарва състоянието на басейна, в момента, когато работникът се върне.

        //От конзолата се четат четири реда:
        //•	Първият ред съдържа числото V – Обем на басейна в литри – цяло число в интервала [1…10000].
        //•	Вторият ред съдържа числото P1 – дебит на първата тръба за час – цяло число в интервала [1…5000].
        //•	Третият ред съдържа числото P2 – дебит на втората тръба за час– цяло число в интервала [1…5000].
        //•	Четвъртият ред съдържа числото H – часовете които работникът отсъства – реално число в интервала [1.0…24.00]

        int V = Integer.parseInt(scanner.nextLine());
        int P1 = Integer.parseInt(scanner.nextLine());
        int P2 = Integer.parseInt(scanner.nextLine());
        double H = Double.parseDouble(scanner.nextLine());

        double totalVolumeP1 = P1 * H;
        double totalVolumeP2 = P2 * H;

        double totalFilled = totalVolumeP1 + totalVolumeP2;
        double totalFilledP1Percent = ((totalVolumeP1 / totalFilled) * 100);
        double totalFilledP2Percent = ((totalVolumeP2 / totalFilled) * 100);

        if (V >= totalFilled) {
            double totalFilledPercentage = (totalFilled / V) * 100;
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", totalFilledPercentage, totalFilledP1Percent, totalFilledP2Percent);
        } else {
            double overflow = totalFilled - V;
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", H, overflow);
        }
    }
}
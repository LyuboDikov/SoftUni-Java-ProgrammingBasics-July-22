package ConditionalStatements.Exercises;

import java.util.Scanner;

public class TimePlus15Minutes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int min2 = minutes + 15;

        if (min2 > 59) {
            min2 -= 60;
            hours++;
        }
        if (hours == 24) {
            hours = 0;
        }
        if (min2 < 10) {
            System.out.printf("%d:%02d", hours, min2);
        } else {
            System.out.printf("%d:%d", hours, min2);
        }
    }
}

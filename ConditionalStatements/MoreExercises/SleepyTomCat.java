package ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class SleepyTomCat {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int offDays = Integer.parseInt(scanner.nextLine());

        int tomsNorm = 30000;

        int workDaysPlay = (365 - offDays) * 63;
        int offDaysPlay = offDays * 127;

        int totalPlayTime = Math.abs((workDaysPlay + offDaysPlay) - tomsNorm);

        int totalHours = totalPlayTime / 60;
        int totalMinutes = totalPlayTime % 60;

        if ((workDaysPlay + offDaysPlay) >= tomsNorm) {
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play", totalHours, totalMinutes);
        } else {
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play", totalHours, totalMinutes);
        }
    }
}
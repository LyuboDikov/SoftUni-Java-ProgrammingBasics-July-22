package ForLoop.Exercise;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tournaments = Integer.parseInt(scanner.nextLine());
        int initialPoints = Integer.parseInt(scanner.nextLine());
        int pointsWon = 0;
        int tournamentsWon = 0;

        for (int i = 0; i < tournaments; i++) {
            String place = scanner.nextLine();

            switch (place){
                case "W":
                   pointsWon += 2000;
                   tournamentsWon++;
                    break;
                case "F":
                    pointsWon += 1200;
                    break;
                case "SF":
                    pointsWon += 720;
                    break;
            }
        }
        int averagePoints = pointsWon / tournaments;
        System.out.printf("Final points: %d\n", initialPoints + pointsWon);
        System.out.printf("Average points: %.0f\n", Math.floor(Math.round(averagePoints)));
        System.out.printf("%.2f%%", ((tournamentsWon * 1.0) / tournaments) * 100);
    }
}

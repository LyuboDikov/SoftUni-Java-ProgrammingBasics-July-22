package ForLoop.Exercise;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double academyPoints = Double.parseDouble(scanner.nextLine());
        int voters = Integer.parseInt(scanner.nextLine());

        double actorsPoints = 0.0;
        for (int i = 1; i <= voters; i++) {
            String voterName = scanner.nextLine();
            double voterNamePoints = Double.parseDouble(scanner.nextLine());
            academyPoints += ((voterName.length() * voterNamePoints) / 2);

            if (academyPoints > 1250.5){
                break;
            }
        }
        if (academyPoints > 1250.5){
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName,academyPoints);
        } else {
            System.out.printf("Sorry, %s you need %.1f more!", actorName, 1250.5 - academyPoints);
        }
    }
}

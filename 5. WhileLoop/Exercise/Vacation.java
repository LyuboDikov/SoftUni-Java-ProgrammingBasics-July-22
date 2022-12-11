package WhileLoop.Exercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vacationPrice = Double.parseDouble(scanner.nextLine());
        double availableMoney = Double.parseDouble(scanner.nextLine());

        int spendingCounter = 0;
        int daysCounter = 0;

        while (availableMoney < vacationPrice && spendingCounter < 5) {
            String input = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());
            daysCounter++;

            if (input.equals("save")) {
                availableMoney += money;
                spendingCounter = 0;
            } else if (input.equals("spend")){
                availableMoney -= money;
                spendingCounter += 1;
                if (availableMoney < 0) {
                    availableMoney = 0;
                }
            }
        }
        if (spendingCounter == 5){
            System.out.printf("You can't save the money.\n" + daysCounter);
        }
        if (availableMoney >= vacationPrice){
            System.out.printf("You saved the money for %d days.", daysCounter);
        }
    }
}
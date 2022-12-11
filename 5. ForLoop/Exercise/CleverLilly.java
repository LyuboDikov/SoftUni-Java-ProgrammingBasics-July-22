package ForLoop.Exercise;

import java.util.Scanner;

public class CleverLilly {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double washingMachine = Double.parseDouble(scanner.nextLine());
        int pricePerToy = Integer.parseInt(scanner.nextLine());

        int toys = 0;
        double sum = 0.0;
        int money = 10;

        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0){
                sum += money;
                money += 10;
                sum -= 1;
            } else {
                toys++;
            }
        }
        double toysTotalValue = toys * pricePerToy;
        double totalMoney = toysTotalValue + sum;

        if (washingMachine <= totalMoney){
            System.out.printf("Yes! %.2f", Math.abs(totalMoney - washingMachine));
        } else {
            System.out.printf("No! %.2f", Math.abs(washingMachine - totalMoney));
        }
    }
}

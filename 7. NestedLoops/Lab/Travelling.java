package Nested_Loops_Lab;

import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();

        while (!destination.equals("End")){
            double budget = Double.parseDouble(scanner.nextLine());
            double totalMoney = 0;

            while (budget > totalMoney){
                double savedMoney = Double.parseDouble(scanner.nextLine());

                totalMoney += savedMoney;
            }
            System.out.printf("Going to %s!\n", destination);
            destination = scanner.nextLine();
        }
    }
}

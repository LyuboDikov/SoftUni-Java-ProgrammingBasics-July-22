package WhileLoop.Exercise;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double change = Double.parseDouble(scanner.nextLine());

        int coins = 0;

        double changeSt = change * 100;

        while (changeSt > 0) {
            if (changeSt >= 200) {
                coins++;
                changeSt -= 200;
            } else if (changeSt >= 100) {
                coins++;
                changeSt -= 100;
            } else if (changeSt >= 50) {
                coins++;
                changeSt -= 50;
            } else if (changeSt >= 20) {
                coins++;
                changeSt -= 20;
            } else if (changeSt >= 10) {
                coins++;
                changeSt -= 10;
            } else if (changeSt >= 5) {
                coins++;
                changeSt -= 5;
            } else if (changeSt >= 2) {
                coins++;
                changeSt -= 2;
            } else if (changeSt >= 1) {
                coins++;
                changeSt -= 1;
            } else {
                break;
            }
        }
        System.out.println(coins);
    }
}

package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class PetShop_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dogFood = Integer.parseInt(scanner.nextLine());
        int catFood = Integer.parseInt(scanner.nextLine());

        double totalDogFood = dogFood * 2.50;
        double totalCatFood = catFood * 4;

        double totalCost = totalCatFood + totalDogFood;

        System.out.println(totalCost + " lv.");
    }
}

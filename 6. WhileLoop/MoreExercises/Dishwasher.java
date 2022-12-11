package WhileLoop.MoreExercises;

import java.util.Scanner;

public class Dishwasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int detergentBottles = Integer.parseInt(scanner.nextLine());

        int detergentMl = detergentBottles * 750;
        int machineLoading = 0;
        int dishes = 0;
        int pots = 0;
        boolean isEmpty = false;

        String input = scanner.nextLine();

        while (!input.equals("End")){
            machineLoading++;
            int dishesOrPots = Integer.parseInt(input);
            if (machineLoading <= 2) {
                detergentMl -= dishesOrPots * 5;
                dishes += dishesOrPots;
            } else {
                detergentMl -= dishesOrPots * 15;
                pots += dishesOrPots;
                machineLoading = 0;
            }
            if (detergentMl < 0){
                isEmpty = true;
                break;
            }
            input = scanner.nextLine();
        }
        if (isEmpty){
            System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(detergentMl));
        } else {
            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.\n", dishes, pots);
            System.out.printf("Leftover detergent %d ml.", Math.abs(detergentMl));
        }
    }
}

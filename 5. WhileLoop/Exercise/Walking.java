package WhileLoop.Exercise;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stepsTarget = 10000;
        int steps = 0;

        while (stepsTarget > steps){
            String input = scanner.nextLine();
            if (input.equals("Going home")){
                steps += Integer.parseInt(scanner.nextLine());
                break;
            }
            steps += Integer.parseInt(input);
        }
        if (steps >= stepsTarget){
            System.out.printf("Goal reached! Good job!\n" +
                    "%d steps over the goal!", steps - stepsTarget);
        } else {
            System.out.printf("%d more steps to reach goal.", stepsTarget - steps);
        }
    }
}

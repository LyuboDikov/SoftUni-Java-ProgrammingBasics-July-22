package FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class CircleAreaAndPerimeter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double r = Double.parseDouble(scanner.nextLine());

        double circleDiameter = r * r;
        double circleArea = Math.PI * circleDiameter;

        double circlePerimeter = 2 * Math.PI * r;

        System.out.printf("%.2f\n" , circleArea);
        System.out.printf("%.2f", circlePerimeter);
    }
}

package FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class HousePainting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double frontAndRear = 2 * (x * x) - (1.2 * 2); //front and rear, minus the door on front side;
        double sideWalls = 2 * (x * y) - (2 * (1.5 * 1.5)); //2 walls - 2 windows;
        double houseArea = frontAndRear + sideWalls;

        double roofArea = ((x * y) * 2) + ((x * h / 2) * 2);

        double greenPaint = houseArea / 3.4;
        double redPaint = roofArea / 4.3;

        System.out.printf("%.2f\n", greenPaint);
        System.out.printf("%.2f", redPaint);
    }
}

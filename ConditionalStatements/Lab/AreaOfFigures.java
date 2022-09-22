package ConditionalStatements.Lab;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String figure = scanner.nextLine();

        if (figure.equals("square")){
            double lenght = Double.parseDouble(scanner.nextLine());
            double area = lenght * lenght;
            System.out.printf("%.3f", area);
        } else if (figure.equals("rectangle")){
            double lenght1 = Double.parseDouble(scanner.nextLine());
            double lenght2 = Double.parseDouble(scanner.nextLine());
            double area = lenght1 * lenght2;
            System.out.printf("%.3f", area);
        } else if (figure.equals("circle")){
            double radius = Double.parseDouble(scanner.nextLine());
            double area = Math.PI * radius * radius;
            System.out.printf("%.3f", area);
        } else if (figure.equals("triangle")){
            double lenght = Double.parseDouble(scanner.nextLine());
            double height = Double.parseDouble(scanner.nextLine());
            double area = lenght * height / 2;
            System.out.printf("%.3f", area);
        }
    }
}

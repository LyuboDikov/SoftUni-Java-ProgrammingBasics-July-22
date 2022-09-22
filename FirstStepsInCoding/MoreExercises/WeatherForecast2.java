package FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class WeatherForecast2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double degrees = Double.parseDouble(scanner.nextLine());

        if (degrees >= 26.00 && degrees <= 35.0){
            System.out.println("Hot");
        } else if (degrees <= 25.9 && degrees >= 20.1) {
            System.out.println("Warm");
        } else if (degrees <= 20.00 && degrees >= 15.00){
            System.out.println("Mild");
        } else if (degrees <= 14.9 && degrees >= 12.00){
            System.out.println("Cool");
        } else if (degrees <= 11.9 && degrees >= 5.00){
            System.out.println("Cold");
        } else {
            System.out.println("unknown");
        }
    }
}

package ConditionalStatements_Advanced.Exercises;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String ticketType = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        int totalSeats = rows * columns;
        double revenue = 0.0;

        if (ticketType.equals("Premiere")) {
            revenue = totalSeats * 12.00;
            System.out.printf("%.2f", revenue);
        } else if (ticketType.equals("Normal")) {
            revenue = totalSeats * 7.50;
            System.out.printf("%.2f", revenue);
        } else if (ticketType.equals("Discount")){
            revenue = totalSeats * 5.00;
            System.out.printf("%.2f", revenue);
        }
    }
}

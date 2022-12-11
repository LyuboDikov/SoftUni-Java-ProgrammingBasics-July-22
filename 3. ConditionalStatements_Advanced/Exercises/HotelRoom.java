package ConditionalStatements_Advanced.Exercises;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());

        double studioPricePerDay = 0.0;
        double apartmentPricePerDay = 0.0;

        switch (month){
            case "May":
            case "October":
                studioPricePerDay = 50;
                apartmentPricePerDay = 65;
                if (days > 7 && days < 14){
                    studioPricePerDay = studioPricePerDay - (studioPricePerDay * 0.05);
                } else if (days > 14) {
                    studioPricePerDay = studioPricePerDay - (studioPricePerDay * 0.30);
                    apartmentPricePerDay = apartmentPricePerDay - (apartmentPricePerDay * 0.10);
                }
                break;
            case "June":
            case "September":
                studioPricePerDay = 75.20;
                apartmentPricePerDay = 68.70;
                if (days > 14) {
                    studioPricePerDay = studioPricePerDay - (studioPricePerDay * 0.20);
                    apartmentPricePerDay = apartmentPricePerDay - (apartmentPricePerDay * 0.10);
                }
                break;
            case "July":
            case "August":
                studioPricePerDay = 76;
                apartmentPricePerDay = 77;
                if (days > 14) {
                    apartmentPricePerDay = apartmentPricePerDay - (apartmentPricePerDay * 0.10);
                }
                break;
        }
        System.out.printf("Apartment: %.2f lv.\n", apartmentPricePerDay * days);
        System.out.printf("Studio: %.2f lv.", studioPricePerDay * days);
    }
}

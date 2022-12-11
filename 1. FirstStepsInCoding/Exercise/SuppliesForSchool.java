package FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int cleaner = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        // Pens - 5.80 per packet;
        // Markers - 7.20 per packet;
        // Cleaner - 1.20 per litre;

        double pensPrice = pens * 5.80;
        double markersPrice = markers * 7.20;
        double cleanerPrice = cleaner * 1.20;

        double totalSum = pensPrice + markersPrice + cleanerPrice;
        double discountedPrice = totalSum - (totalSum * discount / 100);

        System.out.println(discountedPrice);
    }
}

package ConditionalStatements_Advanced.Exercises;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String review = scanner.nextLine();
        int evenings = days - 1;
        double totalPrice = 0.0;

        switch (roomType){
            case "room for one person":
                if (review.equals("positive")){
                    totalPrice = (evenings * 18.00) + ((evenings * 18.00) * 0.25);
                } else if (review.equals("negative")){
                    totalPrice = (evenings * 18.00) - ((evenings * 18.00) * 0.10);
                }
                break;
            case "apartment":
                if (evenings < 10){
                    totalPrice = (evenings * 25.00) - ((evenings * 25.00) * 0.30);
                } else if (evenings <= 15) {
                    totalPrice = (evenings * 25.00) - ((evenings * 25.00) * 0.35);
                } else {
                 totalPrice = (evenings * 25.00) - ((evenings * 25.00) * 0.50);
                } if (review.equals("positive")){
                    totalPrice = totalPrice + (totalPrice * 0.25);
            } else if (review.equals("negative")){
                    totalPrice = totalPrice - (totalPrice * 0.10);
            }
                break;
            case "president apartment":
                if (evenings < 10){
                    totalPrice = (evenings * 35.00) - ((evenings * 35.00) * 0.10);
                } else if (evenings <= 15) {
                    totalPrice = (evenings * 35.00) - ((evenings * 35.00) * 0.15);
                } else {
                    totalPrice = (evenings * 35.00) - ((evenings * 35.00) * 0.20);
                } if (review.equals("positive")){
                totalPrice = totalPrice + (totalPrice * 0.25);
            } else if (review.equals("negative")){
                totalPrice = totalPrice - (totalPrice * 0.10);
            }
        }
        System.out.printf("%.2f", totalPrice);
    }
}

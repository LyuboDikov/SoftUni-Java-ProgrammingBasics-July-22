package ConditionalStatements_Advanced.Exercises;

import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMin = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMin = Integer.parseInt(scanner.nextLine());

        int examTime = examHour * 60 + examMin;
        int arrivalTime = arrivalHour * 60 + arrivalMin;

        String output = "";
        String status = "";

        if (arrivalTime < examTime - 30) { //early
            status = "Early";
            int difference = examTime - arrivalTime;
            if (difference < 60) {
                output = String.format("%d minutes before the start", difference);
            } else {
                int h = difference / 60;
                int m = difference % 60;
                output = String.format("%d:%02d hours before the start", h, m);
            }
        } else if (arrivalTime <= examTime) {
            status = "On Time";
            int difference = examTime - arrivalTime;
            output = String.format("%d minutes before the start", difference);
        } else {
            status = "Late";
            int difference = arrivalTime - examTime;
            if (difference < 60) {
                    output = String.format("%d minutes after the start", difference);
                } else {
                    int h = difference / 60;
                    int m = difference % 60;
                    output = String.format("%d:%02d hours after the start", h, m);
                }
            }
        System.out.println(status);
        System.out.println(output);
    }
}

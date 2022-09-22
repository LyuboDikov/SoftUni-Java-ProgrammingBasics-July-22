package FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class VacationBookList {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int pages = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int totalTime = pages / pagesPerHour;
        int hoursPerDay = totalTime / days;

        System.out.println(hoursPerDay);
    }
}

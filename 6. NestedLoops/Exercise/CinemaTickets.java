package Nested_Loops_Exercise;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Входът е поредица от цели числа и текст:
        //•	На първия ред до получаване на командата "Finish" - име на филма – текст
        //•	На втори ред – свободните места в салона за всяка прожекция – цяло число [1 … 100]
        //•	За всеки филм, се чете по един ред до изчерпване на свободните места в залата или до получаване на командата "End":
        //o	Типа на закупения билет - текст ("student", "standard", "kid")


        int studentCounter = 0;
        int standardCounter = 0;
        int kidsCounter = 0;
        int totalSeats = 0;
        String movieName = "";
        boolean isFull = false;
        int totalStudentTickets = 0;
        int totalStandardTickets = 0;
        int totalKidsTickets = 0;
        int totalTickets = 0;


        //-movie name
        String input = scanner.nextLine();
        while (!input.equals("Finish")) {

            int freeSeats = Integer.parseInt(scanner.nextLine());
            movieName = input;
            String type = scanner.nextLine();
            while (!type.equals("End")) {
                switch (type){
                    case "student":
                        studentCounter++;
                        totalTickets++;
                        totalStudentTickets++;
                        break;
                    case "standard":
                        standardCounter++;
                        totalTickets++;
                        totalStandardTickets++;
                        break;
                    case "kid":
                        kidsCounter++;
                        totalTickets++;
                        totalKidsTickets++;
                        break;
                }
                totalSeats = studentCounter + standardCounter + kidsCounter;
                if (totalSeats >= freeSeats){
                    isFull = true;
                    break;
                }
                type = scanner.nextLine();
            }
            double percentageFull = totalSeats * 1.0 / freeSeats * 100;
            System.out.printf("%s - %.2f%% full.\n", movieName, percentageFull);

            standardCounter = 0;
            studentCounter = 0;
            kidsCounter = 0;
            input = scanner.nextLine();
        }
        System.out.printf("Total tickets: %d\n", totalTickets);
        System.out.printf("%.2f%% student tickets.\n", totalStudentTickets * 1.0 / totalTickets * 100);
        System.out.printf("%.2f%% standard tickets.\n", totalStandardTickets * 1.0 / totalTickets * 100);
        System.out.printf("%.2f%% kids tickets.", totalKidsTickets * 1.0 / totalTickets * 100);
    }
}


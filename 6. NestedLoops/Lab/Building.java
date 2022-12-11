package Nested_Loops_Lab;

import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int floorsCount = Integer.parseInt(scanner.nextLine());
        int roomsCount = Integer.parseInt(scanner.nextLine());

        for (int floor = floorsCount; floor >= 1 ; floor--) {
            for (int rooms = 0; rooms <= roomsCount - 1; rooms++) {
                if (floor == floorsCount){
                    System.out.printf("L%d%d ", floor, rooms);
                } else if (floor % 2 == 0) {
                    System.out.printf("O%d%d ", floor, rooms);
                } else {
                    System.out.printf("A%d%d ", floor, rooms);
                }
            }
            System.out.println();
        }
    }
}

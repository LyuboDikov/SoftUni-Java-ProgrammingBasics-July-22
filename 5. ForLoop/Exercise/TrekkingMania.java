package ForLoop.Exercise;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupsCount = Integer.parseInt(scanner.nextLine());
        int totalPeople = 0;

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;


        for (int i = 0; i < groupsCount; i++) {
            int peopleInGroup = Integer.parseInt(scanner.nextLine());
            totalPeople += peopleInGroup;

            if (peopleInGroup <= 5) {
                p1 += peopleInGroup;
            } else if (peopleInGroup <= 12) {
                p2 += peopleInGroup;
            } else if (peopleInGroup <= 25) {
                p3 += peopleInGroup;
            } else if (peopleInGroup <= 40) {
                p4 += peopleInGroup;
            } else {
                p5 += peopleInGroup;
            }

        }
        System.out.printf("%.2f%%\n", p1 * 1.0 / totalPeople * 100);
        System.out.printf("%.2f%%\n", p2 * 1.0 / totalPeople * 100);
        System.out.printf("%.2f%%\n", p3 * 1.0 / totalPeople * 100);
        System.out.printf("%.2f%%\n", p4 * 1.0 / totalPeople * 100);
        System.out.printf("%.2f%%\n", p5 * 1.0 / totalPeople * 100);
    }
}
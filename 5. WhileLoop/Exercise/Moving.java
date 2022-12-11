package WhileLoop.Exercise;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int freeSpace = width * length * height;
        boolean isFull = false;

        String input = scanner.nextLine();

        while (!input.equals("Done")) {
            int boxes = Integer.parseInt(input);
            freeSpace -= boxes;

            if (freeSpace <= 0){
                isFull = true;
                break;
            }
            input = scanner.nextLine();
        }
        if (isFull){
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(freeSpace));
        } else {
            System.out.printf("%d Cubic meters left.", Math.abs(freeSpace));
        }
    }
}

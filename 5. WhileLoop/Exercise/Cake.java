package WhileLoop.Exercise;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cakeWidth = Integer.parseInt(scanner.nextLine());
        int cakeLength = Integer.parseInt(scanner.nextLine());

        int pieces = cakeLength * cakeWidth;
        boolean isFinished = false;

        String input = scanner.nextLine();

        while (!input.equals("STOP")){
            int piecesTaken = Integer.parseInt(input);
            pieces -= piecesTaken;

            if (pieces <= 0){
                isFinished = true;
                break;
            }
            input = scanner.nextLine();
        }
        if (isFinished){
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(pieces));
        } else {
            System.out.printf("%d pieces are left.", Math.abs(pieces));
        }
    }
}

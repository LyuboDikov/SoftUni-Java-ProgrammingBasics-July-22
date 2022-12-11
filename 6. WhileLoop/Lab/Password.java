package WhileLoop.Lab;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String password = scanner.nextLine();
        String enteredPassword = scanner.nextLine();

        while (!enteredPassword.equals(password)) {
            enteredPassword = scanner.nextLine();
        }
        System.out.println("Welcome " + name + "!");
    }
}

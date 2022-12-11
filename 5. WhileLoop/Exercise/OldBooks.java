package WhileLoop.Exercise;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String searchedBook = scanner.nextLine();

        String currentBook = scanner.nextLine();

        int counter = 0;
        boolean isFound = false;

        while (!currentBook.equals("No More Books")) {
            if (currentBook.equals(searchedBook)){
                isFound = true;
                break;
            }
            counter++;
            currentBook = scanner.nextLine();
        }
        if (isFound){
            System.out.printf("You checked %d books and found it.", counter);
        } else {
            System.out.printf("The book you search is not here!\n" + "You checked %d books.", counter);
        }
    }
}

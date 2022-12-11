package Nested_Loops_Lab;

public class MultiplicationTable {
    public static void main(String[] args) {

        for (int num1 = 1; num1 <= 10; num1++) {
            for (int num2 = 1; num2 <= 10; num2++) {
                System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
            }
        }
    }
}

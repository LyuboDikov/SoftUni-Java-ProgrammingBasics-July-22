package Nested_Loops_Exercise;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine()); //броя на жури

        String command = scanner.nextLine();

        double allGradesSum = 0;
        int countAllGrades = 0;
        while (!command.equals("Finish")) {
            String presentation = command;

            double sumCurrentGrades = 0;
            for (int i = 1; i <= n; i++) { //колкото ни е журито, толкова оценки трябва да прочетем
                double currentGrade = Double.parseDouble(scanner.nextLine());//прочитам оценка за презентацията от всеки член на журито
                countAllGrades++;
                sumCurrentGrades += currentGrade;
            }
            allGradesSum = allGradesSum + sumCurrentGrades; // събирам оценките от всички презентации
            double avgCurrentGrade = sumCurrentGrades / n;

            System.out.printf("%s - %.2f.%n", presentation, avgCurrentGrade);

            command = scanner.nextLine();
        }
        double finalGrade = allGradesSum / countAllGrades;

        System.out.printf("Student's final assessment is %.2f.", finalGrade);
    }
}


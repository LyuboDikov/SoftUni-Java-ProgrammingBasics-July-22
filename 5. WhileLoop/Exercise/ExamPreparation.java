package WhileLoop.Exercise;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int failedLimit = Integer.parseInt(scanner.nextLine());

        int failCount = 0;
        int solvedProblems = 0;
        double gradesSum = 0.0;
        String lastProblem = "";
        boolean isFailed = true;

        while (failCount < failedLimit) {
           String problemName = scanner.nextLine();
            if ("Enough".equals(problemName)){
                isFailed = false;
                break;
            }
            int grade = Integer.parseInt(scanner.nextLine());
            if (grade <= 4){
                failCount++;
            }
            gradesSum += grade;
            solvedProblems++;
            lastProblem = problemName;
        }
        if (isFailed){
            System.out.printf("You need a break, %d poor grades.", failCount);
        } else {
            System.out.printf("Average score: %.2f\n", gradesSum / solvedProblems);
            System.out.printf("Number of problems: %d\n", solvedProblems);
            System.out.printf("Last problem: %s", lastProblem);
        }
    }
}

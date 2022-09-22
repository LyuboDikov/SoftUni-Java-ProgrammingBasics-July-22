package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class ProjectCreation_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String architectName = scanner.nextLine();
        int projectsCount = Integer.parseInt(scanner.nextLine());
        int hoursToComplete = projectsCount * 3;

        System.out.printf("The architect %s will need %d hours to complete %d project/s.",
                architectName, hoursToComplete, projectsCount);
    }
}

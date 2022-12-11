package ConditionalStatements_Advanced.Exercises;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        double cost = 0.0;

        //Бюджета определя дестинацията, а сезона определя колко от бюджета ще изхарчи. Ако е лято ще почива на къмпинг, а зимата в хотел.
        // Ако е в Европа, независимо от сезона ще почива в хотел. Всеки къмпинг или хотел, според дестинацията,
        // има собствена цена която отговаря на даден процент от бюджета:

        //•	При 100лв. или по-малко – някъде в България
        //o	Лято – 30% от бюджета
        //o	Зима – 70% от бюджета

        //•	При 1000лв. или по малко – някъде на Балканите
        //o	Лято – 40% от бюджета
        //o	Зима – 80% от бюджета

        //•	При повече от 1000лв. – някъде из Европа
        //o	При пътуване из Европа, независимо от сезона ще похарчи 90% от бюджета.

        switch (season){
            case "summer":
                if (budget <= 100){
                    cost = budget * 0.30;
                    System.out.println("Somewhere in Bulgaria");
                    System.out.printf("Camp - %.2f", cost);
                } else if (budget <= 1000){
                    cost = budget * 0.40;
                    System.out.println("Somewhere in Balkans");
                    System.out.printf("Camp - %.2f", cost);
                } else {
                    cost = budget * 0.90;
                    System.out.println("Somewhere in Europe");
                    System.out.printf("Hotel - %.2f", cost);
                }
                break;
            case "winter":
                if (budget <= 100){
                    cost = budget * 0.70;
                    System.out.println("Somewhere in Bulgaria");
                    System.out.printf("Hotel - %.2f", cost);
                } else if (budget <= 1000){
                    cost = budget * 0.80;
                    System.out.println("Somewhere in Balkans");
                    System.out.printf("Hotel - %.2f", cost);
                } else {
                    cost = budget * 0.90;
                    System.out.println("Somewhere in Europe");
                    System.out.printf("Hotel - %.2f", cost);
                }
                break;
        }
    }
}

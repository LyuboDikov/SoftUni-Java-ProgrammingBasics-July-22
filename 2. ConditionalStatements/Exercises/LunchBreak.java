package ConditionalStatements.Exercises;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //По време на обедната почивка искате да изгледате епизод от своя любим сериал.
        // Вашата задача е да напишете програма, с която ще разберете дали имате достатъчно време да изгледате епизода.
        // По време на почивката отделяте време за обяд и време за отдих. Времето за обяд ще бъде 1/8 от времето за почивка,
        // а времето за отдих ще бъде 1/4 от времето за почивка.

        //1.	Име на сериал – текст
        //2.	Продължителност на епизод  – цяло число в диапазона [10… 90]
        //3.	Продължителност на почивката  – цяло число в диапазона [10… 120]

        String series = scanner.nextLine();
        int episodeTime = Integer.parseInt(scanner.nextLine());
        int breakTime = Integer.parseInt(scanner.nextLine());

        double lunchBreak = breakTime / 8.0;
        double restTime = breakTime / 4.0;

        double timeNeeded = episodeTime + lunchBreak + restTime;

        if (breakTime >= timeNeeded){
            double timeLeft = Math.ceil(breakTime - timeNeeded);
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", series, timeLeft);
        } else{
            double notEnoughTime = Math.ceil(timeNeeded - breakTime);
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", series, notEnoughTime);
        }



    }
}

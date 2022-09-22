package FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //За рождения си ден Любомир получил аквариум с формата на паралелепипед. Първоначално прочитаме от конзолата на отделни редове размерите му –
        // дължина, широчина и височина в сантиметри. Трябва да се пресметне колко литра вода ще събира аквариума,
        // ако се знае, че определен процент от вместимостта му е заета от пясък, растения, нагревател и помпа.
        //Един литър вода се равнява на един кубичен дециметър/ 1л=1 дм3/.
        //Да се напише програма, която изчислява литрите вода, която са необходими за напълването на аквариума

        int tankLong = Integer.parseInt(scanner.nextLine());
        int tankWidth = Integer.parseInt(scanner.nextLine());
        int tankHeight = Integer.parseInt(scanner.nextLine());
        double usedPercent = Double.parseDouble(scanner.nextLine());

        int tankVolumeCm = tankLong * tankWidth * tankHeight;
        double volumeInLitres = tankVolumeCm * 0.001;
        double usedSpace = usedPercent / 100;

        double totalWaterNeeded = volumeInLitres * (1 - usedSpace);

        System.out.println(totalWaterNeeded);
    }
}

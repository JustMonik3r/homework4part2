// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Задача 1
        int monthlySavings = 15000;
        int totalSavings = 0;
        int month = 0;
        while (totalSavings <= 2459000) {
            totalSavings = totalSavings + monthlySavings;
            month = month + 1;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + totalSavings);
        }
        System.out.println("Нам потребовалось " + month + " месяцев, чтобы скопить " + totalSavings + " рублей");
        System.out.println();

        //Задача 2
        int i = 0;
        while (i < 10) {
            i = i + 1;
            System.out.print(i + " ");
        }
        System.out.println();
        for (int j = 10; j >= 1; j--) {
            System.out.print(j + " ");
        }
        System.out.println();

        //Задача 3
        int year = 0;
        int population = 12000000;
        int birthRate = (population / 1000) * 17;
        int deathRate = (population / 1000) * 8;
        while (year < 10) {
            year = year + 1;
            population = population + birthRate - deathRate;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
        System.out.println();

        //Задача 4
        int initialDeposit = 15000;
        int depositWithInterest = 0;
        int k = 0;
        while (depositWithInterest < 12_000_000) {
            depositWithInterest = depositWithInterest + ((depositWithInterest/100) * 7);
            depositWithInterest = depositWithInterest + initialDeposit;
            k = k + 1;
            System.out.println("Месяц " + k + ". Сумма вклада составляет " + depositWithInterest);
        }
        System.out.println();

        //Задача 5
        int initialDeposit2 = 15000;
        int depositWithInterest2 = 0;
        int k2 = 0;
        while (depositWithInterest2 < 12_000_000) {
            depositWithInterest2 = depositWithInterest2 + ((depositWithInterest2/100) * 7);
            depositWithInterest2 = depositWithInterest2 + initialDeposit2;
            k2 = k2 + 1;
            if (k2 % 6 == 0) {
                System.out.println("Месяц " + k2 + ". Сумма вклада составляет " + depositWithInterest2);
            }
        }
        System.out.println();

        //Задача 6
        int initialDeposit3 = 15000;
        int depositWithInterest3 = 0;
        int k3 = 1;
        for (; k3 <= 108; k3++) {
            depositWithInterest3 = depositWithInterest3 + ((depositWithInterest3/100) * 7);
            depositWithInterest3 = depositWithInterest3 + initialDeposit3;
            if (k3 % 6 == 0) {
                System.out.println("Месяц " + k3 + ". Сумма вклада составляет " + depositWithInterest3);
            }
        }
        System.out.println();

        //Задача 7
        int friday = 7;
        int currentDay = 0;
        while (currentDay < 31) {
            currentDay = currentDay + 1;
            if (currentDay - friday == 0 || (currentDay - friday) % 7 == 0) {
                System.out.println("Сегодня пятница, " + currentDay + "-е число. Необходимо подготовить отчет.");
            }
        }
        System.out.println();

        //Задача 8
        int year2 = 0;
        int cometOrbitPeriod = 79;
        int calculationStarts = 1823;
        int calculationEnds = 2123;
        while (year2 < calculationEnds) {
            year2 = year2 + 1;
            if (year2 >= calculationStarts && year2 % cometOrbitPeriod == 0) {
                System.out.println(year2);
            }
        }
    }
}
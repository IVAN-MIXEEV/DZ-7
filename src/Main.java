public class Main {
    public static void main(String[] args) {
//№1
        int salary = 15000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            total = total + salary;
            i = i + 1;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total);
        }
//№2
        int y = 1;
        int max = 10;
        while (y <= max) {
            System.out.print(y + "  ");
            y = y + 1;
        }
        System.out.println();
        for (int x = 10; x > 0; x = x - 1) {
            System.out.print(x + "  ");
        }
//№3
        int totalPeople = 12_000_000;
        int mortality = 17;
        int fertility = 8;
        int yearNow = 2025;
        for (int year = yearNow; year < yearNow + 10; year++) {
            totalPeople += totalPeople * mortality / 1000 - totalPeople * fertility / 1000;
            System.out.println();
            System.out.println("Год " + year + ", численность населения составляет " + totalPeople);
        }
//№4
        int month = 1;
        int total1 = 0;
        int salary1 = 15000;
        int max1 = 12_000_000;
        while (total1 < max1) {
            total1 += total1 / 100 * 7;
            total1 += salary1;
            System.out.println("Месяц " + month++ + " сумма равна " + total1);
        }
//№5
        int salary2 = 15_000;
        int total2 = 0;
        int month1 = 1;
        for (; total2 <= 12_000_000; month1++) {
            total2 += total2 / 100 * 7;
            total2 += salary2;
            if (month1 % 6 == 0) {
                System.out.println("Месяц " + month1 + " сумма равна " + total2);
            }
        }
//№6
        int salary3 = 15000;
        int total3 = 0;
        int year = 9;
        int monthsInYear = 12;
        for (int month2 = 1; month2 <= year * monthsInYear; month2++) {
            total3 += total3 / 100 * 7;
            total3 += salary3;
            if (month2 % 6 == 0) {
                System.out.println("Месяц " + month2 + " сумма равна " + total3);
            }
        }
//№7
        int firstFriday = 3;
        int daysMouth = 31;
        int friday = firstFriday;
        int week = 7;
        while (friday <= daysMouth) {
            System.out.println("Сегодня пятница," + friday + "-е число. Необходимо подготовить отчет");
            friday += week;
        }
//№8
        int spanKamets = 79;
        int startDate = 200;
        int finalDate = 100;
        int currentYear = 2023;
        int pastBecentenary = currentYear - startDate;
        for (int year1 = 0; year1 <= currentYear + finalDate; year1 = year1 + spanKamets) {
            if (year1 >= pastBecentenary) {
                System.out.println(year1);
                if (year1 > currentYear) {
                    break;
                }
            }
        }
    }
}
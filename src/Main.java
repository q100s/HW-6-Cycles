public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
        task11();
        task11();
        task12();
        task13();
        task14();
        task15();
        task16();
        task17();
        task18();
    }
    public static void task1() {
        System.out.println("Task 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void task2() {
        System.out.println("Task 2");
        for (int n = 10; n >= 1; n = n - 1) {
            System.out.println(n);
        }
    }

    public static void task3() {
        System.out.println("Task 3");
        for (int l = 0; l <= 16; l = l + 2) {
            System.out.println(l);
        }
    }

    public static void task4() {
        System.out.println("Task 4");
        for (int t = 10; t >= -10; t = t - 1) {
            System.out.println(t);
        }
    }

    public static void task5() {
        System.out.println("Task 5");
        for (int y = 1904; y <= 2096; y = y + 4) {
            System.out.println(y + "th is leap year");
        }
    }

    public static void task6() {
        System.out.println("Task 6");
        for (int s = 7; s <= 98; s = s + 7) {
            System.out.print(s + " ");
        }
        System.out.println(" ");
    }

    public static void task7() {
        System.out.println("Task 7");
        for (int m = 1; m <= 512; m = m * 2) {
            System.out.print(m + " ");
        }
        System.out.println(" ");
    }

    public static void task8() {
        System.out.println("Task 8");
        int save = 29000;
        int total = 0;
        for (int x = 1; x <= 12; x++) {
            total = total + save;
            System.out.println("In the " + x + "th month the sum of saving is " + total);
        }
    }

    public static void task9() {
        System.out.println("Task 9");
        int newSave = 29000;
        int newTotal = 0;
        for (int x = 1; x <= 12; x++) {
            newTotal = newTotal + newTotal / 100;
            newTotal = newTotal + newSave;
            System.out.println("In the " + x + "th month the sum of saving is " + newTotal);
        }
    }

    public static void task10() {
        System.out.println("Task 10");
        int multiplier = 2;
        int product;
        for (int z = 1; z <= 10; z++) {
            product = multiplier * z;
            System.out.println(multiplier + "*" + z + "=" + product);
        }
    }

    public static void task11() {
        System.out.println("Task 11"); //The second lesson is starting here
        int sum = 0;
        int saving = 15_000;
        int month = 0;
        while (sum < 2_459_000) {
            sum = sum + saving;
            month = month + 1;
            System.out.println("In the " + month + "th month saving is " + sum + " rubles");
        }
    }

    public static void task12() {
        System.out.println("Task 12");
        int i = 0;
        while (i < 10) {
            i = i + 1;
            System.out.print(i + " ");
        }
        System.out.println();
        int l = 11;
        for (; l > 1; ) {
            l = l - 1;
            System.out.print(l + " ");
        }
        System.out.println();
    }

    public static void task13() {
        System.out.println("Task 13");
        int population = 12_000_000;
        int birtRateForThousand = 17;
        int mortalityForThousand = 8;
        int year = 0;
        while (year < 10) {
            year = year + 1;
            int birthRateOfCountry = population / 1000 * birtRateForThousand;
            int mortalityOfCountry = population / 1000 * mortalityForThousand;
            population = population + birthRateOfCountry - mortalityOfCountry;
            System.out.println("Population in the " + year + "th year is " + population + " units");
        }
    }

    public static void task14() {
        System.out.println("Task 16");
        double money = 15_000;
        double improve = 0.07;
        int month = 0;
        while (money < 12_000_000) {
            month = month + 1;
            money = money + money * improve;
            System.out.println("In the " + month + "th month saving is " + money + " rubles");
        }
    }

    public static void task15() {
        System.out.println("Task 15");
        double money = 15_000;
        double improve = 0.07;
        int month = 0;
        while (money < 12_000_000) {
            month = month + 1;
            money = money + money * improve;
            if (month % 6 == 0 || money >= 12_000_000) {
                System.out.println("In the " + month + "th month saving is " + money + " rubles");
            }
        }
    }
    public static void task16() {
        System.out.println("Task 16");
        double money = 15_000;
        double improve = 0.07;
        int month = 0;
        int montA9Years = 12 * 9;
        while (month < montA9Years) {
            month = month + 1;
            money = money + money * improve;
            if (month % 6 == 0 ) {
                System.out.println("In the " + month + "th month saving is " + money + " rubles");
            }
        }
    }
    public static void task17() {
        System.out.println("Task 17");
        int firstFridayInMonth = 3;
        int day = 0;
        int daysInMonth = 31;
        do {
            day = day + 1;
            if (day == firstFridayInMonth || (day + firstFridayInMonth) % 7 == 0 && day + firstFridayInMonth != 7) {
                System.out.println("It's the " + day + "th, Friday. Everyone needs to prepare a report!");
            }
        }
        while (day < daysInMonth);
    }
    public static void task18() {
        System.out.println("Task 18");
        int year = 0;
        int nowadays = 2023;
        do {
            year = year + 79;
            if (year >= nowadays - 200 && year <= nowadays + 100) {
                System.out.println(year);
            }
        }
        while (year < nowadays + 100);
    }
}
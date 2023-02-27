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
        newTotal = newTotal + newTotal/100;
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
}
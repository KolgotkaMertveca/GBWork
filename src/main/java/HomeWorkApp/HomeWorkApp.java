package HomeWorkApp;

public class HomeWorkApp {
    public static void main(String[] args) {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
        checkSumSign();
        printColor ();
        compareNumbers ();
    }
    public static void checkSumSign () {
        int a = -10;
        int b = 7;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor () {
        int value = 104;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0 &&  value < 100) {
            System.out.println("Оранжевый");
        }
        if (value > 100) {
            System.out.println("Желтый");
        }
    }
    public static void compareNumbers () {
        int a = 1;
        int b = 7;
        if (a >= b) {
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
    }
}

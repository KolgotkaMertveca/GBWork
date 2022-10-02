package Lesson2;

public class Main {
    public static void main(String[] args) {
        Sum(11,24);
        Num(0);
        Num2(0);
        Str("*", 6);

    }
    public static boolean Sum (int a, int b) {
        if (a+b > 10 && a+b < 20) {
            System.out.println(true);
            return true;
        }
        else {
            System.out.println(false);
            return false;
        }
    }
    public static void Num (int c) {
        if (c >=0) {
            System.out.println("Число положительное");
        }
        else {
            System.out.println("Число отрицательное");
        }
    }
    public static boolean Num2 (int d) {
        if (d < 0) {
            System.out.println(true);
            return true;
        }
        else {
            System.out.println(false);
            return false;

        }
    }
    public static void Str (String a, int b) {
        for (int i = 0; i < b; i++) {
            System.out.print(a);
        }
    }
}

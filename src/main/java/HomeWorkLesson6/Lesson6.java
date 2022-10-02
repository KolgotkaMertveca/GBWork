package HomeWorkLesson6;

public class Lesson6 {
    String name;
    int age;
    String color;
    public Lesson6(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
    public void print () {
        System.out.println("[" + name + ", " + age + ", " + color + "]");
    }
    public void run (int distance) {
        System.out.println(name + " бежит" + distance + " метров");
    }
    public void swim (int distance) {
        System.out.println(name + " плывет" + distance + "метров");
    }
}

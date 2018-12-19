package clonable;

public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.setColor("red");
        apple.setTaste("good");
        Apple apple1 = null;
        try {
            apple1 = (Apple) apple.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        Apple apple2 = new Apple();
        apple2.setColor("red");
        apple2.setTaste("good");

        boolean check1 = apple == apple1;
        boolean check2 = apple1 == apple2;

        System.out.println("Porownanie1: " + check1);
        System.out.println("Porownanie2: " + check2);

        show(apple, apple1, apple2);

        apple1.setColor("green");
        apple2.setTaste("terrible");
        show(apple,apple1,apple2);
    }

    public static void show(Apple apple, Apple apple1, Apple apple2) {
        printApple(apple, 1);
        printApple(apple1, 2);
        printApple(apple2, 3);
        System.out.println();
    }

    public static void printApple(Apple apple, int number) {
        System.out.println("Jablko " + number + " kolor:" + apple.getColor()
                + " ; smak:" + apple.getTaste());
    }
}

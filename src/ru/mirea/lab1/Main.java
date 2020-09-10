package ru.mirea.lab1;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Dog FirstDog = new Dog();
        System.out.println(FirstDog.toString());
        Ball FirstBall = new Ball(25, "Red");
        System.out.println(FirstBall.toString());
        Book FirstBook = new Book(115);
        System.out.println(FirstBook.toString());
        Book SecondBook = new Book(89);
        System.out.println(SecondBook.toString());
    }
}

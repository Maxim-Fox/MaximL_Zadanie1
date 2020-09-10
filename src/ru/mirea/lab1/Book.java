package ru.mirea.lab1;

public class Book {
    int page;
    public Book (int tmp){
        page = tmp;
    }

    @Override
    public String toString() {
        return "Book{" +
                "page=" + page +
                '}';
    }
}

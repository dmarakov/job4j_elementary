package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book idiot = new Book("Idiot", 1000);
        Book demon = new Book("Demon", 250);
        Book cleanCOde = new Book("Clean Code", 150);
        Book evgeniyOnegin = new Book("Evgeniy Onegin", 200);
        Book[] books = new Book[4];
        books[0] = idiot;
        books[1] = demon;
        books[2] = cleanCOde;
        books[3] = evgeniyOnegin;
        System.out.println("Содержимое массива до перестановки");
        for (int i = 0; i < books.length; i++) {
            System.out.println("Книга " + books[i].getTitle() + ". Страниц: " + books[i].getNumberOfPages());
        }
        System.out.println("Содержимое массива после перестановки");
        Book temp = books[0];
        books[0] = books[2];
        books[2] = temp;
        for (int i = 0; i < books.length; i++) {
            System.out.println("Книга " + books[i].getTitle() + ". Страниц: " + books[i].getNumberOfPages());
        }
        System.out.println("Книги с именем Clean Code");
        for (int i = 0; i < books.length; i++) {
            if ("Clean Code".equals(books[i].getTitle())) {
                System.out.println("Книга " + books[i].getTitle() + ". Страниц: " + books[i].getNumberOfPages());
            }
        }
    }
}

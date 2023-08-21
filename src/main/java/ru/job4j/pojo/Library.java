package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Java", (short) 400);
        Book book2 = new Book("Javascript", (short) 300);
        Book book3 = new Book("Python", (short) 200);
        Book book4 = new Book("Clean code", (short) 100);
        Book[] books = {book1, book2, book3, book4};

        for (int i = 0; i < books.length; i++) {
            System.out.println(i + ": " + books[i].getName() + " " + books[i].getQuantityOfPages());
        }

        Book temp = books[0];
        books[0] = books[1];
        books[1] = temp;

        for (Book book : books) {
            if ("Clean code".equals(book.getName())) {
                System.out.println(book.getName() + " " + book.getQuantityOfPages());
            }
        }

    }
}

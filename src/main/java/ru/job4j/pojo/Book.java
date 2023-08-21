package ru.job4j.pojo;

public class Book {
    private String name;
    private short quantityOfPages;

    public Book(String name, short quantityOfPages) {
        this.name = name;
        this.quantityOfPages = quantityOfPages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getQuantityOfPages() {
        return quantityOfPages;
    }

    public void setQuantityOfPages(short quantityOfPages) {
        this.quantityOfPages = quantityOfPages;
    }
}

package ru.mirea.lab4;

public class Book implements Priceable {
    String name;
    String author;
    int year;
    Book(String name, String author, int year){
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public void print() {
        System.out.printf("Книга '%s' (автор %s) была издана в %d году
                \n", name, author, year);
    }
    Book b1 = new Book("Отцы и Дети", "И.С.Тургенев", 1861);
    b1.print();
}

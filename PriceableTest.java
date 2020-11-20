package ru.mirea.lab4;

import java.awt.print.Printable;

public class PriceableTest {
    Printable printable = new Book("Война и мир", "Л. Н. Толстой",
            1863);
    printable.print();
    printable = new Journal("Модерн");
    printable.print();

    public static void main(String[] args) {

        Printable printable = createPrintable("Компьютера",false);
        printable.print();

        read(new Book("Отцы и дети", "И. Тургенев", 1862));
        read(new Journal("Модерн"));
    }
    static void read(Printable p){

        p.print();
    }

    static Printable createPrintable(String name, boolean option){

        if(option)
            return new Book(name, "Неизвестен", 2010);
        else
            return new Journal(name);
}

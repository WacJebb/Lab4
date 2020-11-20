package ru.mirea.lab4;

public class Journal implements Priceable {
    private String name;

    String getName(){
        return name;
    }
    Journal(String name){

        this.name = name;
    }
    public void print() {
        System.out.printf("Журнал '%s'\n", name);
    }
}

package ru.job4j.oop;

public class Cat {
    private String food;
    private String name;

    public void show() {
        System.out.println("There is " + this.name + "'s " + this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void giveName(String nick) {
        this.name = nick;
    }

    public static void main(String[] args) {

        Cat gav = new Cat();
        gav.eat("kotleta");
        gav.giveName("gav");
        gav.show();
        Cat black = new Cat();
        black.eat("fish");
        black.giveName("black");
        black.show();
    }
}

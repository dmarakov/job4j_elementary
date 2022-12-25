package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        String[] names = new String[4];
        float[] prices = new float[40];
        names[0] = "Ivan Ivanov";
        names[1] = "Petr Petrov";
        names[2] = "Alexander Danilov";
        names[3] = "Egor Egorov";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
        System.out.println(ages.length);
        System.out.println(surnames.length);
        System.out.println(prices.length);
    }
}

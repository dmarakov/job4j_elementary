package ru.job4j.ooa;

final public class Airbus extends Aircraft {
    private static final int COUNT_ENGINE = 2;

    private String name;

    public Airbus(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void printModel() {
        System.out.println("Модель самолета: " + name);
    }

    public void printCountEngine() {
        int a380CountEngine = 4;
        System.out.println("Количество двигателей равно: " + ("A380".equals(name) ? a380CountEngine : COUNT_ENGINE));
    }

    @Override
    public String toString() {
        return "Airbus{"
                + "name='" + name + '\''
                + '}';
    }
}
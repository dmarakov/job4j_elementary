package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Едем");
    }

    @Override
    public void passanger(int number) {
        System.out.println("Число пассажиров: " + number);

    }

    @Override
    public double reFuel(double amount) {
        System.out.println("Вы заправили: " + amount);
        return 2.5 * amount;
    }
}

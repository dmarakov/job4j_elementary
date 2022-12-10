package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(120);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("120 rubles are " + dollar + " dollar.");
        float inForEuro = 140;
        float expectedForEuro = 2;
        float outForEuro = Converter.rubleToEuro(inForEuro);
        boolean passedForEuro = expectedForEuro == outForEuro;
        System.out.println("140 rubles are 2. Test result : " + passedForEuro);
        float inForDollars = 120;
        float expectedForDollars = 2;
        float outForDollars = Converter.rubleToDollar(inForDollars);
        boolean passedForDollars = expectedForDollars == outForDollars;
        System.out.println("120 rubles are 2. Test result : " + passedForDollars);
    }
}

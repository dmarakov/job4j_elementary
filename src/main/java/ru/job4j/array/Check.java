package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (boolean index : data) {
            if (index != data[0]) {
                result = false;
                break;
            }
        }
        return result;
    }
}

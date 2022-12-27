package ru.job4j.array;

public class RollBackArray {
    public static int[] rollback(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int lastIndex = array.length - 1;
            int currentIndex = lastIndex - i;
            result[i] = array[currentIndex];
        }
        return result;
    }
}
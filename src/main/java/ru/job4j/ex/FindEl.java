package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (key.equals(value[i])) {
                rsl = i;
                break;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("Такого элемента нет в массиве");
        }
        return rsl;
    }

    public static void main(String[] args) {
        try {
            System.out.println(FindEl.indexOf(new String[]{"Hi", "I", "am", "test"}, "qwert"));
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}

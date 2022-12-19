package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (isValid(x1) && isValid(y1) && isValid(x2) && isValid(y2)) {
            if (Math.abs(x2 - x1) == Math.abs(y2 - y1)) {
                rsl = Math.abs(x1 - x2);
            } else {
                rsl = 0;
            }
        }
        return rsl;

    }

    public static boolean isValid(int cordinate) {
        return cordinate >= 0 && cordinate <= 7;
    }
}

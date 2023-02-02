package ru.job4j.early;

public class PasswordValidator {

    public static String validate(String password) {

        if (password == null) {
            throw new IllegalArgumentException("Password can't be null");
        }
        if (password.length() < 8 || password.length() > 32) {
            throw new IllegalArgumentException("Password should be length [8, 32]");
        }
        if (!isNumber(password)) {
            throw new IllegalArgumentException("Password should contain at least one figure");
        }

        if (!isCapital(password)) {
            throw new IllegalArgumentException("Password should contain at least one uppercase letter");
        }

        if (!isLowerCase(password)) {
            throw new IllegalArgumentException("Password should contain at least one lowercase letter");
        }

        if (!isSpecialSymbol(password)) {
            throw new IllegalArgumentException("Password should contain at least one special symbol");
        }

        if (password.toLowerCase().contains("qwerty") || password.contains("12345") || password.toLowerCase().contains("password") || password.toLowerCase().contains("admin") || password.toLowerCase().contains("user")) {
            throw new IllegalArgumentException("Password shouldn't contain substrings: qwerty, 12345, password, admin, user");
        }
        return password;

    }

    public static boolean isNumber(String password) {
        boolean numberFlag = false;
        char[] chars = password.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isDigit(chars[i])) {
                numberFlag = true;
            }
        }
        return numberFlag;
    }

    public static boolean isCapital(String password) {
        boolean capitalFlag = false;
        char[] chars = password.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i])) {
                capitalFlag = true;
            }
        }
        return capitalFlag;
    }

    public static boolean isLowerCase(String password) {
        boolean lowerCaseFlag = false;
        char[] chars = password.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isLowerCase(chars[i])) {
                lowerCaseFlag = true;
            }
        }
        return lowerCaseFlag;
    }

    public static boolean isSpecialSymbol(String password) {
        boolean specialFlag = false;
        char[] chars = password.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (!Character.isLetterOrDigit(chars[i])) {
                specialFlag = true;
            }
        }
        return specialFlag;
    }

}
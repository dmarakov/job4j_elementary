package ru.job4j.early;

public class PasswordValidator {
    private static final String[] NOT_VALID_STRINGS = {"qwerty", "12345", "password", "admin", "user"};

    public static String validate(String password) {
        if (password == null) {
            throw new IllegalArgumentException("Password can't be null");
        }
        if (password.length() < 8 || password.length() > 32) {
            throw new IllegalArgumentException("Password should be length [8, 32]");
        }
        char[] chars = password.toCharArray();
        boolean numberFlag = false, capitalFlag = false, lowerCaseFlag = false, specialFlag = false;
        for (int i = 0; i < chars.length; i++) {
            if (Character.isDigit(chars[i])) {
                numberFlag = true;
            } else if (Character.isLowerCase(chars[i])) {
                lowerCaseFlag = true;
            } else if (Character.isUpperCase(chars[i])) {
                capitalFlag = true;
            } else if (!Character.isLetterOrDigit(chars[i])) {
                specialFlag = true;
            }
        }
        if (!numberFlag) {
            throw new IllegalArgumentException("Password should contain at least one figure");
        }
        if (!capitalFlag) {
            throw new IllegalArgumentException("Password should contain at least one uppercase letter");
        }
        if (!lowerCaseFlag) {
            throw new IllegalArgumentException("Password should contain at least one lowercase letter");
        }
        if (!specialFlag) {
            throw new IllegalArgumentException("Password should contain at least one special symbol");
        }
        for (String string : NOT_VALID_STRINGS) {
            if (password.toLowerCase().contains(string)) {
                throw new IllegalArgumentException("Password shouldn't contain substrings: qwerty, 12345, password, admin, user");
            }
        }
        return password;
    }
}
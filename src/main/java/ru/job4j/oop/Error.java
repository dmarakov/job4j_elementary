package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {

    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Наличие ошибки: " + active);
        System.out.println("Код ошибки: " + status);
        System.out.println("Сообщение об ошибке: " + message);
    }

    public static void main(String[] args) {
        Error error = new Error();
        error.printInfo();
        Error error2 = new Error(true, 404, "Page not found");
        error2.printInfo();
    }
}

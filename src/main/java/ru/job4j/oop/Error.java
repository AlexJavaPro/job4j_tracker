package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    public String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    @Override
    public String toString() {
        return "active=" + active
                + ", status=" + status
                + ", message='" + message;
    }

    public static void main(String[] args) {
        Error error = new Error();
        Error error500 = new Error(false, 500, "Что то пошло не так на сервере");
        Error error404 = new Error(true, 404, "Страница не найдена");

        System.out.println(error);
        System.out.println(error500);
        System.out.println(error404);
    }
}

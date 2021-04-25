package ru.netology.exception;

public class NotFoundException extends RuntimeException {
    private String message;


    public NotFoundException(String message) {
        this.message = message;
    }

    public NotFoundException(String message, String message1) {
        super(message);
        this.message = message1;
    }

    public NotFoundException(String message, Throwable cause, String message1) {
        super(message, cause);
        this.message = message1;
    }

    public NotFoundException(Throwable cause, String message) {
        super(cause);
        this.message = message;
    }

    public NotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, String message1) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.message = message1;
    }

    @Override
    public String getMessage() {
        return message;
    }
}

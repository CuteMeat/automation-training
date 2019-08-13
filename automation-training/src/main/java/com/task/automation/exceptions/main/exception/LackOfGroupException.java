package com.task.automation.exceptions.main.exception;

public class LackOfGroupException extends Exception{
    public LackOfGroupException() {
    }

    public LackOfGroupException(String message) {
        super(message);
    }

    public LackOfGroupException(String message, Throwable cause) {
        super(message, cause);
    }

    public LackOfGroupException(Throwable cause) {
        super(cause);
    }

    public LackOfGroupException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

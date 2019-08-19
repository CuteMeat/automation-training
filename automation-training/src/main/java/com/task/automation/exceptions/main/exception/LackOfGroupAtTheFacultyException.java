package com.task.automation.exceptions.main.exception;

public class LackOfGroupAtTheFacultyException extends Exception{
    public LackOfGroupAtTheFacultyException() {
    }

    public LackOfGroupAtTheFacultyException(String message) {
        super(message);
    }

    public LackOfGroupAtTheFacultyException(String message, Throwable cause) {
        super(message, cause);
    }

    public LackOfGroupAtTheFacultyException(Throwable cause) {
        super(cause);
    }

    public LackOfGroupAtTheFacultyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

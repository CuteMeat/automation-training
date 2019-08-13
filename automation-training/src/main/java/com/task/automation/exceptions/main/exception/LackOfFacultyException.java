package com.task.automation.exceptions.main.exception;

public class LackOfFacultyException extends Exception {
    public LackOfFacultyException() {
    }

    public LackOfFacultyException(String message) {
        super(message);
    }

    public LackOfFacultyException(String message, Throwable cause) {
        super(message, cause);
    }

    public LackOfFacultyException(Throwable cause) {
        super(cause);
    }

    public LackOfFacultyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

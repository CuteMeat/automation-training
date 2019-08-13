package com.task.automation.exceptions.main.exception;

public class LackOfStudentsInTheGroupException extends Exception{
    public LackOfStudentsInTheGroupException() {
    }

    public LackOfStudentsInTheGroupException(String message) {
        super(message);
    }

    public LackOfStudentsInTheGroupException(String message, Throwable cause) {
        super(message, cause);
    }

    public LackOfStudentsInTheGroupException(Throwable cause) {
        super(cause);
    }

    public LackOfStudentsInTheGroupException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

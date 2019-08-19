package com.task.automation.exceptions.main.exception;

public class LackOfDisciplineOnTheStudentException extends Exception {
    public LackOfDisciplineOnTheStudentException() {
    }

    public LackOfDisciplineOnTheStudentException(String message) {
        super(message);
    }

    public LackOfDisciplineOnTheStudentException(String message, Throwable cause) {
        super(message, cause);
    }

    public LackOfDisciplineOnTheStudentException(Throwable cause) {
        super(cause);
    }

    public LackOfDisciplineOnTheStudentException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

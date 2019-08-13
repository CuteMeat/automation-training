package com.task.automation.exceptions.main.exception;

public class LackOfDisciplineException extends Exception {
    public LackOfDisciplineException() {
    }

    public LackOfDisciplineException(String message) {
        super(message);
    }

    public LackOfDisciplineException(String message, Throwable cause) {
        super(message, cause);
    }

    public LackOfDisciplineException(Throwable cause) {
        super(cause);
    }

    public LackOfDisciplineException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

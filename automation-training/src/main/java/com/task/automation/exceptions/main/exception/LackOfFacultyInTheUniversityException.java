package com.task.automation.exceptions.main.exception;

public class LackOfFacultyInTheUniversityException extends Exception {
    public LackOfFacultyInTheUniversityException() {
    }

    public LackOfFacultyInTheUniversityException(String message) {
        super(message);
    }

    public LackOfFacultyInTheUniversityException(String message, Throwable cause) {
        super(message, cause);
    }

    public LackOfFacultyInTheUniversityException(Throwable cause) {
        super(cause);
    }

    public LackOfFacultyInTheUniversityException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

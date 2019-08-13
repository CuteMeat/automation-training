package com.task.automation.exceptions.main.exception;

public class OutOfRangeOfAcceptableMarkValuesException extends Exception {
    public OutOfRangeOfAcceptableMarkValuesException() {
    }

    public OutOfRangeOfAcceptableMarkValuesException(String message) {
        super(message);
    }

    public OutOfRangeOfAcceptableMarkValuesException(String message, Throwable cause) {
        super(message, cause);
    }

    public OutOfRangeOfAcceptableMarkValuesException(Throwable cause) {
        super(cause);
    }

    public OutOfRangeOfAcceptableMarkValuesException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

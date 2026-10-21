package com.bootcamp.smarthome.exception;

/** Base checked exception for smart home command failures. */
public class HomeAutomationException extends Exception {
    public HomeAutomationException(String message) {
        super(message);
    }

    public HomeAutomationException(String message, Throwable cause) {
        super(message, cause);
    }
}

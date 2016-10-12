package com.shmouradko.airline.exception;

/**
 * Created by Сергей on 12.10.2016.
 */
public class WrongDataException extends Exception {
    public WrongDataException() {
    }

    public WrongDataException(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongDataException(String message) {
        super(message);
    }

    public WrongDataException(Throwable cause) {
        super(cause);
    }
}
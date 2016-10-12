package com.shmouradko.airline.exception;

/**
 * Created by Сергей on 12.10.2016.
 */
public class EmptyFileException extends Exception {
    public EmptyFileException() {
    }

    public EmptyFileException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmptyFileException(String message) {
        super(message);
    }

    public EmptyFileException(Throwable cause) {
        super(cause);
    }
}
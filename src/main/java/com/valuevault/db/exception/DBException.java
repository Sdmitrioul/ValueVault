package com.valuevault.db.exception;

import java.io.IOException;

public class DBException extends IOException {
    public DBException(final String message) {
        super(message);
    }
    
    public DBException(final String message, final Throwable cause) {
        super(message, cause);
    }
}

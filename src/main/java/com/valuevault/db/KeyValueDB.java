package com.valuevault.db;

import java.io.Closeable;

public interface KeyValueDB extends Closeable {
    void open();
    
    void close();
}

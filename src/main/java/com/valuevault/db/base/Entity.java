package com.valuevault.db.base;

import java.util.List;

public interface Entity {
    List<String> getColumns();
    
    byte[] getColumnValue(String name);
}

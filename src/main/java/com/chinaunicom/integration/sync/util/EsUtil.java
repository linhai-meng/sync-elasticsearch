package com.chinaunicom.integration.sync.util;

import java.util.Map;

public interface EsUtil {
    void connect();

    void close();

    Map<String,Object> find(Map<String,Object> esSearch);
}

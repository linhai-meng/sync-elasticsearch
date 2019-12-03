package com.chinaunicom.integration.sync.util;

import com.chinaunicom.integration.sync.dao.HbaseDao;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Component
public interface HbaseUtil {
    void connect();

    Map<String,Object> put(HbaseDao hbaseDao);

    List<Map<String,Object>> putRangeByTime(Date startTime,Date endTime, HbaseDao hbaseDao);
}

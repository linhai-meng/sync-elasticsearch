package com.chinaunicom.integration.sync.dao;

public class HbaseDao {
    private final String tableName;
    private final String rowkey;
    private final String cf;
    private final String column;
    private final String value;

    public HbaseDao(String tableName, String rowkey, String cf, String column, String value) {
        this.tableName = tableName;
        this.rowkey = rowkey;
        this.cf = cf;
        this.column = column;
        this.value = value;
    }

    public String getTableName() {
        return tableName;
    }

    public String getRowkey() {
        return rowkey;
    }

    public String getCf() {
        return cf;
    }

    public String getColumn() {
        return column;
    }

    public String getValue() {
        return value;
    }
}

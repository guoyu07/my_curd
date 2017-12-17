package com.hxkj.common.util.code_generator;


import java.util.List;

/**
 * 数据库 表
 */
public class Table {

    //表 名字
    private String tableName;

    //表 名字 驼峰
    private String tableNameCamel;

    //表 名字 驼峰 首字母大写
    private String tableNameCamelFirstUp;

    //表 的 备注
    private String tableComment;

    // 表主键名字
    private List<String> tablePrimaryKeys;

    //表 的 列集合
    private List<Column> columnList;

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getTableNameCamel() {
        return tableNameCamel;
    }

    public void setTableNameCamel(String tableNameCamel) {
        this.tableNameCamel = tableNameCamel;
    }

    public String getTableNameCamelFirstUp() {
        return tableNameCamelFirstUp;
    }

    public void setTableNameCamelFirstUp(String tableNameCamelFirstUp) {
        this.tableNameCamelFirstUp = tableNameCamelFirstUp;
    }

    public String getTableComment() {
        return tableComment;
    }

    public void setTableComment(String tableComment) {
        this.tableComment = tableComment;
    }

    public List<String> getTablePrimaryKeys() {
        return tablePrimaryKeys;
    }

    public void setTablePrimaryKeys(List<String> tablePrimaryKeys) {
        this.tablePrimaryKeys = tablePrimaryKeys;
    }

    public List<Column> getColumnList() {
        return columnList;
    }

    public void setColumnList(List<Column> columnList) {
        this.columnList = columnList;
    }
}

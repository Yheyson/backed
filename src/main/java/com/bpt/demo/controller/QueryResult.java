package com.bpt.demo.controller;
import java.util.List;
public class QueryResult {

    public int getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(int totalRecords) {
        this.totalRecords = totalRecords;
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    private int totalRecords;
    protected List<Object> list;
}

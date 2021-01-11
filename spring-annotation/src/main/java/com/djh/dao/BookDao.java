package com.djh.dao;

import org.springframework.stereotype.Repository;

/**
 * @Author AceDJH
 * @Date 2021/1/4 18:12
 */
@Repository
public class BookDao {
    private String label = "1";

    public String getLabel() {
        return label;
    }

    public BookDao setLabel(String label) {
        this.label = label;
        return this;
    }

    @Override
    public String toString() {
        return "BookDao{" +
                "label='" + label + '\'' +
                '}';
    }
}

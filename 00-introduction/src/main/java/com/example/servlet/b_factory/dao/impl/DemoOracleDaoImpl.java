package com.example.servlet.b_factory.dao.impl;

import com.example.servlet.b_factory.dao.DemoDao;

import java.util.Arrays;
import java.util.List;

public class DemoOracleDaoImpl implements DemoDao {
    @Override
    public List<String> findAll() {
        return Arrays.asList("111", "222", "333");
    }
}

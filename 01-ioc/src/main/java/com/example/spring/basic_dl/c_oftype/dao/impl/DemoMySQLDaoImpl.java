package com.example.spring.basic_dl.c_oftype.dao.impl;

import com.example.spring.basic_dl.c_oftype.dao.DemoDao;

import java.util.Arrays;
import java.util.List;

public class DemoMySQLDaoImpl implements DemoDao {
    @Override
    public List<String> findAll() {
        return Arrays.asList("aaa", "bbb", "ccc");
    }
}

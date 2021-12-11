package com.example.servlet.c_reflect.service.impl;

import com.example.servlet.c_reflect.dao.DemoDao;
import com.example.servlet.c_reflect.factory.BeanFactory;
import com.example.servlet.c_reflect.service.DemoService;

import java.util.List;

public class DemoServiceImpl implements DemoService {

    private DemoDao demoDao = BeanFactory.getDemoDao();

    @Override
    public List<String> findAll() {
        return demoDao.findAll();
    }
}

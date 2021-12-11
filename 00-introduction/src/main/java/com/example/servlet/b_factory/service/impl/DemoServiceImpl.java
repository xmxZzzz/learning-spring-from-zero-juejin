package com.example.servlet.b_factory.service.impl;

import com.example.servlet.b_factory.dao.DemoDao;
import com.example.servlet.b_factory.factory.BeanFactory;
import com.example.servlet.b_factory.service.DemoService;

import java.util.List;

public class DemoServiceImpl implements DemoService {

    private DemoDao demoDao = BeanFactory.getDemoDao();

    @Override
    public List<String> findAll() {
        return demoDao.findAll();
    }
}

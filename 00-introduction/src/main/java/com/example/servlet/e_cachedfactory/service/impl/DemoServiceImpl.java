package com.example.servlet.e_cachedfactory.service.impl;

import com.example.servlet.e_cachedfactory.dao.DemoDao;
import com.example.servlet.e_cachedfactory.factory.BeanFactory;
import com.example.servlet.e_cachedfactory.service.DemoService;

import java.util.List;

public class DemoServiceImpl implements DemoService {

    private DemoDao demoDao = (DemoDao) BeanFactory.getBean("demoDao");

    public DemoServiceImpl() {
        //创建了多个不同的DemoDao对象
        for (int i = 0; i < 10; i++) {
            System.out.println(BeanFactory.getBean("demoDao"));
        }
    }

    @Override
    public List<String> findAll() {
        return demoDao.findAll();
    }
}

package com.example.servlet.b_factory.factory;

import com.example.servlet.b_factory.dao.DemoDao;
import com.example.servlet.b_factory.dao.impl.DemoOracleDaoImpl;

/**
 * @Package: com.example.spring.b_factory.factory
 * @ClassName: BeanFactory
 * @Author: guoyy
 * @Description: 使用静态工厂模式，通过手动切换返回的实例实现DemoDao
 * 问题：当缺失文件时，编译都不无法通过
 * 本质：强耦合
 * @Date: 2021/12/11 下午8:21
 * @Version: 1.0
 */
public class BeanFactory {
    public static DemoDao getDemoDao() {

//        return new DemoDaoImpl();

        return new DemoOracleDaoImpl();
    }
}

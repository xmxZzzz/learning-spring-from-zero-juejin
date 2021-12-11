package com.example.servlet.c_reflect.factory;

import com.example.servlet.c_reflect.dao.DemoDao;

/**
 * @Package: com.example.spring.c_reflect.factory
 * @ClassName: BeanFactory
 * @Author: guoyy
 * @Description: 通过反射，指定类文件的路径，实现低耦合，解决了当文件不存在时的编译不通过问题
 * 问题：当类初始化时，依旧会报错
 * @Date: 2021/12/11 下午8:24
 * @Version: 1.0
 */
public class BeanFactory {
    public static DemoDao getDemoDao() {

        try {
            Class<?> clz = Class.forName("com.example.servlet.c_reflect.dao.impl.DemoOracleDaoImpl");
            return (DemoDao) clz.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("DemoDao instantiation error,cause: " + e.getMessage());
        }
    }
}

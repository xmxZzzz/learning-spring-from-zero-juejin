package com.example.servlet.d_properties.factory;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

/**
 * @Package: com.example.spring.d_properties.factory
 * @ClassName: BeanFactory
 * @Author: guoyy
 * @Description: 通过配置文件存储类的全路径，解决频繁编译和硬编码的问题
 * 可改进点：每次返回的实例都不一样
 * @Date: 2021/12/11 下午8:41
 * @Version: 1.0
 */
public class BeanFactory {

    private static Properties properties;

    /**
     * 使用静态代码块实现在初始化时就读取配置文件
     */
    static {
        properties = new Properties();
        try {
            //必须使用类加载器读取resources目录下的配置文件
            properties.load(BeanFactory.class.getClassLoader().getResourceAsStream("factory.properties"));
        } catch (IOException e) {
            throw new ExceptionInInitializerError("BeanFactory initialize error, cause: " + e.getMessage());
        }

    }

    public static Object getBean(String beanName) {
        try {
            Class<?> clz = Class.forName(properties.getProperty(beanName));
            beanName = clz.getName();
            return clz.getDeclaredConstructor().newInstance();
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            throw new RuntimeException("BeanFactory have not [" + beanName + "] bean!", e);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException("[" + beanName + "] instantiation error", e);
        }

    }
}

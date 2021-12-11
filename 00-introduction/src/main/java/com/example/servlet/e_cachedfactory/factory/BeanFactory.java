package com.example.servlet.e_cachedfactory.factory;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @Package: com.example.spring.e_cachedfactory.factory
 * @ClassName: BeanFactory
 * @Author: guoyy
 * @Description: 使用HashMap+单例模式实现缓存，使得BeanFactory返回实例的唯一性
 * @Date: 2021/12/11 下午9:10
 * @Version: 1.0
 */
public class BeanFactory {

    private static Properties properties;

    private static Map<String, Object> beanMap = new HashMap<>();

    static {
        properties = new Properties();
        try {
            //必须使用类加载器读取resources目录下的配置文件
            properties.load(BeanFactory.class.getClassLoader().getResourceAsStream("factory1.properties"));
        } catch (IOException e) {
            throw new ExceptionInInitializerError("BeanFactory initialize error, cause: " + e.getMessage());
        }

    }

    /*
     * @Method getBean
     * @Version  1.0
     * @Description 使用双重检视实现单例模式，如果没有指定实例则创建，否则返回已有实例
     * @param beanName 指定的类名在配置文件factory.properites中key
     * @Return java.lang.Object 返回指定的实例
     * @Exception  ClassNotFoundException | NoSuchMethodException and IllegalAccessException | InstantiationException | InvocationTargetException
     * @Date 2021/12/11 下午9:03
     */
    public static Object getBean(String beanName) {
        //双重检视
        if (!beanMap.containsKey(beanName)) {
            synchronized (BeanFactory.class) {
                if (!beanMap.containsKey(beanName)) {
                    try {
                        Class<?> clz = Class.forName(properties.getProperty(beanName));
                        Object obj = clz.getDeclaredConstructor().newInstance();
                        beanMap.put(beanName, obj);
                    } catch (ClassNotFoundException | NoSuchMethodException e) {
                        throw new RuntimeException("BeanFactory have not [" + beanName + "] bean!", e);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
                        throw new RuntimeException("[" + beanName + "] instantiation error", e);
                    }
                }
            }
        }
        return beanMap.get(beanName);
    }
}

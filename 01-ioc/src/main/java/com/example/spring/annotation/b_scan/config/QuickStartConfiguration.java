package com.example.spring.annotation.b_scan.config;

import com.example.spring.annotation.b_scan.bean.Cat;
import com.example.spring.annotation.b_scan.bean.Person;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName QuickStartConfiguration
 * @Description 使用@Component标识配置类，使用@ComponentScan标识指定的扫描路径
 * @author 10195
 * @date 2021/12/16 11:00
 *
 */
@Configuration
@ComponentScan("com.example.spring.annotation.b_scan")
public class QuickStartConfiguration {

}

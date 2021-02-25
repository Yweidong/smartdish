package com.thought.monkey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @program: smartdish
 * @description:
 * @author: ywd
 * @contact:1371690483@qq.com
 * @create: 2021-02-25 15:50
 **/
@SpringBootApplication
@EntityScan("com.thought.monkey.domain")
@EnableJpaRepositories("com.thought.monkey.repository")
public class Application extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }



}

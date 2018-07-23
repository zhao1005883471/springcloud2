package com.springcloud2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 配置文件服务器
 */
@SpringBootApplication
@EnableConfigServer
public class Springcloud2Application {

    public static void main(String[] args) {
        SpringApplication.run(Springcloud2Application.class, args);
    }
}

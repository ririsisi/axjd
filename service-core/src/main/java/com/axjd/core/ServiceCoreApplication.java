package com.axjd.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Author: songxq
 * @Date: 2023/1/11
 * @Description: com.axjd.core
 * @Version: 1.0
 */
@SpringBootApplication
@ComponentScan({"com.axjd"})
@EnableSwagger2
public class ServiceCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceCoreApplication.class,args);
    }
}

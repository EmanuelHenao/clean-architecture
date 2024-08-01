package com.cleanarchitecture.cleanarchitecture;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

//disable temp database configuration
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@ComponentScan()
public class CleanArchitectureApplication {

    public static void main(String[] args) {
        SpringApplication.run(CleanArchitectureApplication.class, args);
    }

}

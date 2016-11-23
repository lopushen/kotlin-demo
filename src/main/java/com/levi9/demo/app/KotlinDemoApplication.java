package com.levi9.demo.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class KotlinDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(KotlinDemoApplication.class, args);
    }
}

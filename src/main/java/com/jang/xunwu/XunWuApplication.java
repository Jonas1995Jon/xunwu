package com.jang.xunwu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jang
 */
@SpringBootApplication
@RestController
public class XunWuApplication {

    public static void main(String[] args) {
        SpringApplication.run(XunWuApplication.class, args);
    }

}

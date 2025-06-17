package com.acme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "org.kie.kogito.dmn.**", "org.kie.kogito.app.**", "com.acme.**", "http**" })
public class BamoeSpringBootApplication {
    public static void main(String[] args) {
       SpringApplication.run(BamoeSpringBootApplication.class, args);
    }
}
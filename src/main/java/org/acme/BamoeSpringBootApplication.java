// Copyright IBM Corp. 2025.
package org.acme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "org.acme.**", "http**" })
public class BamoeSpringBootApplication {
    public static void main(String[] args) {
       SpringApplication.run(BamoeSpringBootApplication.class, args);
    }
}

/*
 * IBM Confidential
 * PID 5900-AR4
 * Copyright IBM Corp. 2026
 */

package org.acme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "org.kie.**", "org.acme.**", "org.drools.**", "org.jbpm.**", "com.ibm.bamoe.**", "http**" })
public class BamoeSpringBootApplication {
    public static void main(String[] args) {
       SpringApplication.run(BamoeSpringBootApplication.class, args);
    }
}

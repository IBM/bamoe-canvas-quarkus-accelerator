package org.acme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.ibm.bamoe.aiagenttask.springboot.config.AIAgentTaskConfig;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication(scanBasePackages = { "org.kie.**", "org.acme.**", "org.drools.**", "org.jbpm.**", "com.ibm.bamoe.**", "http**" })
@EnableConfigurationProperties(AIAgentTaskConfig.class)
public class BamoeSpringBootApplication {
    public static void main(String[] args) {
       SpringApplication.run(BamoeSpringBootApplication.class, args);
    }
}

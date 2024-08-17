package com.example.flow_assignment_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class FlowAssignmentServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlowAssignmentServerApplication.class, args);
    }

}

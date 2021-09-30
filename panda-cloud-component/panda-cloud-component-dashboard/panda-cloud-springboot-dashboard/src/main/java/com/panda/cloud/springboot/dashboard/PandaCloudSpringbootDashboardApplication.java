package com.panda.cloud.springboot.dashboard;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableAdminServer
@EnableDiscoveryClient
public class PandaCloudSpringbootDashboardApplication {

  public static void main(String[] args) {
    SpringApplication.run(PandaCloudSpringbootDashboardApplication.class, args);
  }
}

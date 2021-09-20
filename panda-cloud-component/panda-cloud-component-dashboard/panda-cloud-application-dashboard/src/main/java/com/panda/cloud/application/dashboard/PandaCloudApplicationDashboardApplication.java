package com.panda.cloud.application.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PandaCloudApplicationDashboardApplication {

  public static void main(String[] args) {
    ConfigurableApplicationContext applicationContext =
        SpringApplication.run(PandaCloudApplicationDashboardApplication.class, args);
    applicationContext.registerShutdownHook();
  }
}

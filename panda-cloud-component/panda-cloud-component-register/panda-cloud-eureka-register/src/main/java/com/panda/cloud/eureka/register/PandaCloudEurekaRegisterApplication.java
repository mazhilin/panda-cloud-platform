package com.panda.cloud.eureka.register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/** */
@SpringBootApplication
@EnableEurekaServer
public class PandaCloudEurekaRegisterApplication {

  public static void main(String[] args) {

    SpringApplication.run(PandaCloudEurekaRegisterApplication.class, args);
  }
}

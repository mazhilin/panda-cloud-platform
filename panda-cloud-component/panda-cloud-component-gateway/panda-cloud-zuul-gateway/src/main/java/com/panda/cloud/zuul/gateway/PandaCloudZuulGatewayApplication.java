package com.panda.cloud.zuul.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class PandaCloudZuulGatewayApplication {

  public static void main(String[] args) {
    SpringApplication.run(PandaCloudZuulGatewayApplication.class, args);
  }
}

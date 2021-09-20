package com.panda.cloud.zuul.gateway.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.netflix.zuul.filters.discovery.DiscoveryClientRouteLocator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;

/**
 * 封装GreeCloud项目PandaCloudZuulGatewayConfiguration类.<br>
 *
 * <p>//TODO.<br>
 *
 * @author Powered by marklin 2021-09-20 09:42
 * @version 1.0.0
 *     <p>Copyright © 2018-2021 Pivotal Cloud Technology Systems Incorporated. All rights reserved.
 *     <br>
 */
@Configuration
public class PandaCloudZuulGatewayConfiguration {
  protected final Logger logger = LoggerFactory.getLogger(this.getClass());

  @Autowired private ServerProperties serverProperties;

  @Autowired private DiscoveryClient discoveryClient;

  @Qualifier("eurekaRegistration")
  @Autowired private ServiceInstance serviceInstance;

  @Bean
  public DiscoveryClientRouteLocator discoveryClientRouteLocator() {
    return new DiscoveryClientRouteLocator(
        serverProperties.getServlet().getContextPath(), discoveryClient, null, serviceInstance);
  }

  @Bean
  public WebServerFactoryCustomizer<ConfigurableWebServerFactory> webServerFactoryCustomizer() {
    logger.info("enable error handler");
    return factory -> {
      ErrorPage errorPage400 = new ErrorPage(HttpStatus.BAD_REQUEST, "/err/400");
      ErrorPage errorPage404 = new ErrorPage(HttpStatus.NOT_FOUND, "/err/404");
      ErrorPage errorPage500 = new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, "/err/500");
      factory.addErrorPages(errorPage400, errorPage404, errorPage500);
    };
  }
}

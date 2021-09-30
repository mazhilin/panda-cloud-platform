package com.panda.cloud.springboot.dashboard.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;

/**
 * 封装GreeCloud项目SpringbootDashboard类.<br>
 *
 * <p>//TODO.<br>
 *
 * @author Powered by marklin 2021-09-30 14:41
 * @version 1.0.0
 *     <p>Copyright © 2018-2021 Pivotal Cloud Technology Systems Incorporated. All rights reserved.
 *     <br>
 */
@EnableWebSecurity
public class SpringbootDashboard extends WebSecurityConfigurerAdapter {

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    SavedRequestAwareAuthenticationSuccessHandler authenticationHandler =
        new SavedRequestAwareAuthenticationSuccessHandler();
    authenticationHandler.setTargetUrlParameter("redirectTo");
    authenticationHandler.setDefaultTargetUrl("/panda-cloud/springboot-dashbooard/");
    super.configure(http);
  }
}

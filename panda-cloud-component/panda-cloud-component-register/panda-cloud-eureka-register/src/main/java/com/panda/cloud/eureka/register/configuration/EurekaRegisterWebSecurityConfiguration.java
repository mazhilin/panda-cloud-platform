package com.panda.cloud.eureka.register.configuration;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * 封装GreeCloud项目EurekaRegisterWebSecurityConfiguration类.<br>
 *
 * <p>//TODO.<br>
 *
 * @author Powered by marklin 2021-09-20 16:59
 * @version 1.0.0
 *     <p>Copyright © 2018-2021 Pivotal Cloud Technology Systems Incorporated. All rights reserved.
 *     <br>
 */
@EnableWebSecurity
public class EurekaRegisterWebSecurityConfiguration extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().ignoringAntMatchers("/**");
        super.configure(http);
    }
}

package com.panda.cloud.common.swagger.annotation;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.lang.annotation.*;

/**
 * <p>封装GreeCloud项目EnablePandaCloudSwagger类.<br></p>
 * <p>//TODO.<br></p>
 *
 * @author Powered by marklin 2021-09-30 00:04
 * @version 1.0.0
 * <p>Copyright © 2018-2021 Pivotal Cloud Technology Systems Incorporated. All rights reserved.<br></p>
 */
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@EnableSwagger2
public @interface EnablePandaCloudSwagger {
}

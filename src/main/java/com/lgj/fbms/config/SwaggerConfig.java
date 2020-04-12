package com.lgj.fbms.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author ：LGJ
 * @date ：Created in 2020/4/12 10:23
 * @description：swagger配置类
 * @modified By：
 * @version: 1.0
 */

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket docket(Environment environment) {
        Profiles profiles=Profiles.of("prod");
        boolean isEnable=environment.acceptsProfiles(profiles);
        return new Docket(DocumentationType.SWAGGER_2).enable(!isEnable)
                .select().apis(RequestHandlerSelectors.basePackage("com.lgj.fbms.controller")).build();
    }

}

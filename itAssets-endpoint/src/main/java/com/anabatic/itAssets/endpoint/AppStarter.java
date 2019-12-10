package com.anabatic.itAssets.endpoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * !place your description here!
 *
 * @author yeshwantk (&copy;25-Jul-2019)
 */

@ComponentScan(basePackages = { "com.anabatic.itAssets.endpoint.controller" })
@EntityScan(basePackages = { "com.anabatic.itAssets.persistence.model" })
@ImportResource({ "classpath*:applicationContext-Services.xml",
        "classpath*:applicationContext-Persistence.xml",
        "classpath*:applicationContext-Endpoint.xml" })
@SpringBootApplication(exclude={SecurityAutoConfiguration.class})
public class AppStarter extends SpringBootServletInitializer{
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(AppStarter.class);
    }
    
    public static void main(String[] args) {
        SpringApplication.run(AppStarter.class, args);
    }
}

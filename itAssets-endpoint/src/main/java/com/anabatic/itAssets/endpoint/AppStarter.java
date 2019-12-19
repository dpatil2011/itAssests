package com.anabatic.itAssets.endpoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.anabatic.generic.endpoint.controlleradvice.GenericControllerAdvice;

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
@Import({GenericControllerAdvice.class})
public class AppStarter extends SpringBootServletInitializer{
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(AppStarter.class);
    }
    
    public static void main(String[] args) {
        SpringApplication.run(AppStarter.class, args);
    }
//    @Bean
//    public WebMvcConfigurer corsConfigurer() {
//       return new WebMvcConfigurerAdapter() {
//          @Override
//          public void addCorsMappings(CorsRegistry registry) {
//             registry.addMapping("/itserv").allowedOrigins("http://192.168.0.150:8080");
//          }
//       };
//    }
}

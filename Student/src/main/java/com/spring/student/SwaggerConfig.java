package com.spring.student;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;


@Configuration
@EnableWebMvc
@OpenAPIDefinition(info = @io.swagger.v3.oas.annotations.info
.Info(title = "Student Service", version = "1.0", description = "API documentation"))
public class SwaggerConfig implements WebMvcConfigurer{
	
	

}

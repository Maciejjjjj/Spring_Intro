package pl.Maciejjjjj.spring.mvc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan(basePackages = "pl.Maciejjjjj.spring.mvc.web")
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {



}

package pl.Maciejjjjj.spring.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.Maciejjjjj.spring.core.warmup.HelloWorld;

@Configuration
public class WarmUpConfiguration {

    @Bean
    public HelloWorld helloBean() {

        return new HelloWorld();
    }

}

package org.olympiad;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfiguration {
    @Bean
    public User getUser(){
        return new User();
    }
}

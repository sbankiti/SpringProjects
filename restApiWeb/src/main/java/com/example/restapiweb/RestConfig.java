package com.example.restapiweb;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.*;

@Configuration
@PropertySource("application-dev.properties")
public class RestConfig {

    @Bean("newemp")
    //@Profile("dev")
    @Primary
    @ConditionalOnProperty(prefix = "data", name = "name", havingValue = "dataname")
    public Employee newEmployee(){
        return  new Employee("Santhosh");
    }

    @Bean("oldemp")
    public Employee oldEmployee(){
        return new Employee("Ajay");    }

}

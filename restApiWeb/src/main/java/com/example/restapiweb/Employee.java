package com.example.restapiweb;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Data
@RequiredArgsConstructor// ArgsConstructor
@ConfigurationProperties(prefix = "data")
public class Employee {

    public final String empname;
    public String name;
    public int number;

    @Value("${message}")
    public String msg;

}

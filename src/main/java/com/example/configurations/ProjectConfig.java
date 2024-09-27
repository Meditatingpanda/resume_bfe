package com.example.configurations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.example.beans", "com.example.implementations", "com.example.types"})
public class ProjectConfig {

}

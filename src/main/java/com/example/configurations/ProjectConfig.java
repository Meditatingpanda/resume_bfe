package com.example.configurations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"com.example.beans", "com.example.implementations", "com.example.types","com.example.aspects"})
public class ProjectConfig {

}

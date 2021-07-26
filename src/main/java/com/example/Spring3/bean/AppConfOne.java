package com.example.Spring3.bean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan(basePackages =" com.example.Spring3.bean") // inorder to scan the values from package
@PropertySource("classpath:application.properties")
public class AppConfOne {
}

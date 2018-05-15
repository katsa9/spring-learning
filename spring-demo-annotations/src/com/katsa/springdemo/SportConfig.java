package com.katsa.springdemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //causes this to be the config file for the spring container
@ComponentScan("com.katsa.springdemo") // sets up component scanning (Autowired)
public class SportConfig {

}

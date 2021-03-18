package com.aris.mardiyanto.myapp;

import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

//@EnableAutoConfiguration
@SpringBootApplication
public class MyappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyappApplication.class, args);
		
		/*ApplicationContext applicationContext = SpringApplication.run(MyappApplication.class, args);
		for (String beanName : applicationContext.getBeanDefinitionNames()) {
            System.out.println(beanName);
        }*/
	}

}

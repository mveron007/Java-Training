package com.curso.java.appIngresos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.curso.java.appIngresos.MyMain;
//import com.example.handlingformsubmission.HandlingFormSubmissionApplication;

@SpringBootApplication
public class MyMain extends SpringBootServletInitializer {
	public static void main(String[] args) {
        SpringApplication.run(MyMain.class, args);
    }
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
        return builder.sources(MyMain.class);
    }
}

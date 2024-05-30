package com.CourseManagementSystem.myappvs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
//import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.context.annotation.FilterType;
import com.CourseManagementSystem.myappvs.event.Eventrepo;
import com.CourseManagementSystem.myappvs.user.Userrepository;

@SpringBootApplication
@EnableMongoRepositories(basePackageClasses = Userrepository.class)
@EnableJpaRepositories(excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = Eventrepo.class))

@ComponentScan("com.CourseManagementSystem.myappvs")
public class CourseApp {

	public static void main(String[] args) {
		SpringApplication.run(CourseApp.class, args);
		System.out.println("Started...");
	}

}

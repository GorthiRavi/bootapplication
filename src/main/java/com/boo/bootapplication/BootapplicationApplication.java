package com.boo.bootapplication;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@ComponentScan(basePackages = {"com.test.outOfPackage","com.boo.bootapplication"})
@SpringBootApplication
public class BootapplicationApplication  extends SpringBootServletInitializer {
	private static Logger logger = LogManager.getLogger(BootapplicationApplication.class);

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(BootapplicationApplication.class);
	}
	public static void main(String[] args) {
		logger.debug("Starting MAin class");
		SpringApplication.run(BootapplicationApplication.class, args);
		logger.debug("Ending MAin class");
	}

	// setting global cross origin support for all controller from all clients
	@Bean
	public WebMvcConfigurer configurer(){
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/*").allowedOrigins("/*");
			}
		};
	}

}

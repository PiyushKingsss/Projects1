package com.mphasis.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

// web related configuration
@Configuration
@ComponentScan
public class WebConfig implements WebMvcConfigurer{

	@Bean
	public ViewResolver viewResolver() {
	InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
	        viewResolver.setViewClass(JstlView.class);
	        viewResolver.setPrefix("/WEB-INF/pages/");
	        viewResolver.setSuffix(".jsp");
	        return viewResolver;
	}
	/**Configure ResourceHandlers to serve static resources like CSS/ Javascript etc...*/
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
	registry.addResourceHandler("/assets/**").addResourceLocations("/assets/");
	      }

}

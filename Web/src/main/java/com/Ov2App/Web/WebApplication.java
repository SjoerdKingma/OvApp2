package com.Ov2App.Web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ResourceBundleMessageSource;

import java.util.Locale;


@SpringBootApplication
public class WebApplication {

	public static void main(String[] args) {

		Locale locale = new Locale("nl", "NL");
//		Locale locale = LocaleContextHolder.getLocale();
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		messageSource.setBasenames("bundle");
		messageSource.setDefaultEncoding("UTF-8");
		System.out.println(messageSource.getMessage("van", null, locale));
		SpringApplication.run(WebApplication.class, args);
	}



}

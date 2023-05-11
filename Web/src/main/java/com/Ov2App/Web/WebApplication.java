package com.Ov2App.Web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.ResourceBundle;

@SpringBootApplication
public class WebApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
		Locale locale_en = new Locale("en", "US");
		ResourceBundle resourceBundle = ResourceBundle.getBundle("bundle", locale_en);
		System.out.println(resourceBundle.getString("van"));
	}

}

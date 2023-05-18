package com.Ov2App.Web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;

import java.util.Locale;
import java.util.ResourceBundle;

@SpringBootApplication
public class WebApplication implements WebMvcConfigurer {

	private final LocaleChangeInterceptor localeChangeInterceptor;

	public WebApplication(LocaleChangeInterceptor localeChangeInterceptor) {
		this.localeChangeInterceptor = localeChangeInterceptor;
	}
    //to make sure this interceptor properly intercepts all incoming requests,
	// we add it to the Spring InterceptorRegistry.
	@Override
	public void addInterceptors(InterceptorRegistry interceptorRegistry) {
		interceptorRegistry.addInterceptor(localeChangeInterceptor);
	}

	public static void main(String[] args) {

		Locale locale = new Locale("nl", "NL");
		Locale locale1 = new Locale("en","US");
		ResourceBundle resourceBundle = ResourceBundle.getBundle("bundle", locale);
		System.out.println(resourceBundle.getString("van"));

//		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
//		messageSource.setBasenames("bundle");
//		messageSource.setDefaultEncoding("UTF-8");
//		System.out.println(messageSource.getMessage("van", null, Locale.ENGLISH));
		SpringApplication.run(WebApplication.class, args);
	}

}

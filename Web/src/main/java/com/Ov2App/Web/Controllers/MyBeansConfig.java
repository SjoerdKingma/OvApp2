package com.Ov2App.Web.Controllers;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;

import java.util.Locale;
import java.util.TimeZone;

@Configuration
public class MyBeansConfig {


    //LocaleResolver interface is implemented using Spring’s built-in CookieLocaleResolver implementation.
    // We also set the default locale and the timezone here.

    @Bean
    public LocaleResolver localeResolver() {
        CookieLocaleResolver localeResolver = new CookieLocaleResolver();
        localeResolver.setDefaultLocale(new Locale("nl","NL"));
        localeResolver.setDefaultTimeZone(TimeZone.getTimeZone("UTC"));

        return localeResolver;
    }

    //interceptor bean will intercept each request that the application receives, and eagerly check for
    // a localeData parameter on the HTTP request.
    // If found, the interceptor uses the localeResolver we coded earlier to register the locale it found as
    // the current user’s locale.
    @Bean
    public LocaleChangeInterceptor localeChangeInterceptor() {
        LocaleChangeInterceptor localeChangeInterceptor = new LocaleChangeInterceptor();
        localeChangeInterceptor.setParamName("localeData");
        return localeChangeInterceptor;
    }
}
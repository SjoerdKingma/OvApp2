package com.Ov2App.Web;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;

import java.net.URI;
import java.net.URISyntaxException;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class WebApplicationTests {

	URI uri;

	{
		try {
			uri = new URI("http://localhost:8080//index?lang=nl");
		} catch (URISyntaxException e) {
			throw new RuntimeException(e);
		}
	}


   @Test
	void getLocale() {
	   assertThat(uri).hasParameter("lang", "nl");
   }


   @ParameterizedTest
   @ValueSource(strings = {"nl", "en"})
	void changeLocale(String URIParameter){
	   LocaleChangeInterceptor localeChangeInterceptor = new LocaleChangeInterceptor();
	   localeChangeInterceptor.setParamName("lang");
	   assertThat(LocaleChangeInterceptor.DEFAULT_PARAM_NAME.contains(URIParameter));

   }

	@Test
	void contextLoads() {
	}


}

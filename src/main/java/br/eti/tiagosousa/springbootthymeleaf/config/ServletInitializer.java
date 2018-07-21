package br.eti.tiagosousa.springbootthymeleaf.config;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import br.eti.tiagosousa.springbootthymeleaf.SpringBootThymeleafApplication;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringBootThymeleafApplication.class);
	}
}
/**
 * 
 */
package com.america.rest.config;

import org.springframework.context.annotation.Configuration;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Bean;

import com.google.common.base.Predicate;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author americasanchez
 *
 */
@Configuration
@EnableSwagger2
public class SwagerConfig {
	
	@Bean
	public Docket usersApi() {

		return new Docket(DocumentationType.SWAGGER_2)
			.apiInfo(usersApiInfo()).select().paths(userPaths())
			.apis(RequestHandlerSelectors.any()).build()
			.useDefaultResponseMessages(false);

	}

	private ApiInfo usersApiInfo() {
		return new ApiInfo("Servicio Api Rest de America",
				"Servicio que permite listar coches asi como añadir modificar o eliminarlos",
				"0.1", "Terminos del servicio", 
				new Contact("America Sanchez Barreto", "", "vallebarreto@gmail.com"),
				"", "");
	}

	private Predicate<String> userPaths() {
		return regex("/api.*");
	}
	
	
}

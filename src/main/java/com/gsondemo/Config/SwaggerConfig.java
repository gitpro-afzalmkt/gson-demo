package com.gsondemo.Config;

import javax.annotation.Generated;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.google.common.base.Predicates;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-10-05T14:03:51.916-03:00")

@EnableSwagger2
@EnableWebMvc
public class SwaggerConfig implements WebMvcConfigurer{

	ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            .title("Gson CRUD Demo")
            .description("This is a crud app")
            .license("Google 2.0")
            .licenseUrl("http://www.google.org/licenses/LICENSE-2.0.html")
            .termsOfServiceUrl("")
            .version("23.6")
            .contact(new Contact("", "", "contact@contact.com.uy"))
            .build();
	}
	
	 @Bean
	  public Docket api() {
	    // @formatter:off
	    //Register the controllers to swagger
	    //Also it is configuring the Swagger Docket
	    return new Docket(DocumentationType.SWAGGER_2).select()
	        // .apis(RequestHandlerSelectors.any())
	        .apis(Predicates.not(RequestHandlerSelectors.basePackage("org.springframework.boot")))
	        // .paths(PathSelectors.any())
	        // .paths(PathSelectors.ant("/swagger2-demo"))
	        .build()
	        .apiInfo(apiInfo());
	    // @formatter:on
	  }
	 
	  @Override
	  public void addResourceHandlers(ResourceHandlerRegistry registry) 
	  {
	    //enabling swagger-ui part for visual documentation
	    registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
	    registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
	  }
	
}

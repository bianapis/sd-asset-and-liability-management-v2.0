/**
 * @author Virtusa
 */
package org.bian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
    @Bean
    public Docket serviceDomainApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("Bian")
                .select()
                .apis(RequestHandlerSelectors.basePackage("org.bian.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }
    
    private ApiInfo apiInfo() {
        ApiInfo apiInfo = new ApiInfo("Bian Service Operations", null, "v1", "Terms of service", null, null, null);
        return apiInfo;
    }
}

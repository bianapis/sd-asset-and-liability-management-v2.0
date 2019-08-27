/**
 * @author Virtusa
 */
package org.bian.impl.util;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

@Configuration
public class WebMvcConfig extends WebMvcConfigurationSupport {
	
    @Override
    public RequestMappingHandlerMapping requestMappingHandlerMapping() {
        return new BQRequestMappingHandlerMapping();
    }
    
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

           registry.addResourceHandler("swagger-ui.html")
                    .addResourceLocations("classpath:/META-INF/resources/");

            registry.addResourceHandler("/webjars/**")
                    .addResourceLocations("classpath:/META-INF/resources/webjars/");

    }
}
/**
 * @author Virtusa
 */
package org.bian.impl.util;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.bian.annotation.BQ;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.mvc.condition.PatternsRequestCondition;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

public class BQRequestMappingHandlerMapping extends RequestMappingHandlerMapping {

	public static final Logger LOGGER = LoggerFactory.getLogger(BQRequestMappingHandlerMapping.class);
    
    @Override
    protected RequestMappingInfo getMappingForMethod(Method method, Class<?> handlerType) {
        RequestMappingInfo info = super.getMappingForMethod(method, handlerType);
        if(info == null) return null;

        BQ bqMethodAnnotation = AnnotationUtils.findAnnotation(method, BQ.class);
        	Set<String> patterns = info.getPatternsCondition().getPatterns();
        	List<String> modifiedPatterns = new ArrayList<String>();
        	List<String> simplePatterns = new ArrayList<String>();
        	boolean isBqUrl = false;
        	
        	for(String pattern:patterns) {
        		if(pattern.contains("{behavioral-qualifier}")) {
        			if(bqMethodAnnotation != null) {
	            		modifiedPatterns.add(StringUtils.replace(pattern, "{behavioral-qualifier}", bqMethodAnnotation.value()));
	            		isBqUrl = true;
        			}
        		} else {
        			simplePatterns.add(pattern);
        		}
        	}
        	PatternsRequestCondition pattern;
        	if(isBqUrl) {
	        	pattern = new PatternsRequestCondition(modifiedPatterns.toArray(new String[modifiedPatterns.size()]));
	        	LOGGER.info("Identified url mapping(s) for " + method.getName() + " | " + modifiedPatterns);
        	} else {
	        	pattern = new PatternsRequestCondition(simplePatterns.toArray(new String[simplePatterns.size()]));
	        	LOGGER.info("Identified url mapping(s) for " + method.getName() + " | " + simplePatterns);
		}
		RequestMappingInfo newInfo = new RequestMappingInfo(info.getName(), pattern, info.getMethodsCondition(),
				info.getParamsCondition(), info.getHeadersCondition(), info.getConsumesCondition(),
				info.getProducesCondition(), info.getCustomCondition());
		return newInfo;
    }

}
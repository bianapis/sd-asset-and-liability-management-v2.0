/**
 * @author Virtusa
 */
package org.bian.impl.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.bian.annotation.BianConsumers;
import org.bian.annotation.Consumer;
import org.bian.pubsub.PubSubTask;
import org.bian.starter.pubsub.PubSubFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.core.type.filter.AnnotationTypeFilter;
import org.springframework.stereotype.Component;

@Component
public class BianAnnotationHandler implements ApplicationListener<ContextRefreshedEvent> {

	public static final Logger LOGGER = LoggerFactory.getLogger(BianAnnotationHandler.class);
	
	@Autowired
	PubSubFactory pubSubFactory;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		ClassPathScanningCandidateComponentProvider scanner = new ClassPathScanningCandidateComponentProvider(false);

		scanner.addIncludeFilter(new AnnotationTypeFilter(BianConsumers.class));

		for (BeanDefinition bd : scanner.findCandidateComponents("org.bian")) {
			try {
				LOGGER.debug("Found Bian consumers: " + bd.getBeanClassName());
				final Class<?> clazz = Class.forName(bd.getBeanClassName());
				Method[] methods = clazz.getDeclaredMethods();
				for (Method method : methods) {
					Consumer consumerAnnotation = AnnotationUtils.findAnnotation(method, Consumer.class);
					if (consumerAnnotation != null) {
						LOGGER.debug("Found a Pub-sub consumer: " + method.getName());
						pubSubFactory.getConsumer().registerAsync(consumerAnnotation.topic(), new PubSubTask() {
							@Override
							public void go(String content) {
								try {
									method.invoke(clazz.newInstance(), content);
								} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException
										| InstantiationException e) {
									LOGGER.error("Unable to invoke the task for consumer: " + bd.getBeanClassName()
											+ " > " + method.getName() + " with data: " + content + " and topic: "
											+ consumerAnnotation.topic(), e);
								}
							}
						});
						consumerAnnotation.topic();
					}
				}
			} catch (ClassNotFoundException e1) {
				LOGGER.error("Unable to instantiate an instance of: " + bd.getBeanClassName(), e1);
			}
		}
	}
}
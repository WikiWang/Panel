/**
 * 2016-11-21 中航信
 */
package com.test.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ApplicationContext;

/**
 * spring-boot 应用
 * @author wk
 *
 */
@SpringBootApplication
@EnableCaching
public class PanelApplication implements EmbeddedServletContainerCustomizer{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(PanelApplication.class);

	@Value("${port}")
	private int port;
	
	public static void main(String[] args){
		LOGGER.info("Starting.");
		SpringApplication springApplication = new SpringApplication (PanelApplication.class);
		ApplicationContext ctx = springApplication.run (args);
		LOGGER.info("Start success."+ctx.getBeanDefinitionCount()+"beans start.");
	}

	@Override
	public void customize(ConfigurableEmbeddedServletContainer container) {
		
		container.setPort(port);  
		
	}
}
package ro.andonescu.demos.springfreemarker.config;

import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.SimpleThreadScope;

import java.util.HashMap;

@Configuration
public class SessionConfig {

	@Bean
	public SimpleThreadScope getSimpleThreadScope() {
		return new SimpleThreadScope();
	}

	@Bean
	public CustomScopeConfigurer getCustomScopeConfigurer() {
		CustomScopeConfigurer scope = new CustomScopeConfigurer();
		scope.setScopes(new HashMap<String, Object>() {
			/**
				 * 
				 */
			private static final long serialVersionUID = 1L;

			{
				put("sesion", getSimpleThreadScope());
			}
		});
		return scope;
	}
}

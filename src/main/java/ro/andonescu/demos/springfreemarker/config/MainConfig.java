/**
 *
 */
package ro.andonescu.demos.springfreemarker.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.*;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.core.env.Environment;

import javax.inject.Inject;

/**
 * @author iandonescu
 */
@Configuration
@ComponentScan(basePackages = "ro.andonescu.demos.springfreemarker", excludeFilters = {@ComponentScan.Filter(Configuration.class)})
@PropertySource(name = "appProps", value = {"classpath:app.properties"})
@EnableAspectJAutoProxy(proxyTargetClass = false)
public class MainConfig {

    @Inject
    private Environment environment;

    @Bean
    public MessageSource messageSource() {
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setBasename("classpath:messages/messages");
        return messageSource;
    }

}

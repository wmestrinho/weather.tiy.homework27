package weather.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by WagnerMestrinho on 2/28/17.
 */
@Configuration
public class Registration {
    @Bean
    public FilterRegistrationBean mvcSecurityFilter() {
        FilterRegistrationBean registration = new FilterRegistrationBean(new Authorize());
        registration.addUrlPatterns("/secure/*");
        return registration;
    }
}

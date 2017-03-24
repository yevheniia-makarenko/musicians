package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by eugen on 3/24/17.
 */
@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "controller")
public class MvcConfig extends WebMvcConfigurerAdapter{
}

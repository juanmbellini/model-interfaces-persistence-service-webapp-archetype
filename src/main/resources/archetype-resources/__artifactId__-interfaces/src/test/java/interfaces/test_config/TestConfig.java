package ${package}.interfaces.test_config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration class. Add Spring Beans here.
 */
@Configuration
@ComponentScan({"${package}.interfaces.utils",})
public class TestConfig {

    // Add your Spring Beans here...
}
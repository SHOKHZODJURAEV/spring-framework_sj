package dono.daryo.stereotype_annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
//@ComponentScan create object in current package
@ComponentScan(basePackages = "dono.daryo") // create object outside of package
public class ConfigCourse {
}

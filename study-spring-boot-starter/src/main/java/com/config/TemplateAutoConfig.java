package com.config;

import com.format.IFormatProcesser;
import com.properties.MySpringbootProeprtiesConfig;
import com.properties.MySpringbootProperties;
import com.template.FormatTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 2020/4/4.
 */
@Import({FormatAutoConfig.class, MySpringbootProeprtiesConfig.class})
@Configuration
public class TemplateAutoConfig {

    @Bean
    public FormatTemplate formatTemplate(MySpringbootProperties properties, IFormatProcesser formatProcesser){
        return new FormatTemplate(properties, formatProcesser);
    }
}

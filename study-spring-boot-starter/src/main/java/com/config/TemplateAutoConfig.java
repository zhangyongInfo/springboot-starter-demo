package com.config;

import com.format.IFormatProcesser;
import com.template.FormatTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 2020/4/4.
 */
@Import({FormatAutoConfig.class})
@Configuration
public class TemplateAutoConfig {

    @Bean
    public FormatTemplate formatTemplate(IFormatProcesser formatProcesser){
        return new FormatTemplate(formatProcesser);
    }
}

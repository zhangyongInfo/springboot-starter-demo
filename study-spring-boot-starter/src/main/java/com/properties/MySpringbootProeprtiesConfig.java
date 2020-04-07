package com.properties;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * 2020/4/6.
 */
@Configuration
@EnableConfigurationProperties({MySpringbootProperties.class})    //启用自定义配置,依赖端就可以使用该配置了
public class MySpringbootProeprtiesConfig {
}

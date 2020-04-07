package com.httpMessageConvert;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

/**
 * 2020/4/6.
 * 扩展消息转换器
 */
@Configuration
public class MyHttpMessageConvertConfig implements WebMvcConfigurer {

    //扩展转换器方法
    //该方法在WebMvcConfigurationSupport#getMessageConverters()方法中用到
    public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.add(new MyHttpMessageConvert());
    }
}

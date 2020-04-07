package com.config;

import com.format.IFormatProcesser;
import com.format.impl.JsonFormatProcesser;
import com.format.impl.StringFormatProcesser;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * 2020/4/4.
 */
@Configuration
public class FormatAutoConfig {

    @ConditionalOnMissingClass("com.google.gson.Gson") //缺少指定class的时候,加载
    @Primary    //一个接口多个实现的时候, 该注解表示优先采用
    @Bean
    public IFormatProcesser stringFormatProcesser(){
        return new StringFormatProcesser();
    }

    @ConditionalOnClass(name = "com.google.gson.Gson") //存在指定class 的时候加载
    @Bean
    public IFormatProcesser jsonFormatProcesser(){
        return new JsonFormatProcesser();
    }
}

package com.httpMessageConvert;

import com.domain.User;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Properties;

/**
 * 2020/4/6.
 * 自定义消息转换类型
 */
public class MyHttpMessageConvert extends AbstractHttpMessageConverter<User> {

    public MyHttpMessageConvert(){
        super(MediaType.valueOf("application/myProperties"));
        setDefaultCharset(Charset.forName("UTF-8"));
    }
    @Override
    protected boolean supports(Class<?> aClass) {
        //判断aclass是否为User.class的父类
        return aClass.isAssignableFrom(User.class);
    }

    //输入转换
    @Override
    protected User readInternal(Class<? extends User> aClass, HttpInputMessage httpInputMessage) throws IOException, HttpMessageNotReadableException {
        InputStream inputStream = httpInputMessage.getBody();

        Properties properties = new Properties();
//        properties.load(new InputStreamReader(inputStream, getDefaultCharset()));
        properties.load(inputStream);

        User user = new User(properties.getProperty("user.name"), Integer.valueOf(properties.getProperty("user.age")));

        return user;
    }

    //输出转换
    @Override
    protected void writeInternal(User user, HttpOutputMessage httpOutputMessage) throws IOException, HttpMessageNotWritableException {
        OutputStream outputStream = httpOutputMessage.getBody();

        Properties properties = new Properties();
        properties.setProperty("user.name", user.getName());
        properties.setProperty("user.age", String.valueOf(user.getAge()));

//        properties.store(new OutputStreamWriter(outputStream, getDefaultCharset()), "writtern by web server");
        properties.store(outputStream, "writtern by web server");
    }
}

package com.httpMessageConvert;

import com.domain.User;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 2020/4/6.
 */
@RestController
public class MyHttpMessageConvertController {

    //consumes接收消息类型, produces输出消息类型
    @RequestMapping(value = "/myspringboot/jsonToProperties", consumes = MediaType.APPLICATION_JSON_VALUE, produces = "application/myProperties")
    public User jsonToProperties(@RequestBody User user){
        //接收json
        //输出properties
        return user;
    }

    @RequestMapping(value = "/myspringboot/propertiesToJson", consumes = "application/myProperties", produces = MediaType.APPLICATION_JSON_VALUE)
    public User propertiesToJson(@RequestBody User user){
        //接收properties
        //输出json
        return user;
    }
}

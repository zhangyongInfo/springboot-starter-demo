package com.configuration;

import com.jmxDemo.MechineMBean;
import com.jmxDemo.Mechine;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.management.MBeanServer;
import javax.management.ObjectName;
import java.lang.management.ManagementFactory;

/**
 * 2020/4/5.
 */
@Configuration
public class JmxConfiguration {

    //监控类的接口必须以MBean结尾, 实现类必须是MBean前面的名字, 且实现类和接口必须在同一个包下
    @Bean
    public MechineMBean mechineMBean() throws Exception{
        MBeanServer beanServer= ManagementFactory.getPlatformMBeanServer();
        ObjectName objectName = new ObjectName("com.jmxDemo.Mechine:type=mechine");
        MechineMBean mechineMBean = new Mechine();
        beanServer.registerMBean(mechineMBean,objectName);
        return mechineMBean;
    }
}

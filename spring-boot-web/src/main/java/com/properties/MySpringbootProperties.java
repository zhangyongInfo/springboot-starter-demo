package com.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Map;

/**
 * 2020/4/4.
 */
@ConfigurationProperties(prefix = MySpringbootProperties.MY_SPRINGBOOT_PRO)
public class MySpringbootProperties {

    public static final String MY_SPRINGBOOT_PRO = "my.springboot.pro";

    private String url;

    private String version;

    private Map<String, Object>  map;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }
}

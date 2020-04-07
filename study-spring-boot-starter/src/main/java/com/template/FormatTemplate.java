package com.template;

import com.properties.MySpringbootProperties;
import com.format.IFormatProcesser;

/**
 * 2020/4/4.
 */
public class FormatTemplate {

    private IFormatProcesser formatProcesser;

    private MySpringbootProperties properties;

    public FormatTemplate(MySpringbootProperties properties, IFormatProcesser formatProcesser){
        this.properties = properties;
        this.formatProcesser = formatProcesser;
    }

    public <T> String getFormatValue(T t){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("execute format:").append("<br>");
        stringBuffer.append("mySpringbootProperites:").append(formatProcesser.formatObj(properties)).append("<br>");
        stringBuffer.append("Obj fromat value:").append(formatProcesser.formatObj(t)).append("<br/>");
        return stringBuffer.toString();
    }
}

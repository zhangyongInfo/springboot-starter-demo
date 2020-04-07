package com.template;

import com.format.IFormatProcesser;

/**
 * 2020/4/4.
 */
public class FormatTemplate {

    private IFormatProcesser formatProcesser;

    public FormatTemplate(IFormatProcesser formatProcesser){
        this.formatProcesser = formatProcesser;
    }

    public <T> String getFormatValue(T t){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("execute format:").append("<br>");
        stringBuffer.append("Obj fromat value:").append(formatProcesser.formatObj(t)).append("<br/>");
        return stringBuffer.toString();
    }
}

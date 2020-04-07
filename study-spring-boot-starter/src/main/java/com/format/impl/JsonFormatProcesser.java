package com.format.impl;

import com.format.IFormatProcesser;
import com.google.gson.Gson;

/**
 * 2020/4/4.
 */
public class JsonFormatProcesser implements IFormatProcesser {

    @Override
    public <T> String formatObj(T t) {
        String str = "JsonFormat: " + new Gson().toJson(t);
        return str;
    }
}

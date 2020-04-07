package com.format.impl;

import com.format.IFormatProcesser;

import java.util.Objects;

/**
 * 2020/4/4.
 */
public class StringFormatProcesser implements IFormatProcesser {

    @Override
    public <T> String formatObj(T t) {
        String str = "StringFormat: " + Objects.toString(t);
        return str;
    }
}

package com.jmxDemo;

/**
 * 2020/4/5.
 */
public interface MechineMBean {

    //属性、  操作

    int getCpuCore();

    long getFreeMemory();

    void shutdown();
}

package com.jmxDemo;

/**
 * 2020/4/5.
 */
public class Mechine implements MechineMBean {

    //获取cpu核数
    @Override
    public int getCpuCore() {
        return Runtime.getRuntime().availableProcessors();
    }

    //获取空闲内存
    @Override
    public long getFreeMemory() {
        return Runtime.getRuntime().freeMemory();
    }

    //关闭服务
    @Override
    public void shutdown() {
        System.exit(0);
    }
}

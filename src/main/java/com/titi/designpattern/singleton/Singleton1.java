package com.titi.designpattern.singleton;

/**
 * @author bianyulong
 * @description 懒汉模式
 * @create 2021/02/07
 */
public class Singleton1 {

    private static Singleton1 instance;

    private Singleton1() {
    }

    /**
     * 延迟初始化， 非线程安全
     *
     * @return
     */
    public static Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }

    /**
     * 延迟初始化， 线程安全
     *
     * @return
     */
    public static synchronized Singleton1 getInstance1() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }
}

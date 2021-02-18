package com.titi.designpattern.singleton;

/**
 * @author bianyulong
 * @description 饿汉模式
 * @create 2021/02/07
 */
public class Singleton2 {
    private static Singleton2 instance = new Singleton2();

    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        return instance;
    }
}

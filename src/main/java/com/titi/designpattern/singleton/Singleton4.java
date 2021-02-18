package com.titi.designpattern.singleton;

/**
 * @author bianyulong
 * @description 静态内部类
 * @create 2021/02/07
 */
public class Singleton4 {

    private Singleton4 singleton;

    private Singleton4() {

    }

    public Singleton4 getInstance() {
        return SingletonHolder.singleton;
    }

    private static class SingletonHolder {
        private static final Singleton4 singleton = new Singleton4();
    }

}

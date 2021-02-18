package com.titi.designpattern.singleton;


/**
 * @author bianyulong
 * @description 枚举型
 * @create 2021/02/07
 */
public enum Singleton5 {
    INSTANCE;

    public void whateverMethod() {
        System.out.println("来自枚举的单例模式");
    }

}

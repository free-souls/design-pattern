package com.titi.designpattern.prototype;

/**
 * @author bianyulong
 * @description 原型模式主要是以现有的对象创建出新的对象，两个对象通过复制的方式实现
 * @create 2021/02/18
 */
public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Realizetype obj1 = new Realizetype();
        Realizetype obj2 = (Realizetype) obj1.clone();
        System.out.println("obj1==obj2?" + (obj1 == obj2));
    }
}

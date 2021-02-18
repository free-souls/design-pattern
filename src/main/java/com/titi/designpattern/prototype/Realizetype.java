package com.titi.designpattern.prototype;

/**
 * @author bianyulong
 * @description
 * @create 2021/02/18
 */
public class Realizetype implements Cloneable {

    Realizetype() {
        System.out.println("具体原型创建成功！");
    }

    public Object clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功！");
        return (Realizetype) super.clone();
    }
}

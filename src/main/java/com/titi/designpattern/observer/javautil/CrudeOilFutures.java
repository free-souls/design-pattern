package com.titi.designpattern.observer.javautil;

import java.util.Observer;

/**
 * @author bianyulong
 * @description java util中提供的观察者类
 * @create 2021/02/18
 */
public class CrudeOilFutures {
    public static void main(String[] args) {
        OilFutures oil = new OilFutures();
        Observer bull = new Bull(); //多方
        Observer bear = new Bear(); //空方

        oil.addObserver(bull);
        oil.addObserver(bear);
        oil.setPrice(10);
        oil.setPrice(-8);
    }
}

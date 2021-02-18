package com.titi.designpattern.observer;

/**
 * @author bianyulong
 * @description
 * @create 2021/02/18
 */
public class ConcreteObserver1 implements Observer {

    @Override
    public void response() {
        System.out.println("具体观察者1做出反应... ...");
    }
}

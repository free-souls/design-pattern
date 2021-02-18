package com.titi.designpattern.observer;

/**
 * @author bianyulong
 * @description
 * @create 2021/02/18
 */
public class Main {

    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        Observer obs1 = new ConcreteObserver1();
        Observer obs2 = new ConcreteObserver2();

        subject.addObserver(obs1);
        subject.addObserver(obs2);
        subject.notifyObserver();
    }
}

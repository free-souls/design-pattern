package com.titi.designpattern.observer;

/**
 * @author bianyulong
 * @description
 * @create 2021/02/18
 */
public class ConcreteSubject extends Subject {

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.response();
        }
    }
}

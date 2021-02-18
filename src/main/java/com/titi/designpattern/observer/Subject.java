package com.titi.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bianyulong
 * @description
 * @create 2021/02/18
 */
public abstract class Subject {

    protected List<Observer> observers = new ArrayList<Observer>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * 通知观察者
     */
    public abstract void notifyObserver();

}

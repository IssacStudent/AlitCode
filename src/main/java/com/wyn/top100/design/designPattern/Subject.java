package com.wyn.top100.design.designPattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

    /**
     * 用来保存注册的观察者对象
     */
    private List<Observer> list = new ArrayList<>();

    /**
     * 注册观察者对象
     * @param observer 观察者对象
     */
    public void attach(Observer observer) {
        list.add(observer);
        System.out.println("Attached an observer");
    }

    /**
     * 移除观察者对象
     * @param observer 观察者对象
     */
    public void detach(Observer observer) {
        list.remove(observer);
    }

    /**
     * 通知所有注册的观察者对象
     */
    public void notifyObservers(String newState) {
        for (Observer observer : list) {
            observer.update(newState);
        }
    }
}

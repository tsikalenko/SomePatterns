package com.gmail.tsikalenko.nikita.observer;

import com.gmail.tsikalenko.nikita.singleton.Fishes;

import java.util.ArrayList;
import java.util.List;

public class Malling implements Observed{

    List<Observer> subscraibers = new ArrayList<Observer>();

    public void addObserver(Observer observer) {
        subscraibers.add(observer);
    }

    public void removeObserver(Observer observer) {
        subscraibers.remove(observer);
    }

    public void notifyAllObserver() {
        for(Observer subsc : subscraibers){
            subsc.handleEvent(Fishes.getFishes().getAllFish());
        }
    }
}

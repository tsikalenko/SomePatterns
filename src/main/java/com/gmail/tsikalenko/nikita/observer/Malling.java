package com.gmail.tsikalenko.nikita.observer;

import com.gmail.tsikalenko.nikita.singleton.Fishes;

import java.util.ArrayList;
import java.util.List;

public class Malling implements Observed {
    private static Malling malling;

    private List<Observer> subscraibers = new ArrayList<Observer>();

    private Malling() {
    }

    public static synchronized Malling getMalling() {
        if (malling == null) {
            malling = new Malling();
        }
        return malling;
    }

    public void addObserver(Observer observer) {
        subscraibers.add(observer);
    }

    public void removeObserver(Observer observer) {
        subscraibers.remove(observer);
    }

    public void notifyAllObserver() {
        for (Observer subsc : subscraibers) {
            subsc.handleEvent(Fishes.getFishes().getAllFish());
        }
    }
}

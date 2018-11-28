package com.gmail.tsikalenko.nikita.singleton;

import com.gmail.tsikalenko.nikita.observer.Malling;

import java.util.ArrayList;
import java.util.List;

public class Fishes {
    private static Fishes fishes;

    private List<String> fishList = new ArrayList<String>();

    private Fishes() {
    }

    public static synchronized Fishes getFishes() {
        if (fishes == null) {
            fishes = new Fishes();
        }
        return fishes;
    }

    public void addFish(String newFish) {
        fishList.add(newFish);
        Malling.getMalling().notifyAllObserver();
    }

    public void removeFish(int index) {
        fishList.remove(index);
        Malling.getMalling().notifyAllObserver();
    }

    public List<String> getAllFish() {
        return fishList;
    }


}

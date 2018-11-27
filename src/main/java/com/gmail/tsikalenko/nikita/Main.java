package com.gmail.tsikalenko.nikita;

import com.gmail.tsikalenko.nikita.observer.Malling;
import com.gmail.tsikalenko.nikita.observer.Subscribers;
import com.gmail.tsikalenko.nikita.singleton.Fishes;

public class Main {
    public static void main(String[] args) {
        Fishes.getFishes().addFish("Salmom");
        Fishes.getFishes().addFish("Shark");

        Malling malling = new Malling();

        malling.addObserver(new Subscribers("Neo", "nikita.tsikalenko@gmail.com"));
        malling.addObserver(new Subscribers("Ki4", "sergeykichukki4@gmail.com"));
        malling.addObserver(new Subscribers("Jet))", "smirnov.mykyta@gmail.com"));

        malling.notifyAllObserver();
    }
}

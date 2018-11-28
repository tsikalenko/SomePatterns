package com.gmail.tsikalenko.nikita;

import com.gmail.tsikalenko.nikita.observer.Malling;
import com.gmail.tsikalenko.nikita.observer.Subscribers;
import com.gmail.tsikalenko.nikita.singleton.Fishes;

public class Main {
    public static void main(String[] args) {

        Malling.getMalling().addObserver(new Subscribers("Neo", "nikita.tsikalenko@gmail.com"));
        Malling.getMalling().addObserver(new Subscribers("Ki4", "sergeykichukki4@gmail.com"));
        Malling.getMalling().addObserver(new Subscribers("Jet))", "smirnov.mykyta@gmail.com"));

        Fishes.getFishes().addFish("Salmom");
        Fishes.getFishes().addFish("Shark");

        Fishes.getFishes().removeFish(0);
    }
}

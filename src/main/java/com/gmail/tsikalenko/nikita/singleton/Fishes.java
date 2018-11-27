package com.gmail.tsikalenko.nikita.singleton;

import java.util.ArrayList;
import java.util.List;

public class Fishes {
    private static Fishes fishes;

    private List<String> fishList = new ArrayList<String>();

    private Fishes() {
    }

    public static synchronized Fishes getFishes(){
        if(fishes == null){
            fishes = new Fishes();
        }
        return fishes;
    }

    public void addFish(String newFish){
        fishList.add(newFish);
    }

    public  void removeFish(String fish){
        fishList.remove(fish);
    }

    public List<String> getAllFish(){
        return fishList;
    }


}

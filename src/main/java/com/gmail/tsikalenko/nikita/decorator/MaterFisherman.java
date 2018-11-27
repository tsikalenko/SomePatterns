package com.gmail.tsikalenko.nikita.decorator;

public class MaterFisherman extends Fisherman {

    public MaterFisherman(IFishWorker fishWorker) {
        super(fishWorker);
    }

    public String addSause() {
        return " Add the sauce to the fish.";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + addSause();
    }
}

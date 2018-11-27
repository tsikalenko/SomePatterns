package com.gmail.tsikalenko.nikita.decorator;

public class Fisherman implements IFishWorker {

    IFishWorker fishWorker;

    public Fisherman(IFishWorker fishWorker) {
        this.fishWorker = fishWorker;
    }

    public String makeJob() {
        return fishWorker.makeJob();
    }
}

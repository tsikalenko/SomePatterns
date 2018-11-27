package com.gmail.tsikalenko.nikita.decorator;

public class ExperiencedFisherman extends Fisherman {
    public ExperiencedFisherman(IFishWorker fishWorker) {
        super(fishWorker);
    }

    public String cleanTheFish() {
        return " Clean the fish.";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + cleanTheFish();
    }
}

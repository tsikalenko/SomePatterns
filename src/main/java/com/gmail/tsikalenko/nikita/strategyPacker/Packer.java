package com.gmail.tsikalenko.nikita.strategyPacker;

public class Packer {
    IPackingTheFish packingTheFish;

    public void setPackingTheFish(IPackingTheFish packingTheFish) {
        this.packingTheFish = packingTheFish;
    }

    public void executePackingTheFish() {
        packingTheFish.packTheFish();
    }
}

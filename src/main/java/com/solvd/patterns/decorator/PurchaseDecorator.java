package com.solvd.patterns.decorator;

public class PurchaseDecorator implements Ammunition { //мб сделать АБСТРАКТ???

    private Ammunition defAmmunition;

    public PurchaseDecorator(Ammunition newAmmunition) {
        this.defAmmunition = newAmmunition;
    }

    @Override
    public String getList() {
        return defAmmunition.getList();
    }

    @Override
    public double getCost() {
        return defAmmunition.getCost();
    }
}

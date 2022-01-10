package com.solvd.patterns.decorator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Armor extends PurchaseDecorator {

    public static final Logger LOGGER = LogManager.getLogger(Armor.class);

    public Armor(Ammunition newAmmunition) {
        super(newAmmunition);
        LOGGER.info("Getting start pack ammunition...");
        LOGGER.info("Buying light armor...\n");
    }

    @Override
    public String getList() {
        return super.getList() + ", light armor";
    }

    @Override
    public double getCost() {
        return super.getCost() + 650.00;
    }
}

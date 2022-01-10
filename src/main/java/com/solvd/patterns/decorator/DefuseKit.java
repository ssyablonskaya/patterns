package com.solvd.patterns.decorator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DefuseKit extends PurchaseDecorator {

    public static final Logger LOGGER = LogManager.getLogger(DefuseKit.class);

    public DefuseKit(Ammunition newAmmunition) {
        super(newAmmunition);
        LOGGER.info("Getting start pack ammunition...");
        LOGGER.info("Buying defuse kit...\n");
    }

    @Override
    public String getList() {
        return super.getList() + ", defuse kit";
    }

    @Override
    public double getCost() {
        return super.getCost() + 400.00;
    }
}

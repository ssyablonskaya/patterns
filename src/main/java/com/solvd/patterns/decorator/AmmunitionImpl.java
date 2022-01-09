package com.solvd.patterns.decorator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AmmunitionImpl implements Ammunition {

    public static final Logger LOGGER = LogManager.getLogger(AmmunitionImpl.class);

    @Override
    public String getList() {
        return "knife, pistol";
    }

    @Override
    public double getCost() {
        return 0.00;
    }
}

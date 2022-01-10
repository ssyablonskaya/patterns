package com.solvd.patterns.builder;

public class Weapon {

    private String name;
    private String weaponClass;
    private String shootingMode;
    private String availability;
    private Integer price;
    private String origin;
    private Integer rateOfFire;
    private String rangeOfDefeat;
    private String peculiarity;
    private String inConsole;

    public String getName() {
        return name;
    }

    public String getWeaponClass() {
        return weaponClass;
    }

    public String getShootingMode() {
        return shootingMode;
    }

    public String getAvailability() {
        return availability;
    }

    public Integer getPrice() {
        return price;
    }

    public String getOrigin() {
        return origin;
    }

    public Integer getRateOfFire() {
        return rateOfFire;
    }

    public String getRangeOfDefeat() {
        return rangeOfDefeat;
    }

    public String getPeculiarity() {
        return peculiarity;
    }

    public String getInConsole() {
        return inConsole;
    }

    public static Builder builder() {
        return new Builder(new Weapon());
    }

    @Override
    public String toString() {
        return "Weapon{" + "',\n" +
                "name='" + name + "',\n" +
                "weaponClass='" + weaponClass + "',\n" +
                "shootingMode='" + shootingMode + "',\n" +
                "availability='" + availability + "',\n" +
                "price=" + price + "',\n" +
                "origin='" + origin + "',\n" +
                "rateOfFire=" + rateOfFire + "',\n" +
                "rangeOfDefeat='" + rangeOfDefeat + "',\n" +
                "peculiarity='" + peculiarity + "',\n" +
                "inConsole='" + inConsole + "',\n" +
                '}';
    }

    public static class Builder {

        private final Weapon weapon;

        private Builder(Weapon weapon) {
            this.weapon = weapon;
        }

        public Builder name(String name) {
            weapon.name = name;
            return this;
        }

        public Builder weaponClass(String weaponClass) {
            weapon.weaponClass = weaponClass;
            return this;
        }

        public Builder shootingMode(String shootingMode) {
            weapon.shootingMode = shootingMode;
            return this;
        }

        public Builder availability(String availability) {
            weapon.availability = availability;
            return this;
        }

        public Builder price(Integer price) {
            weapon.price = price;
            return this;
        }

        public Builder origin(String origin) {
            weapon.origin = origin;
            return this;
        }

        public Builder rateOfFire(Integer rateOfFire) {
            weapon.rateOfFire = rateOfFire;
            return this;
        }

        public Builder rangeOfDefeat(String rangeOfDefeat) {
            weapon.rangeOfDefeat = rangeOfDefeat;
            return this;
        }

        public Builder peculiarity(String peculiarity) {
            weapon.peculiarity = peculiarity;
            return this;
        }

        public Builder inConsole(String inConsole) {
            weapon.inConsole = inConsole;
            return this;
        }

        public Weapon build() {
            return weapon;
        }

    }

}

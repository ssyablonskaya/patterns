package com.solvd.patterns.strategy;

public class Player {

    private String role;
    private AWP weaponPhase;

    public Player(String role) {
        this.role = role;
        this.weaponPhase = new NoScope();
    }

    public void goWith() {
        weaponPhase.takeAction();
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public AWP getWeaponPhase() {
        return weaponPhase;
    }

    public void setWeaponPhase(AWP weaponPhase) {
        this.weaponPhase = weaponPhase;
    }
}

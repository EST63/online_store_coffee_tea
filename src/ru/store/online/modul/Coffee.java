package ru.store.online.modul;

import ru.store.online.modul.enumiration.CoffeeType;
import ru.store.online.modul.enumiration.Roasting;

public class Coffee extends Drink {
    private CoffeeType type;
    private Roasting roasting;

    public CoffeeType getType() {
        return type;
    }

    public void setType(CoffeeType type) {
        this.type = type;
    }

    public Roasting getRoasting() {
        return roasting;
    }

    public void setRoasting(Roasting roasting) {
        this.roasting = roasting;
    }
}

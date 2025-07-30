package ru.store.online.modul;

import ru.store.online.modul.enumiration.Aroma;
import ru.store.online.modul.enumiration.TeaType;

public class Tea extends Drink {
    private TeaType type;
    private Aroma aroma;

    public TeaType getType() {
        return type;
    }

    public void setType(TeaType type) {
        this.type = type;
    }

    public Aroma getAroma() {
        return aroma;
    }

    public void setAroma(Aroma aroma) {
        this.aroma = aroma;
    }
}

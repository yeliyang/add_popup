package com.tmaat.dtara.onlinemovingestimator;

/**
 * Created by dtara on 9/24/2017.
 */

public class Furniture {
    String name = null;
    boolean selected = false;

    public Furniture(String name, boolean selected) {
        super();
        this.name = name;
        this.selected = selected;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public boolean isSelected() {
        return selected;
    }
    public void setSelected(boolean selected) {
        this.selected = selected;
    }
}

package com.jamesball.monopoly;

public class UnimprovedProperty extends Property {

    private ColorGroup colorGroup;

    public UnimprovedProperty(String name, ColorGroup colorGroup) {
        super(name);
        this.colorGroup = colorGroup;
    }

    public ColorGroup getColorGroup() {
        return this.colorGroup;
    }


    @Override
    public String toString() {
        return "UnimprovedProperty{" +
                "name='" + getName() + "'" +
                ", colorGroup='" + getColorGroup() + "'" +
                "}";
    }

}

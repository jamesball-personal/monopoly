package com.jamesball.monopoly;

public abstract class Property {

    private String name;

    public Property(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Property{" +
                "name='" + this.name + "'" +
                "}";
    }

}

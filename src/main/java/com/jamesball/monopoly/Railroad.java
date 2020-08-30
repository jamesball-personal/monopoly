package com.jamesball.monopoly;

public class Railroad extends Property {

    public Railroad(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Railroad{" +
                "name='" + getName() + "'" +
                "}";
    }
}

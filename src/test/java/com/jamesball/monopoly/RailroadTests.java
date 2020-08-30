package com.jamesball.monopoly;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest

public class RailroadTests {

    @Test
    public void shouldCreateRailroad() {
        Railroad railroad = new Railroad("abc");
        assertEquals("Railroad{name='abc'}", railroad.toString());
    }

}

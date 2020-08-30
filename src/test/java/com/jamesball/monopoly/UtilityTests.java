package com.jamesball.monopoly;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest

public class UtilityTests {

    @Test
    public void shouldCreateUtility() {
        Utility utility = new Utility("abc");
        assertEquals("Utility{name='abc'}", utility.toString());
    }

}

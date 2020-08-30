package com.jamesball.monopoly;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest

public class UnimprovedPropertyTests {

    @Test
    public void shouldCreateUnimprovedPropertyOfEachColorGroup() {
        Stream.of(ColorGroup.values())
                .forEach(colorGroup -> assertEquals(
                        "UnimprovedProperty{name='abc', colorGroup='" + colorGroup + "'}",
                        new UnimprovedProperty("abc", colorGroup).toString()
                ));
    }

}

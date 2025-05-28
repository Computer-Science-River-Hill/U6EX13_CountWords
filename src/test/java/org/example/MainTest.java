package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {


    @Test
    void middleCharacter_One() {
        assertEquals("en", Main.middleCharacter("agenda"));

    }

    @Test
    void middleCharacter_Two() {
        assertEquals("ar", Main.middleCharacter("gregarious"));
    }

    @Test
    void middleCharacter_Three() {
        assertEquals("g", Main.middleCharacter("age"));
    }

}

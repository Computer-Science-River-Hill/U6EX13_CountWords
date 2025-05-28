package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {


    @Test
    void squirrelPlay_One() {
        assertEquals(true, Main.squirrelPlay(70,false));

    }

    @Test
    void squirrelPlay_Two() {
        assertEquals(false, Main.squirrelPlay(95,false));
    }

    @Test
    void squirrelPlay_Three() {
        assertEquals(true, Main.squirrelPlay(95,true));
    }

}

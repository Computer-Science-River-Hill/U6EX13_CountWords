package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {


    @Test
    void countWords_One() {
        assertEquals(11, Main.countWords("There was no telling what thoughts would come from the machine."));

    }

    @Test
    void countWords_Two() {
        assertEquals(6, Main.countWords("Joyce enjoyed eating pancakes with ketchup."));
    }

    @Test
    void countWords_Three() {
        assertEquals(13, Main.countWords("He watched the dancing piglets with panda bear tummies in the swimming pool."));
    }

}

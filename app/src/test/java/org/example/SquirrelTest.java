package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SquirrelTest {
    @Test
    public void testSquirrelCreation() {
        Squirrel squirrel = new Squirrel("Test Squirrel");
        assertNotNull(squirrel);
        assertEquals("Test Squirrel", squirrel.getName());
    }

    @Test
    public void testGetName() {
        Squirrel squirrel = new Squirrel("Test Squirrel");
        assertEquals("Test Squirrel", squirrel.getName());
    }
}

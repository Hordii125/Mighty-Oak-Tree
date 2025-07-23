package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SquirrelNodeTest {
    @Test
    public void testSquirrelNodeCreation() {
        Squirrel squirrel = new Squirrel("Test Squirrel");
        SquirrelNode node = new SquirrelNode(squirrel);
        
        assertNotNull(node);
        assertEquals("Test Squirrel", node.getSquirrel().getName());
    }

    @Test
    public void testSetAndGetLeftNode() {
        Squirrel squirrel1 = new Squirrel("Squirrel 1");
        Squirrel squirrel2 = new Squirrel("Squirrel 2");
        
        SquirrelNode node1 = new SquirrelNode(squirrel1);
        SquirrelNode node2 = new SquirrelNode(squirrel2);
        
        node1.setLeft(node2);
        
        assertEquals(node2, node1.getLeft());
        assertEquals("Squirrel 2", node1.getLeft().getSquirrel().getName());
    }

    @Test
    public void testSetAndGetRightNode() {
        Squirrel squirrel1 = new Squirrel("Squirrel 1");
        Squirrel squirrel2 = new Squirrel("Squirrel 2");
        
        SquirrelNode node1 = new SquirrelNode(squirrel1);
        SquirrelNode node2 = new SquirrelNode(squirrel2);
        
        node1.setRight(node2);
        
        assertEquals(node2, node1.getRight());
        assertEquals("Squirrel 2", node1.getRight().getSquirrel().getName());
    }

    @Test
    public void testGetSquirrel() {
        Squirrel squirrel = new Squirrel("Test Squirrel");
        SquirrelNode node = new SquirrelNode(squirrel);
        
        assertEquals(squirrel, node.getSquirrel());
        assertEquals("Test Squirrel", node.getSquirrel().getName());
    }
}

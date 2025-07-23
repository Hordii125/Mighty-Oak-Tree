package org.example;

public class SquirrelNode {
    Squirrel squirrel;
    SquirrelNode left;
    SquirrelNode right;

    public SquirrelNode(Squirrel squirrel) {
        this.squirrel = squirrel;
        this.left = null;
        this.right = null;
    }

    public Squirrel getSquirrel() {
        return squirrel;
    }

    public SquirrelNode getLeft() {
        return left;
    }

    public SquirrelNode getRight() {
        return right;
    }

    public void setLeft(SquirrelNode left) {
        this.left = left;
    }

    public void setRight(SquirrelNode right) {
        this.right = right;
    }
    
}

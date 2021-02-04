package edu.cvtc.shapes;

import javax.swing.*;

import static java.lang.Math.max;

public class Cuboid extends Shape {

    // Width, height, and depth of cuboid
    private float width = 0.0f;
    private float height = 0.0f;
    private float depth = 0.0f;

    // Constructor
    public Cuboid(float width, float height, float depth) {
        this.width = max(this.width, width);
        this.height = max(this.height, height);
        this.depth = max(this.depth, depth);
    }

    // Getters and setters
    public float getWidth() {
        return width;
    }

    private void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    private void setHeight(float height) {
        this.height = height;
    }

    public float getDepth() {
        return depth;
    }

    private void setDepth(float depth) {
        this.depth = depth;
    }

    // Surface area = 2(wh + wd + hd)
    public float surfaceArea() {
        return 2 * (width * height + width * depth + height * depth);
    }

    // Volume = width * height * depth
    public float volume() {
        return width * height * depth;
    }

    // Show message dialog w/ calculated values
    public void render() {
        JOptionPane.showMessageDialog(null, "The surface area of a " + getWidth() + " by "
                + getHeight() + " by " + getDepth() + " cuboid is " + surfaceArea() +
                " and the volume is " + volume() + ".");
    }
}

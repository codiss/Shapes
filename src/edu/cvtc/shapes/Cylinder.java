package edu.cvtc.shapes;

import javax.swing.*;

import static java.lang.Math.max;

public class Cylinder extends Shape {

    // Radius and height to of cylinder
    private float radius = 0.0f;
    private float height = 0.0f;

    // Constructor
    public Cylinder(float radius, float height) {
        this.radius = max(this.radius, radius);
        this.height = max(this.height, height);
    }

    // Getters and setters
    public float getRadius() {
        return radius;
    }

    private void setRadius(float radius) {
        this.radius = radius;
    }

    public float getHeight() {
        return height;
    }

    private void setHeight(float height) {
        this.height = height;
    }

    // Surface area = 2pi*r(h + r)
    float surfaceArea() {
        return (float) (2 * Math.PI * (height + radius));
    }

    // Volume = pi * r^2 * h
    float volume() {
        return (float) (Math.PI * Math.pow(radius, 2) * height);
    }

    // Show message dialog w/ calculated values
    void render() {
        JOptionPane.showMessageDialog(null, "The surface area of a cylinder with a radius of " +
                getRadius() + " and a height of " + getHeight() + " is " + surfaceArea() +
                " and the volume is " + volume() + ".");
    }
}

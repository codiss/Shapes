package edu.cvtc.shapes;

import javax.swing.*;

import static java.lang.Math.max;

public class Sphere extends Shape {

    // Radius of cylinder
    private float radius = 0.0f;

    // Constructor
    public Sphere(float radius) {
        this.radius = max(this.radius, radius);
    }

    // Getter and setter
    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    // Surface area = 4pi * r^2
    float surfaceArea() {
        return (float) (4 * Math.PI * Math.pow(radius, 2));
    }

    // Volume = (4/3)pi * r^3
    float volume() {
        return (float) ((4 / 3) * Math.PI * Math.pow(radius, 3));
    }

    // Show message dialog w/ calculated values
    void render() {
        JOptionPane.showMessageDialog(null, "The surface area of a sphere with a radius of " + getRadius() +
                " is " + surfaceArea() + " and the volume is " + volume() + ".");
    }
}

package edu.cvtc.shapes;

public class ShapesTest {

    public static void main(String[] args) {

        // Create cuboid, cylinder and sphere
        Cuboid myCuboid = new Cuboid(2.5f, 3.0f, 10.0f);
        Cylinder myCylinder = new Cylinder(2.5f, 10.1f);
        Sphere mySphere = new Sphere(10.9f);

        // Test render method on cuboid, cylinder and sphere
        myCuboid.render();
        myCylinder.render();
        mySphere.render();
    }

}

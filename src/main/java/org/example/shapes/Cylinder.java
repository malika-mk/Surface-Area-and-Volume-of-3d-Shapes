package org.example.shapes;

import java.util.Random;

public class Cylinder implements Shape3DInterface {
    private double radius;
    private double height;

    public Cylinder() {
        Random random = new Random();
        this.radius = 1 + (9 * random.nextDouble()); // Random radius between 1 and 10
        this.height = 5 + (15 * random.nextDouble()); // Random height between 5 and 20
    }

    @Override
    public double surfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    public double volume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    public String toString() {
        return "Cylinder (radius = " + radius + ", height = " + height + ")";
    }
}

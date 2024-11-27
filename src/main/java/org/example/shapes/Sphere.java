package org.example.shapes;

import java.util.Random;

public class Sphere implements Shape3DInterface {
    private double radius;

    public Sphere() {
        Random random = new Random();
        this.radius = 1 + (9 * random.nextDouble()); // Random radius between 1 and 10
    }

    @Override
    public double surfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double volume() {
        return (4.0 / 3) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public String toString() {
        return "Sphere (radius = " + radius + ")";
    }
}

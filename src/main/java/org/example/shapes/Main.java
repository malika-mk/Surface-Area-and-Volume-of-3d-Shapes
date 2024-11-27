package org.example.shapes;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape3DInterface> shapes = new ArrayList<>();

        // Generate 10 random 3D shapes
        for (int i = 0; i < 10; i++) {
            int randomShapeType = (int) (Math.random() * 3);
            switch (randomShapeType) {
                case 0 -> shapes.add(new Sphere());
                case 1 -> shapes.add(new Cylinder());
                case 2 -> shapes.add(new Cube());
            }
        }

        // Display information for each shape
        for (Shape3DInterface shape : shapes) {
            System.out.println(shape.toString());
            System.out.println("Surface Area: " + shape.surfaceArea());
            System.out.println("Volume: " + shape.volume());
            System.out.println();
        }
    }
}

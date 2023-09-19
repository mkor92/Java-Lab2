package org.example;

import java.util.ArrayList;
import java.util.HashSet;

public class App {
    public static void main(String[] args) {


        ArrayList<Shape> shapesList = new ArrayList<>();
        shapesList.add(new Circle(3));
        shapesList.add(new Circle(5));
        shapesList.add(Shape.createCircle(2.5));
        shapesList.add(new Rectangle(2.5, 4));
        shapesList.add(new Rectangle(1, 1));
        shapesList.add(Shape.createRectangle(3.5, 3.5));
        shapesList.sort(null);
        System.out.println("\nLista:\n========");
        for(Shape Shape:shapesList) {
            System.out.println(Shape);
        }


        HashSet<Shape> shapesHashSet = new HashSet<>();
        shapesHashSet.add(Shape.createCircle(10));
        shapesHashSet.add(new Circle(10));
       shapesHashSet.add(new Circle(7));
       shapesHashSet.add(new Circle(13));
        shapesHashSet.add(Shape.createRectangle(60, 35));
        shapesHashSet.add(new Rectangle(80, 40));
        shapesHashSet.add(new Rectangle(80, 40));
        shapesHashSet.add(new Rectangle(100, 80));
        System.out.println("\nHashSet:\n========");
        for(Shape hash:shapesHashSet){
            System.out.println(hash);
        }


    }
}
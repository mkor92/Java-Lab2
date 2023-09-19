package org.example;

public abstract class Shape implements Comparable<Shape> {
    public static Circle createCircle(double radius) {
        return new Circle(radius);
    }
    public static Rectangle createRectangle(double width, double height) {
        return new Rectangle(width, height);
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public int compareTo(Shape o) {
        return Double.compare(this.getArea(), o.getArea());
    }
}

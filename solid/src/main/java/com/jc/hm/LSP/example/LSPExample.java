package com.jc.hm.LSP.example;

public class LSPExample {

    static final String SQUARE = "Square";
    static final String RECTANGLE = "Rectangle";

    public static void main(String[] args) {
        Shape shape1 = getShape(SQUARE);
        shape1.setHeight(10);
        shape1.setWidth(20);
        System.out.println(SQUARE + "'s area: " + shape1.getArea()); // Square's area: 400

        Shape shape2 = getShape(RECTANGLE);
        shape2.setHeight(10);
        shape2.setWidth(20);
        System.out.println(RECTANGLE + "'s area: " + shape2.getArea()); // Rectangle's area: 200
    }

    /**
     * Simple factory method
     */
    static Shape getShape(String inShapeType) {

        if (inShapeType.equals(SQUARE)) {
            return new Square();
        }

        if (inShapeType.equals(RECTANGLE)) {
            return new Rectangle();
        }

        return null;
    }
}

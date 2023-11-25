package com.github.vanechka.Figure.classes;

import java.util.ArrayList;

public class Figure {

    public static final int DEGREE = 2;
    public static final int THREE = 3;
    public static final int FOUR = 4;
    public static final int FIVE = 5;
    public static final int SIX = 6;
    public static final int EIGHT = 8;
    public static final int NINE = 9;
    public static final int TWELVE = 12;
    public static final int INDEX_TWO = 2;
    public static final int INDEX_THREE = 3;
    public static final int INDEX_FOUR = 4;
    public static final int INDEX_FIVE = 5;
    public static final int INDEX_SIX = 6;
    public static final int INDEX_SEVEN = 7;
    public static final int INDEX_EIGHT = 8;
    public static final int INDEX_NINE = 9;
    public static final int INDEX_TEN = 10;
    public static final int INDEX_ELEVEN = 11;


    private ArrayList<Integer> Point;
    public Figure(ArrayList<Integer> Point) {
        this.Point = Point;
    }
    public static Figure createNewFigure(String figure, ArrayList<Integer> Point, int count) {
        if (figure.equals("CIRCLE")) {
            return new Circle(Point, count);
        } else if (figure.equals("SQUARE")) {
            return new Square(Point, count);
        } else if (figure.equals("RECTANGLE")) {
            return new Rectangle(Point, count);
        } else if (figure.equals("PARALLELOGRAM")) {
            return new Parallelogram(Point, count);
        } else if (figure.equals("TRIANGLE")) {
            return new Triangle(Point, count);
        } else if (figure.equals("POLYGON")) {
            return new Polygon(Point, count);
        } else if (figure.equals("SPHERE")) {
            return new Sphere(Point, count);
        } else if (figure.equals("TRUNCATED_SPHERE")) {
            return new TruncatedSphere(Point, count);
        } else if (figure.equals("CYLINDER")) {
            return new Cylinder(Point, count);
        } else if (figure.equals("CONE")) {
            return new Cone(Point, count);
        } else if (figure.equals("FIGURE")) {
            return new Figure(Point);
        }
        return null;
    }
    public boolean isFigureValid() {
        return true;
    }
    public void areaFigure() {
        System.out.println("The figure has no area");
    }
    public void perimetrFigure() {
        System.out.println("The figure has no perimeter");
    }
}
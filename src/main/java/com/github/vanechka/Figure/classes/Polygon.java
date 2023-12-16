package com.github.vanechka.Figure.classes;

import java.util.ArrayList;
import java.util.Objects;

public class Polygon extends Figure {

    private ArrayList<Integer> point;
    private int count;
    public Polygon(ArrayList<Integer> point, int count) {
        super(point);
        this.point = point;
        this.count = count;
    }

    @Override
    public boolean isFigureValid() {
        int k = 0;
        if (point.size() % 2 == 0 && point.size() > FIVE) {
            for (int i = 0; i < point.size() / 2; i += 2) {
                if (!Objects.equals(point.get(i), point.get(i + 2)) || !Objects.equals(point.get(i + 1), point.get(i + THREE))) {
                    k += 1;
                }
            }
            return k >= 2;
        } else if (point.size() % THREE == 0 && point.size() > EIGHT) {
            for (int i = 0; i < point.size() / 3; i += THREE) {
                if (!Objects.equals(point.get(i), point.get(i + THREE)) || !Objects.equals(point.get(i + 1), point.get(i + FOUR)) || !Objects.equals(point.get(i + DEGREE), point.get(i + FIVE))) {
                    k += 1;
                }
            }
            return k >= DEGREE;
        }
        return false;
    }

    @Override
    public double areaFigure() {
        if (point.size() % 2 == 0) {
            double sum = 0;
            for (int i = 0; i < count - 1; ++i) {
                sum += (point.get(2 * i) * point.get(2 * i + THREE) - point.get(2 * i + 2) * point.get(2 * i + 1));
            }
            double res = 0.5 * Math.abs(sum + point.get(point.size() - 2) * point.get(1) - point.get(0) * point.get(point.size() - 1));
            System.out.printf("%.2f", res);
        }
        return 0;
    }

    @Override
    public float perimetrFigure() {
        double area = 0;
        for (int i = 0; i < point.size() - 2; i += DEGREE) {
            double side = Math.sqrt(Math.pow(point.get(i) - point.get(i + DEGREE), DEGREE) + Math.pow(point.get(i + 1) - point.get(i + THREE), DEGREE));
            area += side;
        }
        area += Math.sqrt(Math.pow(point.get(0) - point.get(point.size() - DEGREE), DEGREE) + Math.pow(point.get(1) - point.get(point.size() - 1), DEGREE));
        System.out.printf("%.2f", area);
        return 0;
    }
}
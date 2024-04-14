package org.example;

import java.util.ArrayList;

import static java.lang.Double.NaN;

public class Quadratic {

    public ArrayList<Double> solve(double a, double b, double c, double delta) {

        ArrayList<Double> solve = new ArrayList<>();
        double d = b * b - 4 * a * c;

        if (Math.abs(a) < delta) {
            return null;
        }
        double x1 = (-1 * b + Math.sqrt(d)) / (2 * a);
        double x2 = (-1 * b - Math.sqrt(d)) / (2 * a);
        if (x1 != NaN) {
            solve.add(x1);
            if (Math.abs(x1 - x2) > delta) {
                solve.add(x2);
            }
        }
        return solve;
    }

}

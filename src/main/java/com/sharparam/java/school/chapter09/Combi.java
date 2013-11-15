package com.sharparam.java.school.chapter09;

import java.awt.*;

/**
 * User: Sharparam
 * Date: 2013-11-15
 * Time: 10:22
 */
public class Combi extends Car {
    public Combi() {
        this("Volvo", 2000, 200000, 3, Color.gray);
    }

    public Combi(String brand, int year, int price, int carSize, Color color) {
        super(brand, year, price, carSize, color);

        chassisCoordsX[6] += 15;

        chassisCoordsY[4] = 32;
        chassisCoordsY[6] = 0;

        windowCoordsX[1] += 20;
        windowCoordsX[2] += 20;
    }
}

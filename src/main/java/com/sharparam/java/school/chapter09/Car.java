package com.sharparam.java.school.chapter09;

import javax.swing.*;
import java.awt.*;

/**
 * User: Sharparam
 * Date: 2013-11-14
 * Time: 09:27
 */
public class Car extends JPanel {
    protected String brand;
    protected int year;
    protected int carSize;
    protected int price;
    protected Color color;

    protected int[] chassisCoordsX;
    protected int[] chassisCoordsY;

    protected int[] windowCoordsX;
    protected int[] windowCoordsY;

    protected int[] tire;

    protected int rightTireOffset;

    public Car() {
        this("Volvo", 2000, 200000, 3, Color.gray);
    }

    public Car(String brand, int year, int price, int carSize, Color color) {
        this.brand = brand;
        this.year = year;
        this.carSize = carSize;
        this.price = price;
        this.color = color;

        int spacing = this.carSize * 5;

        chassisCoordsX = new int[] {
                0, 0, 16, 89 + spacing, 109 + spacing, 109 + spacing,
                85 + spacing, 77 + spacing, 48, 40};

        chassisCoordsY = new int[] {20, 32, 36, 36, 28, 12, 8, 0, 0, 12};

        windowCoordsX = new int[] {42, 77 + spacing, 73 + spacing, 48};

        windowCoordsY = new int[] {14, 14, 4, 4};

        tire = new int[] {15, 25, 22, 22};

        rightTireOffset = 53 + spacing;

        setPreferredSize(new Dimension(112 + this.carSize * 5, 48));
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public int getCarSize() {
        return carSize;
    }

    public int getPrice() {
        return price;
    }

    public int getPrice(int year) {
        int price = this.price - 10000 * (year - this.year);
        if (price < 10000)
            price = 10000;
        return price;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return brand + " " + year;
    }

    @Override
    public void paintComponent(Graphics g) {
        g.setColor(color);
        g.fillPolygon(chassisCoordsX, chassisCoordsY, chassisCoordsX.length);
        g.setColor(Color.white);
        g.fillPolygon(windowCoordsX, windowCoordsY, windowCoordsX.length);
        g.setColor(Color.black);
        g.fillOval(tire[0], tire[1], tire[2], tire[3]);
        g.fillOval(tire[0] + rightTireOffset, tire[1], tire[2], tire[3]);
        g.setColor(Color.gray);
        g.fillOval(tire[0] + 4, tire[1] + 4, 14, 14);
        g.fillOval(tire[0] + rightTireOffset + 4, tire[1] + 4, tire[2] - 8, tire[3] - 8);
        g.setColor(Color.white);
        g.drawString(toString(), 10, 32);
    }
}

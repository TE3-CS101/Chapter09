package com.sharparam.java.school.chapter09;

import javax.swing.*;
import java.awt.*;

/**
 * User: Sharparam
 * Date: 2013-11-14
 * Time: 08:42
 */
public class PolygonPanel extends JPanel {
    private int[] xCoords = {100, 200, 100, 200};
    private int[] yCoords = {100, 100, 200, 200};

    @Override
    public void paintComponent(Graphics g) {
        g.setColor(Color.red);
        g.drawPolygon(xCoords, yCoords, 4);
        g.setColor(Color.blue);
        g.drawLine(10, 10, 280, 280);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLocation(100, 100);
        frame.setTitle("Poly Test");
        PolygonPanel panel = new PolygonPanel();
        frame.add(panel);
        frame.setVisible(true);
    }
}

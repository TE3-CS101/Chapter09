package com.sharparam.java.school.chapter09;

import javax.swing.*;

/**
 * User: Sharparam
 * Date: 2013-11-14
 * Time: 08:46
 */
public class Main {
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

package com.sharparam.java.school.chapter09;

import javax.swing.*;
import java.awt.*;

/**
 * User: Sharparam
 * Date: 2013-11-14
 * Time: 09:47
 */
public class CarPanel extends JPanel {
    private Car volvo;
    private Car lincoln;

    private JLabel volvoLabel;
    private JLabel lincolnLabel;

    public CarPanel() {
        this("Lincoln");
    }

    public CarPanel(String brand) {
        volvo = new Car();
        lincoln = new Combi(brand, 2003, 300000, 7, Color.blue);
        add(volvo);
        add(lincoln);
        setBackground(Color.white);
        volvoLabel = new JLabel(volvo.toString() + "s värde är " + volvo.getPrice(2010));
        lincolnLabel = new JLabel(lincoln.toString() + "s värde är " + lincoln.getPrice(2010));
        add(volvoLabel);
        add(lincolnLabel);
    }

    public static void main(String[] args) {
        String brand;
        if (args.length > 0)
            brand = args[0];
        else
            brand = "Lincoln";

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocation(100, 100);
        CarPanel panel = new CarPanel(brand);
        frame.add(panel);
        frame.setVisible(true);
    }
}

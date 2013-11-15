package com.sharparam.java.school.chapter09;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * User: Sharparam
 * Date: 2013-11-14
 * Time: 08:51
 */
public class ArrayTest extends JPanel implements ActionListener {
    private static JFrame frame;
    private ColorButton[] buttons;
    private Color[] colors = new Color[]
            {
                    Color.red, Color.blue, Color.green, Color.cyan, Color.orange,
                    Color.gray, Color.white, Color.black, Color.pink, Color.yellow
            };

    public ArrayTest() {
        buttons = new ColorButton[10];
        for (int i = 0; i < buttons.length; i++) {
            ColorButton button = new ColorButton("Test", colors[i]);
            buttons[i] = button;
            add(button);
            button.addActionListener(this);
        }
    }

    public static void main(String[] args) {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLocation(100, 100);
        frame.setTitle("Array Test");
        frame.add(new ArrayTest());
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ColorButton button = (ColorButton) e.getSource();
        setBackground(button.getColor());
    }
}

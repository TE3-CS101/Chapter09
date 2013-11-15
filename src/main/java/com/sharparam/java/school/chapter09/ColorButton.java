package com.sharparam.java.school.chapter09;

import javax.swing.*;
import java.awt.*;

/**
 * User: Sharparam
 * Date: 2013-11-14
 * Time: 09:08
 */
public class ColorButton extends JButton {
    private Color color;

    public ColorButton(String text, Color color) {
        super(text);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}

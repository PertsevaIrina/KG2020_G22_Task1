package com.company;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {

    @Override
    public void paint(Graphics g) {
        Graphics2D gr = (Graphics2D) g;
        int rPizza = getHeight()/4;
        drawBackground(gr, new Color(208, 128, 128));
        drawPizzaBasis(gr, new Color (255,204,153),getWidth()/2 - rPizza , getHeight()/4, rPizza);
    }

    private void drawBackground(Graphics2D gr, Color colorBackground) {
        gr.setColor(colorBackground);
        gr.fillRect(0, 0, getWidth(), getHeight());

    }

    private void drawPizzaBasis(Graphics2D gr, Color color, int x, int y, int r) {
        gr.setColor(color);
        gr.fillOval(x, y, 2*r, 2*r);
    }
}

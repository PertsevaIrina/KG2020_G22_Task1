package com.company;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {

    @Override
    public void paint(Graphics g) {
        Graphics2D gr = (Graphics2D) g;
     drawBackground(gr, new Color (208,128,128));
    }

    private void drawBackground (Graphics2D gr, Color colorBackground) {
        gr.setColor(colorBackground);
        gr.fillRect(0,0, getWidth(), getHeight());

    }
}

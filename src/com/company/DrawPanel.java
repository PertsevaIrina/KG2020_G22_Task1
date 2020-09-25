package com.company;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {

    @Override
    public void paint(Graphics g) {
        Graphics2D gr = (Graphics2D) g;
        int rPizza = getHeight() / 4;
        drawBackground(gr, new Color(208, 128, 128));
        drawPizzaBasis(gr, new Color(255, 204, 153), getWidth() / 2 - rPizza, getHeight() / 4, rPizza);

    }

    private void drawBackground(Graphics2D gr, Color colorOfBackground) {
        gr.setColor(colorOfBackground);
        gr.fillRect(0, 0, getWidth(), getHeight());

    }

    private void drawPizzaBasis(Graphics2D gr, Color color, int x, int y, int r) {
        gr.setColor(color);
        gr.fillOval(x, y, 2 * r, 2 * r);
    }

    /* private  void drawSmokedSausage (Graphics2D gr, Color colorOfMeat, Color colorOfFat, int x, int y, int rOfMeat, int rOfFat ) {
         gr.setColor(colorOfMeat);
         gr.fillOval(x,y,2*rOfMeat, 2*rOfMeat);
         gr.fillOval();
     }*/
    private void drawOlive(Graphics2D gr, Color colorOfOlive, Color colorOfOliveCentre, int x, int y, int width) {
        gr.setColor(colorOfOlive);
        int widthOfOlive = width;
        int heightOfOlive = widthOfOlive / 2;
        int widthOfOliveCenter = width / 2;
        int heightOfOliveCenter = widthOfOliveCenter / 2;
        gr.fillOval(x - widthOfOlive / 2, y - heightOfOlive / 2, widthOfOlive, heightOfOlive);
        gr.setColor(colorOfOliveCentre);
        gr.fillOval(x - widthOfOliveCenter / 2, y - heightOfOliveCenter / 2, widthOfOliveCenter, heightOfOliveCenter);
    }

    private void drawPieceOfCheese(Graphics2D gr, Color color, int x, int y, int width) {
        gr.setColor(color);
        gr.fillRect(x, y, width, width / 6);
    }


}

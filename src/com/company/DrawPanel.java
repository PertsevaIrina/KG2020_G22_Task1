package com.company;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {

    @Override
    public void paint(Graphics g) {
        Graphics2D gr = (Graphics2D) g;
        int rPizza = getHeight() / 4;
        int xPizza = getWidth() / 2;
        int yPizza = getHeight() / 2;
        int countOfOlives = 100;
        int widthOfOlive = 15;
        int countOfSmokeSausage = 10;
        int rOfSmokedSausage = 30;
        int rOfFat = 3;
        int countOfPieceOfCheese = 400;
        int sizeOfCheese = 10;
        drawBackground(gr, new Color(208, 128, 128));
        drawPizzaBasis(gr, new Color(255, 204, 153), xPizza, yPizza, rPizza);
        for (int i = 0; i < countOfOlives; i++) {
            double r = rPizza * Math.sqrt(Math.random()) - widthOfOlive;
            double theta = 2 * Math.PI * Math.random();
            double x = r * Math.cos(theta);
            double y = r * Math.sin(theta);
            drawOlive(gr, new Color(102, 153, 51), new Color(255, 204, 153), (int) x + xPizza, (int) y + yPizza, widthOfOlive);
        }
        for (int i = 0; i < countOfSmokeSausage; i++) {
            double r = rPizza * Math.sqrt(Math.random()) - rOfSmokedSausage;
            double theta = 2 * Math.PI * Math.random();
            double x = r * Math.cos(theta);
            double y = r * Math.sin(theta);
            drawSmokedSausage(gr, new Color(204,102,102), new Color ( 255, 204,204),(int)x + xPizza, (int)y + yPizza, rOfSmokedSausage, rOfFat);
        }
        for (int i = 0; i < countOfPieceOfCheese; i++) {
            double r = rPizza * Math.sqrt(Math.random()) - sizeOfCheese;
            double theta = 2 * Math.PI * Math.random();
            double x = r * Math.cos(theta);
            double y = r * Math.sin(theta);
            drawPieceOfCheese(gr, new Color (255,204,0) , (int)x + xPizza, (int)y+yPizza, sizeOfCheese );
        }





    }

    private void drawBackground(Graphics2D gr, Color colorOfBackground) {
        gr.setColor(colorOfBackground);
        gr.fillRect(0, 0, getWidth(), getHeight());

    }

    private void drawPizzaBasis(Graphics2D gr, Color color, int x, int y, int r) {
        gr.setColor(color);
        gr.fillOval(x - r, y - r, 2 * r, 2 * r);
    }

    private void drawSmokedSausage(Graphics2D gr, Color colorOfMeat, Color colorOfFat, int x, int y, int rOfMeat, int rOfFat) {
        gr.setColor(colorOfMeat);
        gr.fillOval(x - rOfMeat, y - rOfMeat, 2 * rOfMeat, 2 * rOfMeat);
        gr.setColor(colorOfFat);
        for (int i = 0; i < 25; i++) {
            double r = rOfMeat * Math.sqrt(Math.random()) - 2 * rOfFat;
            double theta = 2 * Math.PI * Math.random();
            double xOfFat = r * Math.cos(theta);
            double yOfFat = r * Math.sin(theta);
            gr.fillOval((int) xOfFat + x, (int) yOfFat + y, 2*rOfFat, 2*rOfFat);
        }

    }

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

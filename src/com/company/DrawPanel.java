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
       /* int countOfOlives = 100;
        int widthOfOlive = 15;
        int countOfSmokeSausage = 20;
        int rOfSmokedSausage = 30;
        int rOfFat = 3;
        int countOfPieceOfCheese = 400;
        int sizeOfCheese = 10;*/
        int[] xPolygon = {getWidth()*5/32,getWidth()*3/16, getWidth()*7/32};
        int[] yPolygon = {getHeight()*3/4,getHeight()*1/2,getHeight()*3/4};
        int xOfStick = getWidth()*11/64;
        int yOfStick = getHeight()*3/4;
        int widthOtStick = getWidth()*2/64;
        int heightOfStick = getHeight()*7/64;

        drawBackground(gr, new Color(208, 128, 128), Color.RED);
        drawPizzaBasis(gr, new Color(255, 153, 0), xPizza, yPizza, rPizza);
        drawKnife(gr, new Color (153,051,000), Color.GRAY,xPolygon, yPolygon,xOfStick, yOfStick,widthOtStick,heightOfStick );

       /* for (int i = 0; i < countOfOlives; i++) {
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
            drawSmokedSausage(gr, new Color(204, 51, 51), new Color(255, 204, 204), (int) x + xPizza, (int) y + yPizza, rOfSmokedSausage, rOfFat);
        }
        for (int i = 0; i < countOfPieceOfCheese; i++) {
            double r = rPizza * Math.sqrt(Math.random()) - sizeOfCheese;
            double theta = 2 * Math.PI * Math.random();
            double x = r * Math.cos(theta);
            double y = r * Math.sin(theta);
            drawPieceOfCheese(gr, new Color(255, 204, 0), (int) x + xPizza, (int) y + yPizza, sizeOfCheese);
        }*/
    }

    private void drawBackground(Graphics2D gr, Color colorOfBackground, Color colorOfTablecloth) {
        Background background = new Background(colorOfBackground, colorOfTablecloth, getWidth(), getHeight());
        background.draw(gr);
    }

    private void drawPizzaBasis(Graphics2D gr, Color color, int x, int y, int r) {
       PizzaBasis pizzaBasis = new PizzaBasis(color,x ,y, r, gr);
       pizzaBasis.draw(gr);
    }

    /*private void drawSmokedSausage(Graphics2D gr, Color colorOfMeat, Color colorOfFat, int x, int y, int rOfMeat, int rOfFat) {
        SmokedSausage smokedSausage = new SmokedSausage(colorOfMeat,colorOfFat,x,y,rOfMeat,rOfFat);
        smokedSausage.draw(gr);
    }*/


   /* private void drawOlive(Graphics2D gr, Color colorOfOlive, Color colorOfOliveCentre, int x, int y, int width) {
        Olive olive = new Olive(colorOfOlive, colorOfOliveCentre, width, x, y);
        olive.draw(gr);
    }*/

    private void drawPieceOfCheese(Graphics2D gr, Color color, int x, int y, int width) {
        PieceOfCheese pieceOfCheese = new PieceOfCheese(color, x, y, width);
        pieceOfCheese.draw(gr);

    }

    private void drawKnife(Graphics2D gr, Color colorOfStick, Color colorOfBlade,int[] xPolygon, int[] yPolygon, int xOfStick, int yOfStick, int widthOfStick, int heightOfStick){
        Knife knife = new Knife(colorOfStick,colorOfBlade,xPolygon,yPolygon, xOfStick, yOfStick, widthOfStick,heightOfStick);
        knife.draw(gr);
    }



}

package com.company;

import java.awt.*;

public class PizzaBasis implements Drawable {
    private Color color;
    private int x;
    private int y;
    private int r;
    private Graphics2D gr;



    public PizzaBasis(Color color, int x, int y, int r, Graphics2D gr) {
        this.color = color;
        this.x = x;
        this.y = y;
        this.r = r;
        this.gr = gr;

    }

    @Override
    public void draw(Graphics gr ) {
        gr.setColor(color);
        gr.fillOval(x - r, y - r, 2 * r, 2 * r);
        for (int i = 0; i < countOfSmokeSausage; i++) {
            double rOfRandomSausage = r * Math.sqrt(Math.random()) - rOfSmokedSausage;
            double theta = 2 * Math.PI * Math.random();
            double xOfRandomSausage = rOfRandomSausage * Math.cos(theta);
            double yOfRandomSausage = rOfRandomSausage * Math.sin(theta);
            SmokedSausage smokedSausage = new SmokedSausage( new Color(204, 51, 51),
                    new Color(255, 204, 204), (int) xOfRandomSausage + (int)x, (int) yOfRandomSausage + (int)y, rOfSmokedSausage, rOfFat);
            smokedSausage.draw(gr);

        }

        for (int i = 0; i < countOfOlives; i++) {
            double rOfRandomOlives = r * Math.sqrt(Math.random()) - widthOfOlive;
            double theta = 2 * Math.PI * Math.random();
            double xOfRandomOlives = rOfRandomOlives * Math.cos(theta);
            double yOfRandomOlives = rOfRandomOlives * Math.sin(theta);

            Olive olive = new Olive(new Color(102, 153, 51),
                    new Color(255, 204, 153), widthOfOlive ,(int) xOfRandomOlives + (int)x, (int) yOfRandomOlives + (int)y);
            olive.draw(gr);
        }

        for (int i = 0; i < countOfPieceOfCheese; i++) {
            double rOfRandomCheese = r * Math.sqrt(Math.random()) - sizeOfCheese;
            double theta = 2 * Math.PI * Math.random();
            double xOfRandomCheese = rOfRandomCheese * Math.cos(theta);
            double yOfRandomCheese = rOfRandomCheese * Math.sin(theta);
            PieceOfCheese pieceOfCheese = new PieceOfCheese( new Color(255, 204, 0),
                    (int) xOfRandomCheese + x, (int) yOfRandomCheese + y, sizeOfCheese);
            pieceOfCheese.draw(gr);
        }


    }

    int countOfOlives = 100;
    int widthOfOlive = 15;
    int countOfSmokeSausage = 20;
    int rOfSmokedSausage = 30;
    int rOfFat = 3;
    int countOfPieceOfCheese = 400;
    int sizeOfCheese = 10;




}

package com.company;

import java.awt.*;

public class SmokedSausage implements Drawable {
    private Color colorOfMeat;
    private Color colorOfFat;
    private int x;
    private int y;
    private int rOfMeat;
    private int rOfFat;

    public SmokedSausage(Color colorOfMeat, Color colorOfFat, int x, int y, int rOfMeat, int rOfFat) {
        this.colorOfMeat = colorOfMeat;
        this.colorOfFat = colorOfFat;
        this.x = x;
        this.y = y;
        this.rOfMeat = rOfMeat;
        this.rOfFat = rOfFat;
    }

    @Override
    public void draw(Graphics gr) {
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
}
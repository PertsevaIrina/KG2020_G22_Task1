package com.company;

import java.awt.*;

public class Knife implements Drawable {

    private  Color colorOfStick;
    private Color colorOfBlade;
    private int[] xPolygon;
    private int[] yPolygon;
    private int xOfStick;
    private int yOfStick;
    private int widthOfStick;
    private int heightOfStick;


    public Knife(Color colorOfStick, Color colorOfBlade, int[] xPolygon, int[] yPolygon, int x, int y, int  widthOtStick, int heightOfStick) {
        this.colorOfStick = colorOfStick;
        this.colorOfBlade = colorOfBlade;
        this.xPolygon = xPolygon;
        this.yPolygon = yPolygon;
        this.xOfStick = x;
        this.yOfStick = y;
        this.widthOfStick = widthOtStick;
        this.heightOfStick = heightOfStick;

    }

    @Override
    public void draw(Graphics gr) {
        gr.setColor(colorOfBlade);
        gr.fillPolygon(xPolygon, yPolygon, 3);
        gr.setColor(colorOfStick);
        gr.fillRect(xOfStick, yOfStick, widthOfStick, heightOfStick );
    }
}

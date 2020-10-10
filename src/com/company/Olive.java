package com.company;

import java.awt.*;

public class Olive implements Drawable{
    private Color colorOfOlive;

    private Color colorOfOliveCentre;
    private int width;
    private int x;
    private int y;

    public Olive(Color colorOfOlive, Color colorOfOliveCentre, int width, int x, int y) {
        this.colorOfOlive = colorOfOlive;
        this.colorOfOliveCentre = colorOfOliveCentre;
        this.width = width;
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw(Graphics gr) {
        gr.setColor(colorOfOlive);
        int widthOfOlive = width;
        int heightOfOlive = widthOfOlive / 2;
        int widthOfOliveCenter = width / 2;
        int heightOfOliveCenter = widthOfOliveCenter / 2;
        gr.fillOval(x - widthOfOlive / 2, y - heightOfOlive / 2, widthOfOlive, heightOfOlive);
        gr.setColor(colorOfOliveCentre);
        gr.fillOval(x - widthOfOliveCenter / 2, y - heightOfOliveCenter / 2, widthOfOliveCenter, heightOfOliveCenter);

    }
}

package com.company;

import java.awt.*;

public class PieceOfCheese implements Drawable {
    private Color color;
    private int x;
    private int y;
    private int width;

    public PieceOfCheese(Color color, int x, int y, int width) {
        this.color = color;
        this.x = x;
        this.y = y;
        this.width = width;
    }

    @Override
    public void draw(Graphics gr) {
        gr.setColor(color);
        gr.fillRect(x, y, width, width / 6);
    }
}


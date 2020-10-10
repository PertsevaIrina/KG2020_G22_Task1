package com.company;

import java.awt.*;

public class Background implements Drawable {
        private Color colorOfTablecloth;
        private Color colorOfBackground;
        private int width;
        private int height;

    public Background(Color colorOfBackground, Color colorOfTablecloth, int width, int height) {
        this.colorOfBackground = colorOfBackground;
        this.colorOfTablecloth = colorOfTablecloth;
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics gr) {
        gr.setColor(colorOfBackground);
        gr.fillRect(0, 0, width, height);
        gr.setColor(colorOfTablecloth);
        gr.fillRect(width*1/8, height*1/8, width*3/4, height*3/4);
    }
}

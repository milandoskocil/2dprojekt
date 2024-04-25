package org.example.entities;

import org.example.directions.Directions;

import java.awt.image.BufferedImage;

public class Player {

    private BufferedImage img;
    private int x;
    private int y;

    public Player(BufferedImage img) {
        this.img = img;
        this.x = x;
        this.y = y;
    }

    public void setImg(BufferedImage img) {
        this.img = img;
    }

    public BufferedImage getImg() {
        return img;

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void move(Directions d){
        switch (d){
            case UP:
                y -= playerSpeed;
                break;
            case DOWN:
                y += playerSpeed;
                break;
            case LEFT:
                x -= playerSpeed;
                break;
            case RIGHT:
                x += playerSpeed;
                break;
        }
    }
}

package org.example.logic;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GameGraphics extends JFrame {

    private GameLogic logic;
    private KeyListener keyListener;

    public GameGraphics(GameLogic logic) throws HeadlessException {
        this.logic = logic;
        this.keyListener = new org.example.KeyListeners.KeyListener(logic);

        setSize(720, 720);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        logic.getPlayer().setImg(loadImage("player.png"));

        Draw draw = new Draw();
        add(draw);

        setVisible(true);
    }

    public void update(GameLogic logic){
        this.logic = logic;
        repaint();
    }


    public static BufferedImage loadImage(String image){
        BufferedImage img;

        try {
            img = ImageIO.read(new File("src/main/resources/" + image));
            img = resizeImage(img, 75, 75);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return img;
    }

    public static BufferedImage resizeImage(BufferedImage originalImage, int targetWidth, int targetHeight) {
        BufferedImage resizedImage = new BufferedImage(targetWidth, targetHeight, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = resizedImage.createGraphics();
        g.drawImage(originalImage, 0, 0, targetWidth, targetHeight, null);
        g.dispose();
        return resizedImage;
    }

    public class Draw extends JPanel{
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            g.drawImage(logic.getPlayer().getImg(), 0, 0, null);
        }
    }
}

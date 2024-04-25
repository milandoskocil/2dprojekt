package org.example.logic;

public class Game {
    private GameGraphics gameGraphics;
    private GameLogic logic;

    public static void main(String[] args) {
        new Game();
    }

    public Game() {
        this.logic = new GameLogic();
        this.gameGraphics = new GameGraphics(logic);

        run();
    }

    private void run() {


        long lastFrame = 1;
        double idealFrame = 1000000000.0 / 120;

        int frames = 0;
        while(true){
            long now = System.nanoTime();
            if(now - lastFrame >= idealFrame){
                lastFrame = now;

                frames++;
                if (frames >= 120){
                    System.out.println(frames);
                    frames = 0;
                }
                gameGraphics.update(logic);

            }
        }
    }
}

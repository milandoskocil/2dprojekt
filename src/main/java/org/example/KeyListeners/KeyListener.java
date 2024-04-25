package org.example.KeyListeners;

import org.example.directions.Directions;
import org.example.logic.GameLogic;

import java.awt.event.KeyEvent;

public class KeyListener implements java.awt.event.KeyListener {

    private GameLogic logic;

    public KeyListener(GameLogic logic) {
        this.logic = logic;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()){
            case KeyEvent.VK_W ->
                logic.getPlayer().move(Directions.UP);
            case KeyEvent.VK_S ->
                logic.getPlayer().move(Directions.DOWN);
            case KeyEvent.VK_A ->
                logic.getPlayer().move(Directions.LEFT);
            case KeyEvent.VK_D ->
                logic.getPlayer().move(Directions.RIGHT);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}

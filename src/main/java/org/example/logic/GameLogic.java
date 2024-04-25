package org.example.logic;

import org.example.entities.Player;

public class GameLogic {
    private Player player;

    public GameLogic() {
        player = new Player(null);
    }

    public Player getPlayer() {
        return player;
    }
}

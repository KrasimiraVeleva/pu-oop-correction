package game;

import javax.swing.*;
import java.awt.*;

public class GameTile extends JFrame {

    public static final int TILE_SIZE = 100;
    private int row;
    private int col;

    public GameTile(int row, int col) {

        this.row = row;
        this.col = col;
    }

    /**
     * Метод изобразяващ огражденията около плочките на игралната дъска
     * @param g Graphics object
     */
    public void boardGrid(Graphics g) {
        g.setColor(Color.black);

        for(int i = 0; i <= 1200; i += 100) {
            for(int k = 0; k <= 1200; k += 90) {
                g.drawRect(i, k, 100, 90);
            }
        }
    }

    void render(Graphics g) {
        boardGrid(g);
    }
}
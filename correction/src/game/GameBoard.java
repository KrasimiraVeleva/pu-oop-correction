package game;

import monsters.*;
import javax.swing.*;
import java.awt.*;

public class GameBoard extends JFrame {

    public static final int TILE_SIDE_COUNT = 10;
    private GameTile[][] tiles = new GameTile[12][12];
    private GameTile chosenTile;

    public GameBoard() {

        this.setVisible(true);
        this.setSize(1200,1200);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    /**
     * @author Красимира Велева
     * Метод изобразяващ игралната дъска и чудовищата
     * @param g Graphics object
     */
    public void paint(Graphics g) {
        super.paint(g);

        for(int row = 0; row < 12; row++) {
            for(int col = 0; col < 12; col++) {

                GameTile tiles = new GameTile(row, col);
                tiles.render(g);

                DrunkenKnight dk = new DrunkenKnight(row, col);
                dk.render(g);

                SofisticatedSam ss = new SofisticatedSam(row, col);
                ss.render(g);

                SandTurtle st = new SandTurtle(row, col);
                st.render(g);

                MagicCat mc = new MagicCat(row, col);
                mc.render(g);

                RecklessCanibal rc = new RecklessCanibal(row, col);
                rc.render(g);

                DogEatingBug deb = new DogEatingBug(row, col);
                deb.render(g);
            }
        }
    }
}
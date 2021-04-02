package monsters;

import java.awt.*;
import java.util.Random;

public class MagicCat extends Figure {

    /**
     * Метод изобразяващ атрибутите на MagicCat
     * @param row ред
     * @param col колона
     */
    public MagicCat(int row, int col) {

        super(row, col);
        this.attack  = 8;
        this.defence = 5;
        this.magic   = 10;
        this.speed   = 1;
    }

    /**
     * Метод изобразяващ MagicCat на игралната дъска
     * @param g Graphics object
     */
    public void render(Graphics g) {

        g.setColor(Color.blue);
        g.fillRect(625,  25,  50, 50);
        g.fillRect(225,  113, 50, 50);
        g.fillRect(1125, 113, 50, 50);

        g.setColor(Color.blue);
        g.fillRect(25,   920,  50, 50);
        g.fillRect(1025, 1000, 50, 50);
        g.fillRect(625,  920,  50, 50);
    }

    /**
     * Метод изобразяващ фигурите на случаен принцип
     * @return rand
     */
    private int random() {

        Random random = new Random();
        int rand = random.nextInt(5);
        while (rand == 2) {
            rand = random.nextInt(5);
        }
        return rand;
    }
}
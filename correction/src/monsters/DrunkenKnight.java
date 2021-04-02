package monsters;

import java.awt.*;
import java.util.Random;

public class DrunkenKnight extends Figure {

    /**
     * Метод изобразяващ атрибутите на DrunkenKnight
     * @param row ред
     * @param col колона
     */
    public DrunkenKnight(int row, int col) {

        super(row, col);
        this.attack  = 5;
        this.defence = 5;
        this.magic   = 5;
        this.speed   = 5;
    }

    /**
     * Метод изобразяващ DrunkenKnight на игралната дъска
     * @param g Graphics object
     */
    public void render(Graphics g) {

        g.setColor(Color.RED);
        g.fillOval(25,  25, 50, 50);
        g.fillOval(525, 25, 50, 50);
        g.fillOval(725, 25, 50, 50);

        g.setColor(Color.RED);
        g.fillOval(25,  1000, 50, 50);
        g.fillOval(325, 1000, 50, 50);
        g.fillOval(825, 920,  50, 50);
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
package monsters;

import java.awt.*;
import java.util.Random;

public class RecklessCanibal extends Figure {

    /**
     * Метод изобразяващ атрибутите на RecklessCanibal
     * @param row ред
     * @param col колона
     */
    public RecklessCanibal(int row, int col) {

        super(row, col);
        this.attack  = 4;
        this.defence = 6;
        this.magic   = 8;
        this.speed   = 10;
    }

    /**
     * Метод изобразяващ RecklessCanibal на игралната дъска
     * @param g Graphics object
     */
    public void render(Graphics g) {

        g.setColor(Color.CYAN);
        g.fillOval(425,  113, 50, 50);
        g.fillOval(925,  25,  50, 50);
        g.fillOval(1125, 25,  50, 50);

        g.setColor(Color.CYAN);
        g.fillOval(225,  920,  50, 50);
        g.fillOval(725,  1000, 50, 50);
        g.fillOval(1125, 1000, 50, 50);
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
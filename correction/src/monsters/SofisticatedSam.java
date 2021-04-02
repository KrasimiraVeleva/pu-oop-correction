package monsters;

import java.awt.*;
import java.util.Random;

public class SofisticatedSam extends Figure {

    /**
     * Метод изобразяващ атрибутите на SofisticatedSam
     * @param row ред
     * @param col колона
     */
    public SofisticatedSam(int row, int col) {

        super(row, col);
        this.attack  = 10;
        this.defence = 5;
        this.magic   = 4;
        this.speed   = 1;
    }

    /**
     * Метод изобразяващ SofisticatedSam на игралната дъска
     * @param g Graphics object
     */
    public void render(Graphics g) {

        g.setColor(Color.YELLOW);
        g.fillRect(125, 25,  50, 50);
        g.fillRect(325, 25,  50, 50);
        g.fillRect(625, 113, 50, 50);

        g.setColor(Color.YELLOW);
        g.fillRect(125, 1000, 50, 50);
        g.fillRect(725, 920,  50, 50);
        g.fillRect(825, 1000, 50, 50);
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
package monsters;

import java.awt.*;
import java.util.Random;

public class SandTurtle extends Figure {

    /**
     * Метод изобразяващ атрибутите на SandTurtle
     * @param row ред
     * @param col колона
     */
    public SandTurtle(int row, int col) {

        super(row, col);
        this.attack  = 5;
        this.defence = 10;
        this.magic   = 1;
        this.speed   = 4;
    }

    /**
     * Метод изобразяващ SandTurtle на игралната дъска
     * @param g Graphics object
     */
    public void render(Graphics g) {

        g.setColor(Color.pink);
        g.fillOval(225,  25,  50, 50);
        g.fillOval(825,  113, 50, 50);
        g.fillOval(1025, 25,  50, 50);

        g.setColor(Color.pink);
        g.fillOval(325, 920,  50, 50);
        g.fillOval(925, 920,  50, 50);
        g.fillOval(525, 1000, 50, 50);
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
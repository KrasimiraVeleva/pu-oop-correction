package monsters;

import java.awt.*;
import java.util.Random;

public class DogEatingBug extends Figure {

    /**
     * Метод изобразяващ атрибутите на DogEatingBug
     * @param row ред
     * @param col колона
     */
    public DogEatingBug(int row, int col) {

        super(row, col);
        this.attack  = 10;
        this.defence = 2;
        this.magic   = 8;
        this.speed   = 5;
    }

    /**
     * Метод изобразяващ DogEatingBug на игралната дъска
     * @param g Graphics object
     */
    public void render(Graphics g) {

        g.setColor(Color.MAGENTA);
        g.fillRect(825, 25,  50, 50);
        g.fillRect(925, 113, 50, 50);
        g.fillRect(325, 113, 50, 50);

        g.setColor(Color.MAGENTA);
        g.fillRect(225, 1000, 50, 50);
        g.fillRect(925, 1000, 50, 50);
        g.fillRect(525, 920,  50, 50);
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
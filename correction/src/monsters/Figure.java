package monsters;

public class Figure {

    protected int row;
    protected int col;
    protected int attack;
    protected int defence;
    protected int magic;
    protected int speed;

    public Figure(int row, int col) {

        this.row = row;
        this.col = col;
    }

    public void move(int row, int col) {

        this.row = row;
        this.col = col;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefence() {
        return defence;
    }

    public int getMagic() {
        return magic;
    }

    public int getSpeed() {
        return speed;
    }
}
package Skillfactory;

public class Tank {

    private int positionX, positionY;
    private int turn;
    private int fuel;
    private String name = "T34-" + count;
    private static int count = 1;

    public Tank(int positionX, int positionY, int fuel) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.fuel = fuel;
        count++;
    }

    public Tank() {
        this(0,0,100);
        count++;
    }

    public Tank(int positionX, int positionY) {
        this(positionX,positionY, 100);
        count++;
    }

    public int goForward(int i) {
        if (i > fuel) i = fuel;
        if (turn == 0) {
            positionX += i;
            return fuel -= i;
        } else if (turn == 1) {
            positionY += i;
            return fuel -= i;
        } else if (turn == 2) {
            positionX -= i;
            return fuel -= i;
        } else {
            positionY -= i;
            return fuel -= i;
        }
    }

    public int goBackward(int i) {
        if (i < 0) i *= -1;
        if (i > fuel) i = fuel;
        if (turn == 0) {
            positionX += i;
            return fuel -= i;
        } else if (turn == 1) {
            positionY -= i;
            return fuel -= i;
        } else if (turn == 2) {
            positionX -= i;
            return fuel -= i;
        } else {
            positionY += i;
            return fuel -= i;
        }
    }

    public void printPosition() {
        System.out.printf("The Tank %s is at %d %d now.", name, positionX, positionY);
        System.out.println();
    }

    public void turnRight() {
        turn++;
        if (turn == 4) turn = 0;
    }

    public void turnLeft() {
        turn--;
        if (turn == -1) turn = 3;
    }
}

class Test1 {

    public static void main(String[] args) {
        Tank justTank = new Tank();
// В (10;20) с fuel = 100
        Tank anywareTank = new Tank(10, 10);
// В (20;30) с fuel = 200
        Tank customTank = new Tank(20, 30, 200);
        justTank.goForward(200);
        justTank.printPosition();
        anywareTank.goBackward(-200);
        anywareTank.printPosition();
        customTank.goForward(201);
        customTank.printPosition();
    }
}



package Skillfactory.PervujUrovenZadach;

public class LimitingRectangle {

    private int up;
    private int down;
    private int left;
    private int right;
    int[][] points;

    LimitingRectangle(int[][] points) {
        this.points = points;
    }

    public int getWidth() {
        int width = 0;
        left = points[0][0];
        for (int i = 0; i < points.length; i++) {
            if (points[i][0] < left) {
                left = points[i][0];
            }
        }
        right = points[0][0];
        for (int i = 0; i < points.length; i++) {
            if (points[i][0] > right) {
                right = points[i][0];
            }
        }
        if (right < 0) {
            width = left - right;
            return -width;
        } else {
            width = right - left;
            return width;
        }
    }

    public int getHeight() {
        int height;
        down = points[0][1];
        for (int i = 0; i < points.length; i++) {
            if (points[i][1] < down) {
                down = points[i][1];
            }
        }
        up = points[0][1];
        for (int i = 0; i < points.length; i++) {
            if (points[i][1] > up) {
                up = points[i][1];
            }
        }
        if (up < 0) {
            height = down - up;
            return -height;
        }
        else {
            height = up - down;
            return height;
        }
    }

    public String getBorders() {
        String s = down + ", " + up + ", " + left + ", " + right;
        return s;
    }
}

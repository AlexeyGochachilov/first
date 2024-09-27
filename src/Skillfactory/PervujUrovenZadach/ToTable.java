package Skillfactory.PervujUrovenZadach;

public class ToTable {

    final int[] data;
    final int x;
    final int y;

    ToTable(int[] data, int x, int y) {
        this.data = data;
        this.x = x;
        this.y = y;
    }

    public int[][] resize() {
        int[][] array = new int[x][y];
        for (int i = 0; i < x; i++) {
        System.arraycopy(data,(i*y),array[i],0,y);
        }
        return array;
    }
}

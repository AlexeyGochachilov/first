package Skillfactory.PervujUrovenZadach;

public class ToLine {

    final int[][] data;

    ToLine(int[][] data) {
        this.data = data;
    }

    public int[] resize(){
        int x = data.length, y = data[0].length;
        int[] array = new  int[(x*y)];
        for (int i = 0; i < x; i++){
        System.arraycopy(data[i],0,array,(i*y),y);
        }
        return array;
    }
}

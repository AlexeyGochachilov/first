package Skillfactory.PervujUrovenZadach;


import java.util.Arrays;

public class Separator {

    int[] array;

    Separator(int[] array) {
        this.array = array;
    }

    public int[] even() {
        int i = 0;
        int j = 0;
        int[] even = new int[array.length];
        while (i < array.length) {
            if (array[i] % 2 == 0) {
                even[j] = array[i];
                j++;
            }
            i++;
        }
        even = Arrays.copyOf(even, j);
        return even;
    }

    public int[] odd() {
        int i = 0;
        int j = 0;
        int[] odd = new int[array.length];
        while (i < array.length) {
            if (array[i] % 2 != 0) {
                odd[j] = array[i];
                j++;
            }
            i++;
        }
        odd = Arrays.copyOf(odd, j);
        return odd;
    }
}


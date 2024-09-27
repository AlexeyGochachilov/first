package Skillfactory;

import java.util.Arrays;

public class Arr {
    public static void main(String[] args) {
        int[] num5_15 = new int[11];
        for (int i = 0; i < num5_15.length; i++) {
            num5_15[i] = 5 + i;
            if (num5_15[i] != num5_15[10]) {
                System.out.print(num5_15[i] + ", ");
            }
            else {
                System.out.println(num5_15[i]);
            }
            }
        System.out.println();
        System.out.println(Arrays.toString(num5_15));
        String s1 = "Sometimes";
        System.out.println(s1.charAt(2));
    }
}

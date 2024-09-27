package Skillfactory;

public class Dz {

    public static void main(String[] args) {
        String plaers = "Саша, Игорь, Миша, Коля, Владимир";
        int[][] bal = {{5, 4, 5, 4, 5},
                {4, 5, 4, 5, 4},
                {5, 4, 3, 4, 5},
                {3, 4, 5, 4, 3},
                {4, 2, 5, 3, 5}};
        String[] arr = plaers.split(", ");
        int[] sum = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < bal[i].length; j++) {
                sum[i] += bal[i][j];
            }
            System.out.println(arr[i] = arr[i] + sum[i]);
        }

    }
}
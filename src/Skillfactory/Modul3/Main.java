package Skillfactory.Modul3;

public class Main {
    public static void main(String[] args) {
        double[] arr = {1.3, 3.2, 5.1, 4.7};

        for (double i : arr) {
            System.out.println(i);
        }

        double sum = 0;
        double max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] > max) max = arr[i];
        }
        System.out.println("Сумма всех чисел " + sum);
        System.out.println("Самое большое число " + max);
    }
}

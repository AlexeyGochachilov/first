package Skillfactory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isCorrectName = false;
        while (!isCorrectName) {
            String name = scanner.nextLine(); //Считывает строку из System.in
            isCorrectName = checkName(name);
            if (!isCorrectName) {
                System.out.println("Введите корректное имя!");
            } else {
                System.out.println(formatName(name));
            }
            sortByLength(name.split(" "));

        }
    }

    private static boolean checkName(String name) {
        //Написать код здесь
        String s2 = " Ivan Ivanovich Ivanov ".trim();
        name = name.trim();
        if (name.split(" ").length == s2.split(" ").length) {
            return true;
        } else {
            System.out.println("Введите имя ещё раз");
            return false;
        }
    }

    private static String formatName(String name) {
        //Написать код здесь
        String s21 = "";
        s21 = s21 + name.substring(0, 1).toUpperCase(); //первый символ делаем заглавным
        for (int i = 1; i < name.length(); i++) {
            // смотрим, был ли слева пробел:
            if (" ".equals(name.substring(i - 1, i)))
                s21 = s21 + name.substring(i, i + 1).toUpperCase();
            else
                s21 = s21 + name.substring(i, i + 1);
        }
        return s21;
    }

    private static void sortByLength(String[] words) {
        //Написать код здесь
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                String sti = words[i];
                String stj = words[j];
                if (stj.length() < sti.length()) {
                    words[i] = words[j];
                    words[j] = sti;
                }
            }
        }
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i]);
            System.out.println();
        }
    }
}




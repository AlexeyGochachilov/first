package Skillfactory.PervujUrovenZadach;

import java.util.Arrays;

public class SeaBord {

    private String[][] field;
    int line;
    int column;
    public static final String m = "m";
    public static final String h = "h";
    public static final String d = "d";

    SeaBord() {
       field = new String[10][10];
       for (int i = 0; i < field.length; i++){
           for (int j = 0; j < field[i].length; j++){
               field[i][j] = ".";
           }
       }
    }

    public String[][] getField() {

        for (int i = 0; i < field.length; i++) {
            System.out.println(Arrays.toString(field[i]));
        }
        return field;
    }

    void shoot(int line, int column, String issue) {
        this.line = line;
        this.column = column;
        if (line < 0 && line > 10) {
            System.out.println("Vvedite chislo ot 0 do 9");
        }
        if (column < 0 && column > 10) {
            System.out.println("Vvedite chislo ot 0 do 9");
        }
        if (issue.equals(m) != true && issue.equals(h) != true && issue.equals(d) != true) {
            System.out.println("Vvedite korektnyj simvol");
        }
        switch (issue) {
            case (m):
                if (this.check(line, column).equals(".")) {
                    field[line][column] = "#";
                }
                break;
            case (h):
                if (this.check(line, column).equals(".")) {
                    field[line][column] = "X";
                }
                break;
            case (d):
                if (this.check(line, column).equals(".")) {
                    sink(line, column);
                }
                break;
        }
    }

    String check(int line, int column) {
        String dot = "";
        this.line = line;
        this.column = column;

        if (field[line][column].equals(".")) {
            dot = ".";
        }
        return dot;
    }

    private void sink(int line, int column) {
        int[][] commands = new int[][]  // массив всех возможных полей,
                //которые надо поменять
                {{line - 1, column}, {line + 1, column}, // вокруг
                        //клетки, в которую попали
                        {line, column - 1}, {line, column + 1},
                        {line - 1, column - 1}, {line - 1, column + 1},
                        {line + 1, column - 1}, {line + 1, column + 1}};

        for (int[] i : commands) {
            if (0 <= i[0] && i[0] <= 9 && 0 <= i[1] && i[1] <= 9 &&
                    field[i[0]][i[1]].equals(".")) {
                field[i[0]][i[1]] = "#"; // если координаты лежат внутри
                //поля и в них не стреляли, то меняем их
            }
        }

        field[line][column] = "x"; // после того, как обработали это
        //поле, заменяем его на потопленное

        for (int[] i : commands) {
            if (0 <= i[0] && i[0] <= 9 && 0 <= i[1] && i[1] <= 9 && field[i[0]][i[1]].equals("X")) {
                sink(i[0], i[1]); // и ищем следующее, прилежащее к
                //нашему полю и так же обрабатываем его
            }
        }
        // таким образом мы рекурсивно обойдем все прилежащие поля, к
        //полю, которое подбили и прилежащие к ним.
    }

    public static void main(String[] args) {
        SeaBord sb = new SeaBord();
        sb.getField();
        System.out.println();
        sb.shoot(0, 0, m);
        sb.shoot(1, 1, h);
        sb.shoot(0, 1, d);
        sb.shoot(8, 8, h);
        sb.shoot(9,8,h);
        sb.shoot(7,8, d);
        sb.shoot(5, 5, d);

        sb.getField();
    }
}

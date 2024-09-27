package Skillfactory.PervujUrovenZadach;

import java.util.Arrays;

public class TicTacToe {

    String[][] plaingField = new String[][]{{"-", "-", "-"}, {"-", "-", "-"}, {"-", "-", "-"}};
    String[][] board = new String[][]{{"-", "-", "-"}, {"-", "-", "-"}, {"-", "-", "-"}};
    String x = "X";
    String o = "0";
    String draw = "D";
    int count = 0;
    String z = "0";
    String a = "Move completed";
    String b = "Cell x, y is already occupied";
    String c = "Player X won";
    String d = "Player 0 won";
    String e = "Draw";
    String f = "Game was ended";

    public void newGame() {
        board = plaingField;
    }

    public void getField() {
        for (int i = 0; i < board.length; i++) {
            System.out.println(Arrays.toString(board[i]));
        }
    }

    public String makeMove(int x, int y) {

        if ((Arrays.toString(board[0]).indexOf("-") == -1) && (Arrays.toString(board[1]).indexOf("-") == -1)
                && (Arrays.toString(board[2]).indexOf("-") == -1)) {
            z = e;
            System.out.println(z);
        }

        switch (count) {
            case (0):
                if (z.equals(e)) {
                    z = f;
                    System.out.println(z);
                    break;
                }
                if (z.equals(c) || z.equals(d)) {
                    z = f;
                    System.out.println(z);
                    break;
                }
                if (!board[x - 1][y - 1].equals("-")) {
                    System.out.println(b);
                    break;
                }
                board[x - 1][y - 1] = String.valueOf('X');
                z = a;
                if (board[0][0].equals(board[0][1]) && board[0][0].equals(board[0][2]) && board[0][0] != "-") {
                    if (board[0][0].equals(this.x)) {
                        z = c;
                    } else if (board[0][0].equals(this.o)) {
                        z = d;
                    }
                }
                if (board[1][0].equals(board[1][1]) && board[1][0].equals(board[1][2]) && board[1][0] != "-") {
                    if (board[1][0].equals(this.x)) {
                        z = c;
                    } else if (board[1][0].equals(this.o)) {
                        z = d;
                    }
                }
                if (board[2][0].equals(board[2][1]) && board[2][0].equals(board[2][2]) && board[0][0] != "-") {
                    if (board[2][0].equals(this.x)) {
                        z = c;
                    } else if (board[2][0].equals(this.o)) {
                        z = d;
                    }
                }
                if (board[0][0].equals(board[1][0]) && board[0][0].equals(board[2][0]) && board[0][0] != "-") {
                    if (board[0][0].equals(this.x)) {
                        z = c;
                    } else if (board[0][0].equals(this.o)) {
                        z = d;
                    }
                }
                if (board[0][1].equals(board[1][1]) && board[0][1].equals(board[2][1]) && board[0][0] != "-") {
                    if (board[0][1].equals(this.x)) {
                        z = c;
                    } else if (board[0][1].equals(this.o)) {
                        z = d;
                    }
                }
                if (board[0][2].equals(board[1][2]) && board[0][2].equals(board[2][2]) && board[0][0] != "-") {
                    if (board[0][2].equals(this.x)) {
                        z = c;
                    } else if (board[0][2].equals(this.o)) {
                        z = d;
                    }
                }
                if (board[0][0].equals(board[1][1]) && board[0][0].equals(board[2][2]) && board[0][0] != "-") {
                    if (board[0][0].equals(this.x)) {
                        z = c;
                    } else if (board[0][0].equals(this.o)) {
                        z = d;
                    }
                }
                if (board[0][2].equals(board[1][1]) && board[0][0].equals(board[2][0]) && board[0][0] != "-") {
                    if (board[0][2].equals(this.x)) {
                        z = c;
                    } else if (board[0][2].equals(this.o)) {
                        z = d;
                    }
                }
                System.out.println(z);
                count++;
                break;

            case (1):
                if (z.equals(e)) {
                    z = f;
                    System.out.println(z);
                    break;
                }
                if (z.equals(c) || z.equals(d)) {
                    z = f;
                    System.out.println(z);
                    break;
                }
                if (!board[x - 1][y - 1].equals("-")) {
                    System.out.println(b);
                    break;
                }
                board[x - 1][y - 1] = String.valueOf('0');
                z = a;
                if (board[0][0].equals(board[0][1]) && board[0][0].equals(board[0][2]) && board[0][0] != "-") {
                    if (board[0][0].equals(this.x)) {
                        z = c;
                    } else if (board[0][0].equals(this.o)) {
                        z = d;
                    }
                }
                if (board[1][0].equals(board[1][1]) && board[1][0].equals(board[1][2]) && board[1][0] != "-") {
                    if (board[1][0].equals(this.x)) {
                        z = c;
                    } else if (board[1][0].equals(this.o)) {
                        z = d;
                    }
                }
                if (board[2][0].equals(board[2][1]) && board[2][0].equals(board[2][2]) && board[0][0] != "-") {
                    if (board[2][0].equals(this.x)) {
                        z = c;
                    } else if (board[2][0].equals(this.o)) {
                        z = d;
                    }
                }
                if (board[0][0].equals(board[1][0]) && board[0][0].equals(board[2][0]) && board[0][0] != "-") {
                    if (board[0][0].equals(this.x)) {
                        z = c;
                    } else if (board[0][0].equals(this.o)) {
                        z = d;
                    }
                }
                if (board[0][1].equals(board[1][1]) && board[0][1].equals(board[2][1]) && board[0][0] != "-") {
                    if (board[0][1].equals(this.x)) {
                        z = c;
                    } else if (board[0][1].equals(this.o)) {
                        z = d;
                    }
                }
                if (board[0][2].equals(board[1][2]) && board[0][2].equals(board[2][2]) && board[0][0] != "-") {
                    if (board[0][2].equals(this.x)) {
                        z = c;
                    } else if (board[0][2].equals(this.o)) {
                        z = d;
                    }
                }
                if (board[0][0].equals(board[1][1]) && board[0][0].equals(board[2][2]) && board[0][0] != "-") {
                    if (board[0][0].equals(this.x)) {
                        z = c;
                    } else if (board[0][0].equals(this.o)) {
                        z = d;
                    }
                }
                if (board[0][2].equals(board[1][1]) && board[0][0].equals(board[2][0]) && board[0][0] != "-") {
                    if (board[0][2].equals(this.x)) {
                        z = c;
                    } else if (board[0][2].equals(this.o)) {
                        z = d;
                    }
                }
                System.out.println(z);
                count--;
                break;
        }
        return z;
    }

    public static void main(String[] args) {

        TicTacToe t = new TicTacToe();
        t.newGame();
        t.getField();
        t.makeMove(2,2);
        t.getField();
        t.makeMove(1,1);
        t.getField();
        t.makeMove(3,3);
        t.getField();
        t.makeMove(1,3);
        t.getField();
        t.makeMove(1,2);
        t.getField();
        t.makeMove(3,2);
        t.getField();
        t.makeMove(2,1);
        t.getField();
//        t.makeMove(1, 1);
//        t.makeMove(1, 2);
//        t.makeMove(1, 3);
//        t.makeMove(2, 1);
//        t.makeMove(2, 3);
//        t.makeMove(2, 2);
//        t.makeMove(3, 2);
//        t.makeMove(3, 3);
//        t.makeMove(2,3);
//        t.makeMove(3, 1);
//        t.getField();
//        t.makeMove(2, 2);
    }
}


//class TicTacToe2 {
//    String[][] field;
//    String nowPlayer;
//
//    public TicTacToe2() {
//        // создаем новую игру
//        newGame();
//    }
//
//    void newGame() {
//        // пересоздаем игру
//        field = new String[][]{{"-", "-", "-"}, {"-", "-", "-"}, {"-", "-", "-"}};
//        nowPlayer = "X";
//    }
//
//    String[][] getField() {
//        return field;
//    }
//
//    String makeMove(int x, int y) {
//        x -= 1;
//        y -= 1;
//        // проверяем ситуацию на поле
//        String check = this.checkGame();
//
//        // если не вернулось null, значит игра уже завершена (см checkField())
//        if (check != null) return "Game was ended";
//
//        // если клетка занята
//        if (!field[x][y].equals("-")) return "Cell " + (x + 1) + ", " + (y + 1) + " is already occupied";
//
//        // если же нет, то ставим X/0 и проверяем, что стало с полем после этого хода
//        field[x][y] = nowPlayer;
//        check = checkGame();
//
//        // если не вернулось null, значит этот ход завершил игру
//        if (check != null) {
//            if (check.equals("X")) return "Player X won";
//            else if (check.equals("0")) return "Player 0 won";
//            else return "Draw";
//        }
//
//        // иначе переключаем игрока на следующего
//        nowPlayer = nowPlayer.equals("X") ? "0" : "X";
//        return "Move completed";
//    }
//
//    String checkGame() {
//        // проверяем, есть ли 3 выставленных в ряд крестика или нолика
//        for (int i = 0; i < 3; i++) {
//            boolean check = true;
//            for (int j = 0; j < 3; j++) {
//                if (field[i][j].equals("0") || field[i][j].equals("-")) check = false;
//            }
//            if (check) return "X"; // если нашли 3 Х в ряд, то победа за Х
//        }
//        // тоже самое для 0
//        for (int i = 0; i < 3; i++) {
//            boolean check = true;
//            for (int j = 0; j < 3; j++) {
//                if (field[i][j].equals("X") || field[i][j].equals("-")) check = false;
//            }
//            if (check) return "0"; // если нашли 3 0 в ряд, то победа за 0
//        }
//
//        // проверяем, есть ли 3 выставленных в столбик крестика или нолика
//        for (int i = 0; i < 3; i++) {
//            boolean check = true;
//            for (int j = 0; j < 3; j++) {
//                if (field[j][i].equals("0") || field[j][i].equals("-")) check = false;
//            }
//            if (check) return "X"; // если нашли 3 Х в столбик, то победа за Х
//        }
//        // тоже самое для 0
//        for (int i = 0; i < 3; i++) {
//            boolean check = true;
//            for (int j = 0; j < 3; j++) {
//                if (field[j][i].equals("X") || field[j][i].equals("-")) check = false;
//            }
//            if (check) return "0"; // если нашли 3 0 в столбик, то победа за 0
//        }
//
//
//        // проверяем диагонали
//        String[] diagonal = {field[0][0], field[1][1], field[2][2]};
//        String[] diagonal2 = {field[0][2], field[1][1], field[2][0]};
//
//        boolean check = true;
//        for (int i = 0; i < 3; i++) {
//            if (diagonal[i].equals("0") || diagonal[i].equals("-")) check = false;
//        }
//        if (check) return "X"; // если не нашли 0 в диагонали то победа за Х
//        else {                 // иначе все тоже самое для 0
//            check = true;
//            for (int i = 0; i < 3; i++) {
//                if (diagonal[i].equals("X") || diagonal[i].equals("-")) check = false;
//            }
//            if (check) return "0"; // если в диагонали только 0, то за ними победа
//        }
//
//        // аналогично для 2 ой диагонали
//        check = true;
//        for (int i = 0; i < 3; i++) {
//            if (diagonal2[i].equals("0") || diagonal2[i].equals("-")) check = false;
//        }
//        if (check) return "X"; // если не нашли 0 в диагонали то победа за Х
//        else {                 // иначе все тоже самое для 0
//            check = true;
//            for (int i = 0; i < 3; i++) {
//                if (diagonal2[i].equals("X") || diagonal2[i].equals("-")) check = false;
//            }
//            if (check) return "0"; // если в диагонали только 0, то за ними победа
//        }
//
//        // если никто не победил
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                if (field[i][j].equals("-")) return null; // если еще есть пустые поля, то игра продолжается
//            }
//        }
//        return "D"; // иначе возвращаем ничью
//    }
//}
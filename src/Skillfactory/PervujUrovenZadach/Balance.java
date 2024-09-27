package Skillfactory.PervujUrovenZadach;

public class Balance {

    static int ves = 0;

    public static void addRight(int n){
        ves += n;
    }

    public static void addLeft(int n){
        ves -= n;
    }

    public static String getSituation(){
        String a = "";
        if (ves > 0){
            return a = "R";
        }
        else if (ves < 0){
            return a = "L";
        }
        else {
            return a = "=";
        }
    }
}

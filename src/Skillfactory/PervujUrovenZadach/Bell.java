package Skillfactory.PervujUrovenZadach;

public class Bell {
    public static int count = 0;
    public static void sound(){

        if (count == 0){
            System.out.println("ding");
            count++;
          }
        else if (count == 1){
            System.out.println("dong");
            count--;
        }

        
    }
}

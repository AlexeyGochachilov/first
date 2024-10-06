package Skillfactory.Monster;

import java.util.ArrayList;

public class Battle {

    ArrayList <Monster> array5 = new ArrayList<>();

    void add (Monster monster){
        array5.add(monster);
        if (array5.size() > 5){
            System.out.println("No more monsters!");
            array5.remove(5);
        }
    }

    void start(){
        run();
    }

    void run(){
       for(int i = 0; i < array5.size(); i++){
       array5.get(i).attack();}
    }
}

package Skillfactory.Monster.ver1;

public class GiantSnake extends Monster {


    public static String scream = "Ssssss";

    public GiantSnake(String name) {
        super(name + " the GiantSnake", 5);
    }

    public void growl() {
        System.out.print(scream);
    }

    public void growl(boolean loud) {
        if (!loud) {
            growl();
        } else {
            System.out.print(scream.toUpperCase());

        }
    }

    @Override
    public void attack(Monster monster){
        monster.damage(1);
        growl(true);
        System.out.println("     ...and hid in the grass");
    }

}


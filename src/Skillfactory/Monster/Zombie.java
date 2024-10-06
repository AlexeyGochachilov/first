package Skillfactory.Monster;

public class Zombie extends Monster{
    public Zombie(String name) {
        super(name + " the Zombie", 5);
    }

    @Override
    public void growl(){
        System.out.print("Raaaauuughhhh");
        super.growl();
    }

    @Override
    public void attack(){
        super.attack();
        growl();
    }

    public static void main(String[] args) {
        Zombie z = new Zombie("Frank");
        z.attack();
    }
}

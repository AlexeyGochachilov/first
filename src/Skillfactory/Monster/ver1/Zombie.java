package Skillfactory.Monster.ver1;

public class Zombie extends Monster {

    public Zombie(String name) {
        super(name + " the Zombie", 5);
    }

    public void growl() {
        System.out.println("Raaaauuughhhh");
    }

    @Override
    public void attack(Monster monster) {
        monster.damage(2);
        growl();
    }

}

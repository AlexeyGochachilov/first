package Skillfactory.Monster;

public abstract class Monster {
    String name;
    int halfe;
    int damage;
    int hp;
    int force;

    public Monster(String name, int damage) {
        this.name = name;
        this.damage = damage;
        System.out.println("Monster " + name + " was created");
    }

    public void growl() {
        System.out.println(name + " growled");
    }

    public void attack() {
        System.out.println("Monster " + name + " attacked with damage" + damage);
        growl();
    }
}

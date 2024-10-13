package Skillfactory.Monster.ver1;

public abstract class Monster {

    private String name;
    private int force;
    private int hp = 15;
    private boolean destroyed = false;

    public Monster(String name, int force) {
        this.name = name;
        this.force = force;
        System.out.println("Monster " + name + " was created");
    }

    protected int getForce(){
        return force;
    }

    abstract public void attack(Monster monster);

    protected boolean damage(int dhp){
        hp -= dhp;
        boolean damage;
        if (hp <= 0) damage = true;
        else damage = false;
        return damage;
    }

    public boolean isDestroyed(){
        if (this.hp == 0)
        return true;
        else return false;
    }
}

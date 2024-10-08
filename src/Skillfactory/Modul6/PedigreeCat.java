package Skillfactory.Modul6;

public class PedigreeCat extends Cat{

    private String breed;

    PedigreeCat(String name, int age, String owner, String breed){
        super(name, age, owner);
        this.breed = breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public String toString() {
        String s = "The cat " + super.getName() + " is very beautiful, although she is now " + super.getAge() +
                ", she belongs to the breed " + breed + ", and her owner " + super.getOwner() + " is very proud of her.";
        return s;
    }
}

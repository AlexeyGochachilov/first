package Skillfactory.PervujUrovenZadach;

public class Dog {

    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String bark(){
        return "woof";
    }
}

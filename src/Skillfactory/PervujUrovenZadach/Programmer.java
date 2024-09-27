package Skillfactory.PervujUrovenZadach;

public class Programmer {

    String name;
    String company;
    String position = "intern";
    int count = 0;

    public Programmer(String name, String company) {
        this.name = name;
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public String work() {
        if (count == 0) {
            count++;
            return position = "junior";
        } else if (count == 1) {
            count++;
            return position = "middle";
        } else if (count == 2) {
            count++;
            return position = "senior";
        } else if (count == 3) {
            return position = "lead";
        }
        return position;
    }
}

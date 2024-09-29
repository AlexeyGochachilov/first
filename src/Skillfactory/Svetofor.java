package Skillfactory;

public class Svetofor {
    int counter;
    public String color = "";

    public String changesColor() {
        counter += 1;
        if (counter == 1) {
            color = "green";
        } else if (counter == 2) {
            color = "yelov";
        } else if (counter == 3) {
            color = "red";
        } else if (counter == 4) {
            color = "yelov";
        }
        if (counter == 4) {
            counter = 0;
        }
        System.out.println(color);
        return color;
    }

    public void svetofor(String s) {
        switch (color) {
            case ("green"):
                System.out.println("можно ехать");
                break;
            case ("yelov"):
                System.out.println("подожди");
                break;
            case ("red"):
                System.out.println("стоять");
                break;
        }
    }
}

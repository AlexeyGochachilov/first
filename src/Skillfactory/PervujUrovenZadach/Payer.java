package Skillfactory.PervujUrovenZadach;

public class Payer {

    String surname;
    String name;
    String address;
    String cardNumber;

    Payer(String surname, String name, String address, String cardNumber){
        this.surname = surname;
        this.name = name;
        this.address = address;
        this.cardNumber = cardNumber;
    }

    public String toString(){
        String s;
        return s = "Payer: " + surname + " " + name + ", address: " + address + ", card: " + cardNumber;
    }

    public static void main(String[] args) {
        Payer p = new Payer("Gochachilov", "Alexey", "Moscow", "142587");
        System.out.println(p.toString());
    }
}

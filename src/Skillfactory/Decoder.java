package Skillfactory;

public class Decoder {

    public static void main(String[] args) {
        int variable = 7;
      variable = (variable > 10) ? (variable -= 10) : (variable += 10);

        System.out.println(variable);

        int i = 10;
        //Код писать здесь
        do {
            i--;
            System.out.println("Value i = " + i);
        } while (i>1);


        char ch1 = 'h';
        char ch2 = 'i';
        char ch3 = 'b';
        char ch4 = 'm';
        char ch5 = 'k';
        System.out.println(decode(ch1) + " " + decode(ch2) + " " + decode(ch3));
    }

    public static String decode(char ch) {
        String result;
        switch (ch) {
            case 'h':
                result = "Hello!";
                break;
            case 'i':
            case 'k':
            case 'm':
                result = "I can decode!";
                break;
            case 'b':
                result = "Bye!";
                break;
            default:
                result = "I don't know these symbols :(";
        }
        return result;
    }
}


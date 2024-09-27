package Skillfactory;

public class Str {

    public static void sravnenie(String a, String b) {
        if (a.equals(b) == true) {
            System.out.println("Имена одинаковввые");
        } else {
            System.out.println("Имена разные");
        }
    }

    public static void checkUserName(String a, String b) {
        if (a.equalsIgnoreCase(b) == true) {
            System.out.println("Выберите другое имя пользователя");
        } else {
            System.out.println("Отличное имя!");
            System.out.printf("Ваше имя имеет длину %d символов. " +
                    "А без пробелов ваше имя занимает %d символов", b.length(), b.replaceAll(" ", "").length());
        }
    }

    private static String removeWhiteSpaces(String str) {
        //Написать код здесь
        str = str.replaceAll(" ", "");
        return str;
    }

    private static boolean checkName(String name) {
        //Написать код здесь
        String s2 = " Ivan Ivanovich Ivanov ".trim();
        if (name.split(" ").length == s2.split(" ").length) {
            return true;
        } else {
            System.out.println("Введите имя ещё раз");
            return false;
        }
    }

    public static void main(String[] args) {
//        String s3 = " Ivan Ivanovich Ivanov ".trim();
//        String s1 = "Иван Иванов Иванович";
//        String s2 = "Ди иванов";
//        System.out.println(Arrays.toString(s3.split(" ")));
//        System.out.println(s3.split(" ").length);
//        System.out.println(s3.split(" ")[0].charAt(0));
//        char c = s3.split(" ")[0].charAt(0);
//        System.out.println(c);
//        String s01 = s3.split(" ")[0];

    }
}

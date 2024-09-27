package Skillfactory;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Str1 {
    public static void main(String[] args) {
        String s1 = new String("aba aba a!a abba adca abea");
        Pattern p = Pattern.compile("(ab)+");
        Matcher m = p.matcher(s1);
        while (m.find()) {
            int start = m.start();
            int end = m.end();
            System.out.println(s1.substring(start, end) + " " + start + ", " + end);
        }
    }
}

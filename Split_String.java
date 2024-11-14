package Practice.Assignment8;

import java.util.Arrays;

public class Split_String {

    public static String[] splitWords(String str) {
        return str.trim().split("\\s+");
    }

    public static void main(String[] args) {
        String str = "Java is fun";
        String[] words = splitWords(str);
        System.out.println("Words: " + Arrays.toString(words));
    }
}

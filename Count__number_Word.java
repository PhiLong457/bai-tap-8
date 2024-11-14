package Practice.Assignment8;

public class Count__number_Word {

    public static int countWords(String s) {

        if (s == null || s.trim().isEmpty()) {
            return 0;
        }

        String[] words = s.trim().split("\\s+");

        return words.length;
    }

    public static void main(String[] args) {
        System.out.println(countWords("Java is fun"));
        
    }
}

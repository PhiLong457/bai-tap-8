package Practice.Assignment8;

public class Longest_Word {

    public static String findLongestWord(String s) {

        if (s == null || s.trim().isEmpty()) {
            return "";
        }

        String[] words = s.trim().split("\\s+");

        String longestWord = "";

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord;
    }

    public static void main(String[] args) {

        System.out.println(findLongestWord("I love programming"));
    }
}

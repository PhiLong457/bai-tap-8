package Practice.Assignment8;

public class Count_Ocurrences {

    public static int countOccurrences(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "hello world";
        char ch = 'o';
        System.out.println("Occurrences of '" + ch + "': " + countOccurrences(str, ch));
    }
}

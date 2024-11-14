package Practice.Assignment8;

public class Remove_ExtraSpace {

    public static String removeExtraSpaces(String str) {
        return str.trim().replaceAll("\\s+", " ");
    }

    public static void main(String[] args) {
        String str = "   Hello    World   ";
        System.out.println("Without extra spaces: '" + removeExtraSpaces(str) + "'");
    }
}

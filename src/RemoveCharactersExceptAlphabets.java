import java.util.Scanner;

public class RemoveCharactersExceptAlphabets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String s = sc.next();
        System.out.println("Method 1: " + removeSpecialCharacters1(s));
        System.out.println("Method 2: " + removeSpecialCharacters2(s));
    }

    public static String removeSpecialCharacters1(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isAlphabetic(s.charAt(i)))
                sb.append(s.charAt(i));

        }
        return sb.toString();
    }

    public static String removeSpecialCharacters2(String s) {

        return s.replaceAll("[^a-zA-Z]", "");
    }
}

import java.util.Scanner;

public class ToggleString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s = sc.next();
        System.out.print("String after toggling: " + toggle(s));

    }

    public static String toggle(String s) {
        StringBuilder s1 = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isAlphabetic(s.charAt(i))) {
                if (Character.isUpperCase(s.charAt(i)))
                    s1.append(Character.toLowerCase(s.charAt(i)));
                else
                    s1.append(Character.toUpperCase(s.charAt(i)));
            } else
                s1.append(s.charAt(i));
        }
        return s1.toString();
    }
}

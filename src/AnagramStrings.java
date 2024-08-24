import java.util.Arrays;
import java.util.Scanner;

public class AnagramStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String 1 : ");
        String s1 = sc.next();
        System.out.print("Enter String 2 : ");
        String s2 = sc.next();
        System.out.println(isAnagramMethod1(s1, s2) ? "Anagrams" : "Not Anagrams");
        System.out.println(isAnagramMethod2(s1, s2) ? "Anagrams" : "Not Anagrams");
    }

    public static boolean isAnagramMethod1(String s1, String s2) {
        StringBuilder s2Copy = new StringBuilder(s2);

        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            boolean found = false;
            for (int j = 0; j < s2Copy.length(); j++) {
                if (s1.charAt(i) == s2Copy.charAt(j)) {
                    s2Copy.deleteCharAt(j);
                    found = true;
                    break;
                }
            }
            if (!found)
                return false;
        }
        return true;
    }

    public static boolean isAnagramMethod2(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        char[] array1 = s1.toCharArray();
        char[] array2 = s2.toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);
        return Arrays.equals(array1, array2);
    }
}

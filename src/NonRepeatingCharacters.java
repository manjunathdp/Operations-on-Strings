import java.util.Arrays;
import java.util.Scanner;

public class NonRepeatingCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String s = sc.next();
        findNonRepeatingCharacters(s);
    }

    public static void findNonRepeatingCharacters(String s) {
        int[] count = new int[s.length()];
        Arrays.fill(count, 1);
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    if (count[i] != 0)
                        count[i]++;
                    count[j] = 0;
                }

            }
        }
        System.out.print("non-repeating characters in a string: ");
        for (int i = 0; i < s.length(); i++) {
            if (count[i] == 0)
                System.out.print(s.charAt(i) + " ");
        }
    }
}

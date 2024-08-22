import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter valid String (a-z or A-Z): ");
        String s = sc.next();
        countVls(s);
    }

    public static void countVls(String s) {
        char[] vowels = {'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U'};
        int vCount = 0, iCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isAlphabetic(s.charAt(i))) {
                for (char vowel : vowels) {
                    if (s.charAt(i) == vowel) {
                        vCount++;
                        break;
                    }
                }
            } else iCount++;

        }
        System.out.println("Total: " + s.length());
        System.out.println("Vowels count: " + vCount);
        System.out.println("Invalid Character: " + iCount);
    }
}

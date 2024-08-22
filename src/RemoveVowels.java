import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String s = sc.next();
        System.out.println("String After Removing Vowels: " + removeVowels(s));
    }

    public static String removeVowels(String s) {
        char[] vowels = {'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U'};
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            boolean isVowel = false;
            char ch = s.charAt(i);
            for (char vowel : vowels) {
                if (ch == vowel) {
                    isVowel = true;
                    break;
                }
            }
            if (!isVowel)
                newStr.append(ch);
        }
        return newStr.toString();
    }
}


import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] vowels = {'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U'};
        boolean isVowel = false;
        System.out.print("Enter Single Character (a-z or A-Z): ");
        char ch = sc.next().charAt(0);
        if (ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122) {
            for (char vowel : vowels) {
                if (vowel == ch) {
                    isVowel = true;
                    break;
                }
            }
            if (isVowel)
                System.out.println(ch + " is a Vowel");
            else
                System.out.println(ch + " is a Consonant");
        } else
            System.out.println(ch + " is Invalid Character");
    }
}

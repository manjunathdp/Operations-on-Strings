import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String s = sc.next();
        System.out.println("Is " + s + " Palindrome: " + checkPalindrome(s));

    }

    public static boolean checkPalindrome(String s) {
        boolean isPalindrome = false;
        StringBuilder sb = new StringBuilder(s);
        if (s.contentEquals(sb.reverse()))
            isPalindrome = true;
        return isPalindrome;

    }

}

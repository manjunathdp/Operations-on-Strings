import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s = sc.next();
        System.out.println("Length of given String is: " + strLength(s));
    }

    public static int strLength(String s) {
        int length = 0;
        for (char ch : s.toCharArray())
            length++;
        return length;
    }
}

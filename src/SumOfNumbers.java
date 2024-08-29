import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String s = sc.next();
        System.out.println("Sum of all the digit present in String : " + sum(s));
    }

    public static int sum(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                sum = sum + Character.getNumericValue(ch);
            }
        }
        return sum;
    }
}

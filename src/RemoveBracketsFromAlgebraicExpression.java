import java.util.Scanner;

public class RemoveBracketsFromAlgebraicExpression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Expression : ");
        String s = sc.next();
        System.out.println("Expression without brackets: "+removeBrackets(s));
    }
    public static String removeBrackets(String s) {
        return s.replaceAll("[(){}]","");
    }
}

import java.util.Scanner;

public class CapitalizeFirstLastLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Sentence: ");
        String s = sc.nextLine();
        capitalize(s);
    }

    public static void capitalize(String s) {
        String[] words = s.split(" ");
        for (String word : words) {
            if(word.length()==1)
                System.out.print(word.toUpperCase()+" ");
            else
                System.out.print(word.toUpperCase().charAt(0) + word.substring(1, word.length() - 1) + word.toUpperCase().charAt(word.length() - 1) + " ");
        }
    }
}

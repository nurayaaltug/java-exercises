import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cümleyi Giriniz: ");
        String cumle = scanner.nextLine();

        if (isPalindrome(cumle)) {
            System.out.println("Bu cümle Palindromedur...");
        } else {
            System.out.println("Bu cümle Palindrom değildir...");
        }
    }

    public static boolean isPalindrome(String cumle) {
        Stack<Character> stack = new Stack<>();
        int length = cumle.length();

        for (int i = 0; i < length; i++) {
            stack.push(cumle.charAt(i));
        }

        for (int i = 0; i < length; i++) {
            if (cumle.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }

}

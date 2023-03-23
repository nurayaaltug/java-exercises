import java.util.*; 
import java.io.*;

class Main {

  public static String FirstReverse(String str) {
     StringBuilder sb = new StringBuilder(str);
     sb.reverse();
     return sb.toString();

    // code goes here  
  
  }

  public static void main (String[] args) {  
       Scanner s = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = s.nextLine();
        String result = FirstReverse(input);
        System.out.println("Reversed string: " + result);
    }

}

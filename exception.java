/************************************************************************************************************************
You are given an integer n, you have to convert it into a string.

Please complete the partially completed code in the editor. 
If your code successfully converts  into a string  the code will print "Good job". Otherwise it will print "Wrong answer".

n can range between  to  inclusive.
 ***********************************************************************************************************************/
import java.util.*;
import java.security.*;
public class Solution {
 public static void main(String[] args) {

  DoNotTerminate.forbidExit();

  try {
   Scanner in = new Scanner(System.in);
   int n = in .nextInt();
   in.close();
   //String s=???; Complete this line below

   //Write your code here
    if(n < -100 || n > 100) throw new DoNotTerminate.ExitTrappedException();

        String s = String.valueOf(n);

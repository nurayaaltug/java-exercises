/*************************************************************************************************
Have the function MathChallenge(num1,num2) take both parameters being passed and return the Greatest Common Factor. 
That is, return the greatest number that evenly goes into both numbers with no remainder.
For example: 12 and 16 both are divisible by 1, 2, and 4 so the output should be 4. The range for both parameters will be from 1 to 10^3.
*************************************************************************************************/
import java.util.*;
import java.io.*;

class Main {

    public static int MathChallenge(int num1, int num2) {
        int gcd = 1;
        int smallerNum = Math.min(num1, num2);
        for (int i = 1; i <= smallerNum; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
    public static void main (String[] args) {
          
        Scanner s = new Scanner(System.in);
        System.out.print(MathChallenge(s.nextLine()));
    }

}

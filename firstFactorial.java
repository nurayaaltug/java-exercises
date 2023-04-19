/*******************************************************************************************************************************************************
Have the function FirstFactorial(num) take the num parameter being passed and return the factorial of it. For example: if num = 4, then your program should return (4 * 3 * 2 * 1) = 24. For the test cases, the range will be between 1 and 18 and the input will always be an integer.
***********************************************************************************************************************************************************/
import java.util.*; 
import java.io.*;

class Main {

 public static int FirstFactorial(int num) {
    if (num == 1) {
        return 1;
    } else {
        return num * FirstFactorial(num - 1);
    }
}

  

  public static void main (String[] args) {  
      for (int i = 1; i <= 18; i++) {
        int result = FirstFactorial(i);
        System.out.println("Factorial of " + i + " is " + result);
    }
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(FirstFactorial(s.nextLine())); 
  }

}

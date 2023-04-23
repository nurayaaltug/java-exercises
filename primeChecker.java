/***************************************************************************************************************
You are given a class Solution and its main method in the editor. Your task is to create a class Prime. The class Prime should contain a single method checkPrime.

The locked code in the editor will call the checkPrime method with one or more integer arguments.
You should write the checkPrime method in such a way that the code prints only the prime numbers.

Please read the code given in the editor carefully. Also please do not use method overloading!

Note: You may get a compile time error in this problem due to the statement below:

  BufferedReader br=new BufferedReader(new InputStreamReader(in));
This was added intentionally, and you have to figure out a way to get rid of the error.

Input Format

There are only five lines of input, each containing one integer.

Output Format

There will be only four lines of output. Each line contains only prime numbers depending upon the parameters passed to checkPrime in the main method of the class Solution.
n case there is no prime number, then a blank line should be printed.
*************************************************************************************************************/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        

        Prime prime = new Prime();
        Scanner read = new Scanner(System.in);
        int [] numbers = new int[5];
        for(int i = 0 ; i < 5; i++){
            numbers[i]= read.nextInt();
        } 
        prime.checkPrime(numbers[numbers.length-5]);
        prime.checkPrime(numbers[numbers.length-5], numbers[numbers.length-4]);
        prime.checkPrime(numbers[numbers.length-5], 
        numbers[numbers.length-4], numbers[numbers.length-3]);
        prime.checkPrime(numbers[numbers.length-5], 
        numbers[numbers.length-4], numbers[numbers.length-3], 
        numbers[numbers.length-2], numbers[numbers.length-1]);
        read.close();
        }
}

class Prime{
    public void checkPrime(Integer... numbers){
       for(int i = 0 ; i < numbers.length ; i++){
           if(isPrime(numbers[i])){
               System.out.print(numbers[i]+" ");
           }
       }
       System.out.println();
    }
    
    public boolean isPrime(int num){
        if(num<2 || num%2==0 && num!=2){
            return false;
        }else if(num==2){
            return true;
        }
        int sqrt = (int) Math.sqrt(num);
        for (int i = 3; i <= sqrt; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    }

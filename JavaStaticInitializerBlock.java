/********************************************************************************************************************************************
Static initialization blocks are executed when the class is loaded, and you can initialize static variables in those blocks.

It's time to test your knowledge of Static initialization blocks. You can read about it here.

You are given a class Solution with a main method. 
Complete the given code so that it outputs the area of a parallelogram with breadth  and height . You should read the variables from the standard input.

If  or  , the output should be "java.lang.Exception: Breadth and height must be positive" without quotes.

Input Format

There are two lines of input. The first line contains : the breadth of the parallelogram. The next line contains : the height of the parallelogram.

Output Format

If both values are greater than zero, then the main method must output the area of the parallelogram. 
Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.
************************************************************************************************************************************************/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner STDIN=new Scanner(System.in);
        int height=STDIN.nextInt();
        int breadth=STDIN.nextInt();
        String sms="Breadth and height must be positive";
        try{
            Exception e=new Exception(sms);
            if(height>0 && breadth>0){
        int STDOUT=height*breadth;
        System.out.println(STDOUT);    
        }else throw e;
        }catch(Exception e){
            System.out.println(e.toString());   
        }
    }
}

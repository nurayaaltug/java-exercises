/***********************************************************************************************************************
Generic methods are a very efficient way to handle multiple datatypes using a single method. 
This problem will test your knowledge on Java Generic methods.

Let's say you have an integer array and a string array. You have to write a single method printArray that can print all the elements of both arrays.
The method should be able to accept both integer arrays or string arrays.
************************************************************************************************************************/
import java.io.*;
import java.util.*;


public class Solution {
    public static <E> void printArray(E[] inputArray) {
        for (E element : inputArray) {
            System.out.println(element);
        }
    }

    public static void main(String args[]) {
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"Hello", "World"};

        printArray(intArray);
        printArray(stringArray);
    }
}

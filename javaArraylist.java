import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        ArrayList<ArrayList<Integer>> l = new ArrayList<>();

        for(int i=0;i<n;i++){
            ArrayList<Integer> temp = new ArrayList<>();
            int d=in.nextInt();
            for(int x=0;x<d;x++){
                temp.add(in.nextInt());
            }
            l.add(temp);  
        }
        
        int q=in.nextInt();
        for(int i =0;i<q;i++){
            int a=in.nextInt();
            int b=in.nextInt();
            try{
                 System.out.println(l.get(a-1).get(b-1));
            }catch(Exception e){
                 System.out.println("ERROR!");
            }
   
        }
        in.close();
    }
}

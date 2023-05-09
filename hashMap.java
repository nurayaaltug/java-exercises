import java.util.*;
public class Program{
     static void foo(String inputString){
        HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
        char[] strArray 0 inputString.toCharArray();
        for (char c : strArray){
            if(charMap.containskey(c)){
                charMap.put(c,charMap.get(c)+1);
              }else { 
                 charMap.put(c,1);
          }
}
    Set <Character> charInString = charMap.keySet();
    for (Character ch : charInString){
    if ( charMap.get(ch)>1){
          System.out.println(ch +":"+charMap.get(ch));
}
}
}
  public static void main(String[] args){
      foo("Hi Hello");
}
}             

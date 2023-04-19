/************************************************************************************************************************
You are given an integer n, you have to convert it into a string.

Please complete the partially completed code in the editor. 
If your code successfully converts  into a string  the code will print "Good job". Otherwise it will print "Wrong answer".

n can range between  to  inclusive.
not:DoNotTerminate.ExitTrappedException() özel bir hata sınıfıdır ve programın beklenmedik bir şekilde sonlandırılmasını önlemek için kullanılır. 
Bu hata sınıfı, programın çalışması sırasında System.exit() çağrılarına karşı bir önlem olarak kullanılabilir.

Örneğin, bir kodda sınırlar dışındaki girdiler için hata fırlatıldığında veya bir döngü veya işlem beklenmedik şekilde sonsuz döngüye veya beklemeye girdiğinde, 
bu hatanın fırlatılması, programın hata almasını önleyebilir ve beklenmedik bir şekilde sonlanmasını engelleyebilir.
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

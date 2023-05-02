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
/***********************************************************************************************************************************************
Kod, öncelikle kullanıcıdan girdi olarak bir tamsayı ('n') alır.
Bu tamsayı, iç içe geçmiş listelerin (ArrayList of ArrayList) kaç adet olacağını belirler. 
Daha sonra, 'n' kez dönen bir döngü oluşturulur ve her adımda kullanıcıdan bir tamsayı daha istenir ('d'). 
Bu tamsayı, bir iç liste oluşturmak için kullanılır. Daha sonra, 'd' kez dönen bir başka döngü oluşturulur ve her adımda kullanıcıdan bir tamsayı daha istenir. 
Bu tamsayı, önceki döngü adımında oluşturulan iç listeye eklenir. Bu işlem, 'd' kez tekrarlanır ve iç liste tamamlanır. 
Daha sonra, bu iç liste, ana liste olarak adlandırılan bir dizi listeye eklenir. Bu işlem, 'n' kez tekrarlanarak iç içe geçmiş listeler tamamlanır.

Daha sonra, kullanıcıdan bir tamsayı daha istenir ('q').
Bu tamsayı, kodun sorgu sayısını belirler. 'q' kez dönen bir döngü oluşturulur ve her adımda kullanıcıdan iki tamsayı daha istenir ('a' ve 'b').
Bu tamsayılar, iç içe geçmiş listelerde bulunan bir öğeyi belirlemek için kullanılır. 
Örneğin, eğer 'a' 2 ve 'b' 3 ise, bu, ana listenin 2. elemanının iç listesinin 3. elemanına denk gelir.


Ardından, kod, try-catch bloğu içinde işlem yapar. Eğer belirtilen öğe bulunursa, öğenin değeri ekrana yazdırılır.
Aksi takdirde, bir hata mesajı ("ERROR!") yazdırılır.
*******************************************************************************************************************************************************/
En son olarak, 'Scanner' sınıfındaki 'in' nesnesi kapatılır. Bu, programın klavyeden veri girişi için kullanılan kaynağı serbest bırakmasını sağlar.

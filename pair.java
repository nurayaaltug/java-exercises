/***********************************************************************************************************************
You are given N numbers on aa circle, described by an array A. Fiind the maximum number of neighbouring pairs whose sums are even. 
One element can belong to only one pair. 
EX:  
1.Given A= [4,2,5,8,7,3,7], the function should return 2. WE can create two pairs with even sums: 
(A[0], A[1] and (A[4], A[5]). Another way to choose two pairs is: (A[0], A[1]) and (A[5], A[6]).
2. Given A= [14,21,16,35,22]  the function should return 1. There is only one qualifying pair (A[0], A[4]).
************************************************************************************************************************/
class Solution {
   public int solution(int [] A){
   int temp2=0;
        long temp1;
        for(int i=0;i<A.length;i++) {

            if(i==A.length-1) {
                temp1=A[i]+A[0];
                if(temp1%2==0) {
                    temp2++;
                    i++;
                }
            }

            else {

                temp1=A[i]+A[i+1];
                if(temp1%2==0) {
                    temp2++;
                    i++;
                }
            }
        }return temp2;


        }
        }

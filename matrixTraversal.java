/**************************************************DESCRIPTION EXERCISES*****************************************************
Given a 4*4 matrix mat, the initial energy is 100. The tasks is to reach the last row of the matrix with the maximum possible energy left. 
 The matrix can be traversed in the following way:
 1. Start with any cell in the first row.
 2. In each move, traverse from cell(i,j) of the 1th row and jth column to any existing cell out (i+1,j-1), (i+1,j) or (i+1,j+1).
 3.Finish the traversal in the last row.
 After stepping on a cell, (i,j) energy decreases by mat[i][j] units. Find the maximum possible energy left at the end the traversal. 
 Note:The final energy can be negative.
 ***********************************************************************************************************************************/
#include <iostream>

using namespace std;

int maxEnergy(int mat[4][4]){

    for(int i=2; i >= 0; i--){

        for(int j = 0; j < 4 ; j++){
            if(j == 0){

                if(mat[i+1][j] < mat[i+1][j+1]){
                    mat[i][j] = mat[i][j] + mat[i+1][j];
                }
                else {
                    mat[i][j] = mat[i][j] + mat[i+1][j+1];
                }
            }
            else if(j == 3){

                if(mat[i+1][j-1] < mat[i+1][j]){
                    mat[i][j] = mat[i][j] + mat[i+1][j-1];
                }
                else {
                    mat[i][j] = mat[i][j] + mat[i+1][j];
                }

            }
            else{

                if(mat[i+1][j-1] < mat[i+1][j]){
                    if(mat[i+1][j-1] < mat[i+1][j+1]){
                        mat[i][j] = mat[i][j] + mat[i+1][j-1];
                    }
                    else{
                        mat[i][j] = mat[i][j] + mat[i+1][j+1];
                    }
                }
                else {
                    if(mat[i+1][j] < mat[i+1][j+1]){
                        mat[i][j] = mat[i][j] + mat[i+1][j];
                    }
                    else{
                        mat[i][j] = mat[i][j] + mat[i+1][j+1];
                    }
                }

            }
        }
    }

    int maxE = 100 - mat[0][0];

    for(int i = 1; i < 4; i++){
        if(100 - mat[0][i] > maxE){
            maxE = 100 - mat[0][i];
        }
    }

    return maxE;
}

int main(){
    int mat[4][4] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
    cout << maxEnergy(mat) << endl;
    return 0;

}

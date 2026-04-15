class Solution {
    public void setZeroes(int[][] matrix) {

     int row_zero = 1, col_zero =1;

     for(int i = 0; i <matrix[0].length ; i++){
        if(matrix[0][i]==0) row_zero =0;
     } 

     for(int i = 0; i <matrix.length ; i++){
        if(matrix[i][0]==0) col_zero =0;
     }     
    
    for(int i = 1; i <matrix.length ; i++){
        for(int j = 1; j <matrix[0].length ; j++){
            if(matrix[i][j] ==0){
                matrix[0][j] = 0;
                matrix[i][0] = 0;
            }
        }
    }

    for(int i = 1; i <matrix.length ; i++){

        for(int j = 1; j <matrix[0].length ; j++){
            if(matrix[i][0] ==0  || matrix[0][j] ==0){
                matrix[i][j] = 0;
            }
        }
    }

if(row_zero==0){
for(int i = 0; i <matrix[0].length ; i++){
         matrix[0][i] =0;
     }
}
     
if(col_zero==0) {
      for(int i = 0; i <matrix.length ; i++){
        matrix[i][0] =0;
     }
}     




    }
}

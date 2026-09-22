class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[]  arr = new int[2];
        int count =0;
          for(int i =0; i< mat.length;i++){
            for (int j =0; j< mat[0].length;j++){
               if(mat[i][j]==1){
                 count ++;

               }
             
            }
              if(arr[1]<count){
                arr[1]= count;
                arr[0]=i;
                count = 0;
               }else{
                count =0;
               }
          }
return arr;

    }
}